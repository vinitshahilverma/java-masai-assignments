package com.masai.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.CartException;
import com.masai.exception.CoustmerException;
import com.masai.exception.ItemException;
import com.masai.model.Coustmer;
import com.masai.model.FoodCart;
import com.masai.model.Item;
import com.masai.repository.CartRepo;
import com.masai.repository.CoustmerRepo;
import com.masai.repository.ItemRepo;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartRepo cRepo;

	

	@Autowired
	private ItemRepo iRepo;

	@Override
	public FoodCart addFoodCart(FoodCart cart) throws CartException {

		if (cart == null) {
			throw new CartException("Please Enter valid Input");
		}

		FoodCart fcart = cRepo.save(cart);

		return fcart;

	}

	@Override
	public FoodCart addItemToFoodCart(Integer id, Item item) throws ItemException, CartException {

		FoodCart cart = cRepo.findById(id).orElseThrow(() -> new CartException("Cart not Found...."));

		if (item != null) {

			cart.getList().add(item);

			FoodCart c1 = cRepo.save(cart);

			return c1;
		} else
			throw new ItemException("Item not found.....");

	}

	@Override
	public FoodCart increaseQuantity(Integer id, Item item, Integer quantity) throws ItemException, CartException {

		FoodCart cart = cRepo.findById(id).orElseThrow(() -> new CartException("Cart not Found...."));

		List<Item> list = cart.getList();

		if (list.size() == 0) {
			throw new ItemException("No item found....");
		}

		for (Item i : list) {

			if (i.getItemId() == item.getItemId()) {

				Double cost = i.getCost() / i.getQuantity();

				i.setCost(cost * (i.getQuantity() + quantity));

				i.setQuantity(i.getQuantity() + quantity);

			}

		}

		FoodCart fcart = cRepo.save(cart);

		return fcart;

	}

	@Override
	public FoodCart reduceQuantity(Integer id, Item item, Integer quantity) throws ItemException, CartException {

		FoodCart cart = cRepo.findById(id).orElseThrow(() -> new CartException("Cart not Found...."));

		List<Item> list = cart.getList();

		if (list.size() == 0) {
			throw new ItemException("No item found....");
		}

		for (Item i : list) {

			if (i.getItemId() == item.getItemId()) {

				Double cost = i.getCost() / i.getQuantity();

				i.setCost(cost * (i.getQuantity() - quantity));

				i.setQuantity(i.getQuantity() - quantity);

			}

		}

		FoodCart fcart = cRepo.save(cart);

		return fcart;

	}

	@Override
	public FoodCart removeItemFormCart(Integer id, Item item) throws ItemException, CartException {
		
		
		FoodCart cart = cRepo.findById(id).orElseThrow(() -> new CartException("Cart not Found...."));

		List<Item> list = new ArrayList<>();
				
				list = cart.getList();
		
		if (list.size() == 0) {
			throw new ItemException("No item found....");
		}
		
		
		boolean flag = list.removeIf(l -> l.getItemId()==item.getItemId());
     
		if(flag==true) {
		FoodCart fcart = cRepo.save(cart);

		return fcart;
	   }
		
		else throw new ItemException("Item not removed..");
	}

	@Override
	public FoodCart deleteCart(FoodCart cart) throws CartException {
		
		FoodCart cart1 = cRepo.findById(cart.getCartId()).orElseThrow(() -> new CartException("Cart not Found...."));
		
		cRepo.delete(cart1);
		
		return cart1;
		 
	}

}

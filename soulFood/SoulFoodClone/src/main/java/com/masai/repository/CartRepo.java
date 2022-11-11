package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.masai.model.FoodCart;
@Repository
public interface CartRepo extends JpaRepository<FoodCart, Integer>{
	
//	@Query("Select f.cartId from FoodCart f where f.coustmerId")
//	public Integer getCartByCoustmerId(Integer custId);

}

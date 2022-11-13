package com.masai.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.model.Coustmer;
import com.masai.model.FoodCart;
@Repository
public interface CartRepo extends JpaRepository<FoodCart, Integer>{
	


}

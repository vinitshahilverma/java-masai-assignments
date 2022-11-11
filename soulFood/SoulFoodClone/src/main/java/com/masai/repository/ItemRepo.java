package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Item;

@Repository
public interface ItemRepo extends JpaRepository<Item, Integer>{
	
 
}

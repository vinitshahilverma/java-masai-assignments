package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person, Integer>{
	
      public Person findByEmail(String email);

}

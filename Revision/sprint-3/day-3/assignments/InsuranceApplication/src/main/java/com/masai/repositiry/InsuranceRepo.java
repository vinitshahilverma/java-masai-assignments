package com.masai.repositiry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.InsurancePolicy;

@Repository
public interface InsuranceRepo extends JpaRepository<InsurancePolicy, Long> {
	

}

package com.masai.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.model.Bill;

@Repository
public interface BillRepo extends JpaRepository<Bill, Integer>{
	
	@Query("from Bill where billDate<=?1 and billDate>=?2")
	public List<Bill> getBillByDate(LocalDate startDate,LocalDate endDate);
	
	@Query("Select b from Bill b where orderid=?1")
	public Bill getBillByOrderId(Integer id);

}

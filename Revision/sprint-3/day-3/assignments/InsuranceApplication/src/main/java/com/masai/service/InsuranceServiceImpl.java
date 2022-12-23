package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.masai.exception.InsuranceException;
import com.masai.model.InsurancePolicy;
import com.masai.repositiry.InsuranceRepo;

@Service
public class InsuranceServiceImpl implements InsuranceService{
	
	@Autowired
	private InsuranceRepo iRepo;

	@Override
	public List<InsurancePolicy> getAllInsurance() throws InsuranceException {
		
		List<InsurancePolicy> list = iRepo.findAll();
		
		if(list.size()==0) throw new InsuranceException("No Insurance found...");
		
		else
		return list;
	}

	@Override
	public InsurancePolicy getInsurancePolicyById(Long id) throws InsuranceException {
		
		InsurancePolicy ip = iRepo.findById(id)
				                  .orElseThrow(() -> new InsuranceException("No Insurance found..."));
		
		return ip;
	}

	@Override
	public InsurancePolicy updateInsurancePolicy(Long id, InsurancePolicy ip) throws InsuranceException {
		
		InsurancePolicy ip1 = iRepo.findById(id)
                .orElseThrow(() -> new InsuranceException("No Insurance found..."));
		
		ip.setId(id);
		
		InsurancePolicy ip2 = iRepo.save(ip);
		
		return ip2;
	}

	@Override
	public InsurancePolicy deleteInsurancePolicy(Long id) throws InsuranceException {
		
		InsurancePolicy ip1 = iRepo.findById(id)
                .orElseThrow(() -> new InsuranceException("No Insurance found..."));
		
		iRepo.delete(ip1);
		
		return ip1;
	}

	@Override
	public InsurancePolicy addInsurancePolicy(InsurancePolicy ip) throws InsuranceException {
		
		if(ip!=null) {
			InsurancePolicy ip1 = iRepo.save(ip);
			return ip1;
		}
		
		else throw new InsuranceException("No Insurance found...");
	}

}

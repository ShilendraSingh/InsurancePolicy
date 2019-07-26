package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Policy;
import com.example.demo.repository.PolicyRepository;

@Service
public class PolicyServiceImpl implements PolicyService {
	
	@Autowired
	private PolicyRepository policyrepository;

	@Override
	public List<Policy> PolicyList() {
		
		List<Policy> listPolicy=policyrepository.findAll();
		
		return listPolicy;
	}

	@Override
	public Policy Policydetails(int id) {
		
		Policy poly=null;
	Optional<Policy> policy=	policyrepository.findById(id);
	if(policy.isPresent())
	{
		poly=policy.get();
	}
		
		return poly;
	}
	

}

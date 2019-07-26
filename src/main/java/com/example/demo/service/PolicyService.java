package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Policy;

public interface PolicyService {
	
	public List<Policy> PolicyList();
	public Policy Policydetails(int id);
	

}

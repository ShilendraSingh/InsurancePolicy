package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Policy;
import com.example.demo.service.PolicyService;

@RestController
@RequestMapping("/Insurance")
public class PolicyController {

	@Autowired
	private PolicyService policyservice;
	
	@GetMapping("/policyList")
	public List<Policy> getPolicyList()
	{
		List<Policy> listPlo=policyservice.PolicyList();
		return listPlo;
	}
	
	
	@GetMapping("/policydetail/{id}")
	public Policy getPolicyDet(@PathVariable int id)
	{
		Policy listPlo=policyservice.Policydetails(id);
		return listPlo;
	}
	
	
}

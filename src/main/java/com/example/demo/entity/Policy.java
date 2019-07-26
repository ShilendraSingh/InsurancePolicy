package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Policy {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int policyId;
	private String policyName;
	private float policyPrice;
	private int policyTenure;
	private String policyDescription;
	
	public int getPolicyId() {
		return policyId;
	}
	
	
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public float getPolicyPrice() {
		return policyPrice;
	}
	public void setPolicyPrice(float policyPrice) {
		this.policyPrice = policyPrice;
	}
	public String getPolicyDescription() {
		return policyDescription;
	}


	public void setPolicyDescription(String policyDescription) {
		this.policyDescription = policyDescription;
	}


	public int getPolicyTenure() {
		return policyTenure;
	}
	public void setPolicyTenure(int policyTenure) {
		this.policyTenure = policyTenure;
	}

}

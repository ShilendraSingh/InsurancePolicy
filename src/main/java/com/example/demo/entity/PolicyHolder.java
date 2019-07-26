package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class PolicyHolder {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int policyId;
	private String pHolderName;
	private int pHolderAge;
	private int pHolderMobileNumber;
	private String policyName;
	
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getpHolderName() {
		return pHolderName;
	}
	public void setpHolderName(String pHolderName) {
		this.pHolderName = pHolderName;
	}
	public int getpHolderAge() {
		return pHolderAge;
	}
	public void setpHolderAge(int pHolderAge) {
		this.pHolderAge = pHolderAge;
	}
	public int getpHolderMobileNumber() {
		return pHolderMobileNumber;
	}
	public void setpHolderMobileNumber(int pHolderMobileNumber) {
		this.pHolderMobileNumber = pHolderMobileNumber;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	
	
}

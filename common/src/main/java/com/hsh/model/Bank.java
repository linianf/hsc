package com.hsh.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank {

	@Id
	private int  id;
	
	private String bankName;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

}

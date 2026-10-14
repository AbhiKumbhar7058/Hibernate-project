package com.entity;

import javax.persistence.Entity;

@Entity
public class Cheque extends Payment {

	private int chequeNo;

	private String chequeType;

	public int getChequeNo() {
		return chequeNo;
	}

	public void setChequeNo(int chequeNo) {
		this.chequeNo = chequeNo;
	}

	public String getChequeType() {
		return chequeType;
	}

	public void setChequeType(String chequeType) {
		this.chequeType = chequeType;
	}
}
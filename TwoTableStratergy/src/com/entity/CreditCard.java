package com.entity;

import javax.persistence.Entity;

@Entity
public class CreditCard extends Payment {
	private int cardNum;
	private String cardType;

	public int getCardNum() {
		return cardNum;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(int cardNum, String cardType) {
		this.cardNum = cardNum;
		this.cardType = cardType;
	}
}
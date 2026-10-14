package com.entity;

import java.time.LocalDate;

import javax.persistence.*;

@Entity

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class Payment {

	@Id
	private int payId;

	private double payAmt;

	private LocalDate payDate;

	public int getPayId() {
		return payId;
	}

	public void setPayId(int payId) {
		this.payId = payId;
	}

	public double getPayAmt() {
		return payAmt;
	}

	public void setPayAmt(double payAmt) {
		this.payAmt = payAmt;
	}

	public LocalDate getPayDate() {
		return payDate;
	}

	public void setPayDate(LocalDate payDate) {
		this.payDate = payDate;
	}
}
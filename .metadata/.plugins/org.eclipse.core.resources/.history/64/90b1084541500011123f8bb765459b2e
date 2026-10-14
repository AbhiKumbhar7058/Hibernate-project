package com.app;

import java.time.LocalDate;

import com.dao.PaymentDAOImpl;
import com.dao.PaymentDao;
import com.entity.Cheque;
import com.entity.CreditCard;

public class App {

	public static void main(String[] args) {
		
		PaymentDao dao = new PaymentDAOImpl();
		
		CreditCard card = new CreditCard();
		card.setPayAmt(50000);
		
		card.setPayDate(LocalDate.of(2026, 05, 15));
		dao.saveCredicard(card);
		
		 Cheque  cheque = new Cheque();

	        cheque.setChequeNo(45678);

	        cheque.setChequeType("open");

	        cheque.setPayAmt(25000);

	        cheque.setPayDate(LocalDate.of(2026, 05, 15));

	        dao.saveCheque(cheque);
	}
	
}
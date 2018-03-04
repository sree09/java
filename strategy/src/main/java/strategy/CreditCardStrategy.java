package strategy;

import java.util.Date;

public class CreditCardStrategy implements PaymentStrategy {
	private String name;
	private String number;
	private String cvv;
	private String expiryDate;
	
	
	public CreditCardStrategy(String name, String number, String cvv, String expiryDate) {
		this.name = name;
		this.number = number;
		this.cvv = cvv;
		this.expiryDate = expiryDate;
	}

public void pay(int amount) {
		System.out.println("The amount "+amount+"$ paid with CreditCard");
	}

}

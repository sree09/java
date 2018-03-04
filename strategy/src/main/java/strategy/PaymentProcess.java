package strategy;

import java.util.ArrayList;

public class PaymentProcess {
	int total;

	public PaymentProcess(int total) {
		this.total = total;
	}
	public void pay(PaymentStrategy paymentMethod){
		paymentMethod.pay(total);
	}

}

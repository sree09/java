package strategy;

import java.util.ArrayList;

public class PaymentStrategyClient {
public PaymentStrategyClient() {
	
}
	public static void main(String[] args) {
		ArrayList<Product> cart = new ArrayList<Product>();
		Product product1 = new Product("product1",10);
		Product product2 = new Product("product2",20);
		Product product3 = new Product("product3",30);
		Product product4 = new Product("product4",40);
		cart.add(product1);
		cart.add(product2);
		cart.add(product3);
		cart.add(product4);
		int total =0;
		for(Product product:cart){
			total+=product.getPrice();
		}
		PaymentProcess pp= new PaymentProcess(total);
		//Paying with Credit Card
		pp.pay(new CreditCardStrategy("user1", "1234567890987654", "321", "01/23"));
		//Paying with Net Banking
		pp.pay(new NetBankingStartegy("user1", "password"));
		//Paying with Gift Card
		pp.pay(new GiftCardStrategy("11111111111"));
	}

}

package strategy;

public class GiftCardStrategy implements PaymentStrategy {
	String cardNumber;
	
	public GiftCardStrategy(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public void pay(int amount) {
		System.out.println("The amount "+amount+"$ paid with GiftCard");
	}

}

package template;

public class OnlineOrder extends OrderProcessTemplate{
public void doSelect() {
	System.out.println("Please select items");
	System.out.println("Selected Items added to cart");
}
public void doPayment() {
		System.out.println("Please select payment type Credit/Debit/NetBanking/GiftCard");
		System.out.println("Payment Processed");
	}
public void doDelivery() {
		System.out.println("Please Enter Delivery Address");
		System.out.println("Items Shipped");
	}
}

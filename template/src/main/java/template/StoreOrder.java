package template;

public class StoreOrder extends OrderProcessTemplate{
	public void doSelect() {
		System.out.println("Please select itemsfrom shelf and add to cart");
	}
	public void doPayment() {
		System.out.println("Please select checkout type Self/Counter");
		System.out.println("pleas pay through Cash/POC");
		System.out.println("Payment Successful");
	}
	public void doDelivery() {
		System.out.println("Items handed to customer");
	}
}
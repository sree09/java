package template;

public abstract class OrderProcessTemplate {

	public abstract void doSelect();
	public abstract void doPayment();
	public abstract void doDelivery();
	public final void processOrder() {
		doSelect();
		doPayment();
		doDelivery();
	}
	
}

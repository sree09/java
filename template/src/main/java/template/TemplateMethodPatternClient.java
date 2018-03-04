package template;

public class TemplateMethodPatternClient {

	public static void main(String[] args) {

		OrderProcessTemplate onlineOrder = new OnlineOrder();
		System.out.println("Processing online Order");
		System.out.println("--------------------------");
		onlineOrder.processOrder();
		System.out.println("\n");
		OrderProcessTemplate storeOrder = new StoreOrder();
		System.out.println("Processing store order");
		System.out.println("--------------------------");
		storeOrder.processOrder();
	}

}

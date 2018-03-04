package creditcard;

public class CrediCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		System.out.println("Enter credit card number to process payment");
		float amount = 500.0f;
		ProcessPayment.processPay(number,amount);
	}

}

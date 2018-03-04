package strategy;

public class NetBankingStartegy implements PaymentStrategy {
	String userID;
	String password;

	public NetBankingStartegy(String userID, String password) {
		this.userID = userID;
		this.password = password;
	}

	public void pay(int amount) {
		System.out.println("The amount "+amount+"$ paid with NetBanking");
	}
}

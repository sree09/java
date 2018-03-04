package creditcard;

public class CreditBean {
	private int number;
	private int pin;
	private float balance;
	
	public CreditBean() {
		
	}
	public CreditBean(int number, int pin, float balance) {
		super();
		this.number = number;
		this.pin = pin;
		this.balance = balance;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
}

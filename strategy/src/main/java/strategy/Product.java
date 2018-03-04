package strategy;

public class Product {
	private String productName;
	private int price;
	
	public Product(String productName, int price){
		this.productName=productName;
		this.price=price;
	}

	public String getProduct() {
		return productName;
	}

	public int getPrice() {
		return price;
	}
}

package products;

public class Product {

	
	// instance data members. instance is nothing but an object.
	// instance variables will be initialized at time of creating an object of a class. or calling new ClassName();
	float price;
	int quantity;	
	String productName,seller,warrenty;
	
	
	
	// static values are for storing fix information which could be accessible without creating an object.
	// these are initilized at time of loading class in jvm.
	public static String deliveryTime="3days";
	
	
	
	
	public Product()
	{
		productName = "iphone 14";
		price = 150000.50f;
		seller = "Some Mobile Store";
		warrenty = "1 year ";
		quantity = 500;
	}

	public Product(float price, int quantity, String productName, String seller, String warrenty) {
		super();
		this.price = price;
		this.quantity = quantity;
		this.productName = productName;
		this.seller = seller;
		this.warrenty = warrenty;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public String getWarrenty() {
		return warrenty;
	}

	public void setWarrenty(String warrenty) {
		this.warrenty = warrenty;
	}

	public static String getDeliveryTime() {
		
		return deliveryTime;
	}

	public static void setDeliveryTime(String deliveryTime) {
		Product.deliveryTime = deliveryTime;
	}

	@Override
	public String toString() {
		return "Product [price=" + price + ", quantity=" + quantity + ", productName=" + productName + ", seller="
				+ seller + ", warrenty=" + warrenty + "]";
	}
	

	
	
}

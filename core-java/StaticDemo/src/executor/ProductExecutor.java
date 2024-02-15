package executor;

import products.Product;

public class ProductExecutor {

	public static void main(String[] args) {
		

			
		String info=Product.deliveryTime;
		String info1= Product.getDeliveryTime();
		
		System.out.println(info);
		System.out.println(info1);
		
		

		Product p1;   // declare an object of a Product class.
		p1=new Product();  // here we initialized / created object.
		p1.getPrice();
		
		p1.getDeliveryTime();  // we can call static method w.r.t.object of a class.
		
		//Product.getProductName() // we cannot call like this.
		
	}

}

package executor;

import products.Product;

public class StaticMethodCalling {

	
	
	
	
	public static void main(String[] args) {
		
	
		
		//Scenario 1.....
		//one static method can call other static method directly provided both are in same class.. 
		// i.e. we don't need object to call methods in same class.
		A();
		//B();
		//we cannot call instance method of SameClass from static method...		
		//C();
		//D();
		//instance method of SameClass can be called w.r.t. SameClass Object.
		StaticMethodCalling smc=new StaticMethodCalling();
		smc.C();
		
		//static method of OtherClass can be called w.r.t. ClassName.methodName()
		String deliveryTime=Product.getDeliveryTime();
		
		//static method of OtherClass can be called w.r.t. Other Class Object.
		
		Product p=new Product();
		System.out.println(p.getProductName());
			
		
		
	}

	public static void A()
	{
		B();
		System.out.println("i am in A method...");
	}
	
	public static void B()
	{
	
		System.out.println("i am in B method....");
	}
	
	
	public void C()
	{
		D();
	 System.out.println("i am in C method.....");	
	}
	
	public void D()
	{
	 System.out.println("i am in D method.....");	
	}
	
}

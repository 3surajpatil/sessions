//package derived;
package derived;

import base.A;

public class B extends A {
	
	int j;

	
	public B()
	{
		super(10);
		System.out.println("i am in Default constructor of B class....");
		j=200;
		
	}
	
	public B(int j)
	{
		super(1000);
		System.out.println("i am in single parma constuctor of B Class....");
		this.j=j;
		
		
	}
	
	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}
	

}

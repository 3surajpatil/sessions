package derived;

import base.BaseClass;

public class DerivedClass extends BaseClass{

	
	@Override
	public void sum(int i, int j)
	{
		// sice derived class cannot call base class orignal method w.r.t. object , we can call orignal method with help  of super.methodname.
		  
		 System.out.println("int value sum in derived class...===================>"+(i+j)) ;
		 super.sum(i,j);
		
	}
	
	
	public void sum(double i, double j)
	{
		System.out.println("double value sum is := "+(i+j));
	}
	
	
	
	
}

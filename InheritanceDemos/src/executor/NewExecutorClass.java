package executor;

import base.NewBaseClass;
import derived.NewDerivedClass;

public class NewExecutorClass {

	public static void main(String[] args) {
		
		
		//NewBaseClass nbc =new NewBaseClass();		
		//nbc.m1();
		
		//NewBaseClass nbc = new NewDerivedClass();
		//nbc.m1();
		
		
		NewDerivedClass ndc= new NewDerivedClass();
		
		ndc.m1();
		ndc.m2();
		
		NewDerivedClass ndc1= (NewDerivedClass) new NewBaseClass();  // type casting
		ndc1.m1();
		ndc1.m2();
		

	}

}

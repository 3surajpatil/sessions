package executor;

import derived.DerivedClass;

public class OverloadingOverridingExecutor {

	public static void main(String[] args) {
		
		
		
		DerivedClass dc=new DerivedClass();
		
		dc.sum(1.1, 1.1);
		dc.sum(2.2f, 2.2f);
		
		dc.sum(0, 0);
		
	
		

	}

}

//package executor;
package executor;

import base.A;
import derived.B;

public class InheritanceDemo1 {

	public static void main(String[] args) {
		

		    A a=new A();
			B b=new B();
			//B b1=new B(20);
			

			A a1 = (A) new B();
			
	
			System.out.println(a1.getI()+" "+a1.getJ());
			
			
			
			
			
		
	}

}

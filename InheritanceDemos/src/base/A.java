//package base;
package base;

public class A {

	
		int i;

		public A()
		{
			System.out.println("i am in default constructor of A class....");
			i=100;
			
		}
		
		
		public A(int input_i)
		{
			System.out.println("i am in single param constructor of A Class....");
			this.i=input_i;
		}
		
		public int getI() {
			return i;
		}

		public void setI(int i) {
			this.i = i;
		}
		
		
	
}

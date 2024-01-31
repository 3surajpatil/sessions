package executor;

import calc.Calculator;


public class ConstructorDemo1 {

	public static void main(String[] args) {
		
		Calculator cal=new Calculator();

		cal.printOutput();
		cal.sum();
		cal.printOutput();
		cal.sum(5, 4);
		//cal.sum(5,4.2);
		
		Calculator cal1=new Calculator(11,22);
		cal1.sum();
		cal1.printOutput();
	}

}

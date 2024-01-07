package calc;

public class Calculator {

	int a,b,result; // data member.
	
	public Calculator()
	{
		//constructors are used to assign default values to data members(variables.).
		
		System.out.println("I am in default constructor....");
		a=10;
		b=20;
		result=0;
	}
	
	public Calculator(int input1, int input2)
	{
		System.out.println("I am in parameterized constructor....");
		a=input1;
		b=input2;
		result=0;
	}
	
	public void sum()
	{
		result=a+b;
	}
	
	
	public void sum(int input1, int input2) // overloaded method.
	{
		//in method overloading:- in same class , method name will be same, method parameters could be different. and return type also could be different.
		result=input1+input2;
		System.out.println("input1:-"+input1+" input2:-"+input2+" result:-"+result);
	}
	
	
	public void printOutput() // method
	{
		System.out.println("value of a := "+a+" value of b:="+b+" result:-"+result);
	}
	
}

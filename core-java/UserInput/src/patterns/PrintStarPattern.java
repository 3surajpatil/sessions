package patterns;

public class PrintStarPattern {

	int patternLevel;
	
	
	
	/*
	line 13 to 16 :- Method Defination..
	line 14:- Method Heading.
	
	Method heading contains Method name, return type , access modifier, and input parameters.
	*/
	
	public void print(int userInput)      // Method Heading.
	{
		
		System.out.println("user input is:- "+userInput);
		
		
		for(int j=userInput; j>=0;j--)
		{	
			for(int i=1;i<=j;i++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	}	
	
	
}

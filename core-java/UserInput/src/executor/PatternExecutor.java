package executor;

import java.util.Scanner;

import patterns.PrintStarPattern;

public class PatternExecutor {

	public static void main(String[] args) {
		
		int constantUserInput=10;
		
		System.out.println("Please enter input :- ");
		Scanner sc= new Scanner(System.in);
		
		int userInput = sc.nextInt();
		
		PrintStarPattern psp=new PrintStarPattern(); // Object Creation.	
		psp.print(5);   // Method Call.
		
		System.out.println("----------------------------------------------");
		
		psp.print(constantUserInput);
		
		System.out.println("----------------------------------------------");
		psp.print(userInput);
		
	}

}
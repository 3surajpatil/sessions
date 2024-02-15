package exceptiondemos;

import java.util.Optional;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ExceptionDemo1 {

	public static void main(String[] args) throws Exception {
	
		int x=0;
		System.out.println("Please enter number :- ");
		Scanner sc= new Scanner(System.in);
		
		String input= sc.next();
					
		 try {
		   
			boolean isValidUserInput=isValidInt(input);
			
			
			// if exception is thrown by isValidInt method, below code in this try block will not be executed.
			 if(  isValidUserInput)
			 {
				   x = Integer.parseInt(input);
				 
			 }
			  
					 System.out.println("aaaa");
					 System.out.println("bbbbbb");
			 	
			 
		 }
		 catch(InvalidInputException e) {
			 
			// System.out.println( e.getMessage() );
			 
		 }		
		 
		 catch(Exception e) {    
			 System.out.println( e.getMessage() );		 
		 } 	
		
		 finally
		 {
			 
			 // this block gets executed compulsory irrespective of  exception is thrown or not..
			 sc.close();
		 }
			
	}

		
	 public static boolean isValidInt(String input) throws InvalidInputException
	 {
		 
		 
		 boolean validInt=false;
		  Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
		 
		 
		 input=input.trim();
		  
		 System.out.println("Entered input is "+input);
		 
		 if(input == null)
		 {
			 return validInt;
		 }	 
		 else if(input.length()==0)
		 {
			 return validInt;
		 }
		 else if(  ! pattern.matcher(input).matches())
		 {
		 
		 
			 
			 //throws exception.
			throw new InvalidInputException("please enter valid integer....!");
						 
	 	}
		 else
		 {
			 validInt=true;
		 }
		 
		 
		 
		 return validInt;
	 }
	
}

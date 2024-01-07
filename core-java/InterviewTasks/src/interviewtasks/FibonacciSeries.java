package interviewtasks;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		
		// 0 1 1 2 3 5 8 13;
		
		
		int num1=0;    //   0   1    1
		int num2=1;		//  1    1    
		
		int fibSeries=0;  //  1  2
		
		System.out.print(num1+" "+num2);
		
		for(int i=0;i<=50;i++)
		{
			 fibSeries = num1 + num2;  
			 num1=num2;
			 num2=fibSeries;
			
			 System.out.print(" "+fibSeries);
			 
		}
		 
		 
		
		
		
		
		
		
	}

}

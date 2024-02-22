package interviewtasks;

import java.sql.Time;

public class SortingIntegerArray {

	public static void main(String[] args) {
		
		//int []a= {7,1,3,2,6,4,8,5,0,9};  		
		
		int []a= {7,1,3,2};  
		
		
		System.out.println(a.length);
		
		int b,c,arrayLength;
		
		arrayLength=a.length;
		
		for(int i=0;i<10;i++)
		{
			System.out.print(a[i]);
		}
			
		
		for(int j=0;j<arrayLength;j++) 									
		{
			for(int i=0;i<arrayLength-j-1;i++)    // i<1//===> 0
			{
				//System.out.println(a[i]);			
				b=a[i];
				c=a[i+1];
						
				if(b>c)        // a[0] > a[1]  ? --> false
				{									
					a[i]= c;
					a[i+1]=b;			
				}	
							
			}
		}
		
		System.out.println();
		
		
		for(int i=0;i<10;i++)
		{
			System.out.print(a[i]);
		}
	
	}

}

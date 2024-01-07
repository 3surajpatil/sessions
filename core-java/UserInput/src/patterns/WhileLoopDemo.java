package patterns;

public class WhileLoopDemo {

	public static void main(String[] args) {
		
		int i=0;
		int j=5;
		
		while(j>=0)
		{
			i=0;
				while(i<=j)
				{
					System.out.print("*");
					i++;
				}
			
			j--;	
			System.out.println();
				
		}

	}
}

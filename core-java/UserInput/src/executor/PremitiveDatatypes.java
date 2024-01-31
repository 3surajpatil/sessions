package executor;

public class PremitiveDatatypes {

	public static void main(String[] args) {
		
		int i=10,j=20;
		
		String str=new String("300"); // non primitive. or object data type.
		
		String str1="300";   // primitive
		
		
		Integer int1,int2, int3;
		
		int1=new Integer(10);
		
		int2=Integer.valueOf(20);
		int3= Integer.valueOf(str1);
		
		
			
				
		System.out.println("int 1 :-"+int1);
		System.out.println("int 2 :-"+int2);
		System.out.println("int 3 :-"+int3);
		
		
		
		
		
	}

}

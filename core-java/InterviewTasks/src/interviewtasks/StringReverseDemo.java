package interviewtasks;

public class StringReverseDemo {

	public static void main(String[] args) {
	
		
		String name="Vijay Dinanath Chouhan";
		
		String reversedName="";
				
		int nameLength=name.length();
				
		System.out.println("name length is "+nameLength);

		for(int i=nameLength; i>=0;i--)
		{		
			System.out.println(name.charAt(i) );
			reversedName= reversedName+name.charAt(i);
		}
					
		System.out.println("reversed Name is "+reversedName);
		
	}

}

package interviewtasks;

public class StringOutputTracing {

	public static void main(String[] args) {
		

		
		String str="hello";
		String str1="hello";
		
		String helloString=new String("hello");
		String helloString1=new String("hello");
		

		System.out.println(str==str1);  // --> true  // compares address in ==......
		
		System.out.println(str==helloString);  // --> false // compares address. in ==
		
		System.out.println(str.equals(str1));  // --> true  // compares content
		
		System.out.println(str.equals(helloString)); //   true		// compares content
	
		System.out.println(helloString==helloString1);   // -----> false // compares address
		
		System.out.println(helloString.equals(helloString1));  // ---> true // compares content.
		
		
		
	}

}

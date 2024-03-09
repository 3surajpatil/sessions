package interviewtasks;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		
		String str= "hello";
		str=str+" word";
		
		
		//thread safe --> to run in standalone environment.
		StringBuffer sb= new StringBuffer();
		sb.append("hello");
		sb.reverse();
		
		//non thread safe --> to run in  server environment (thredsafe environment). 
		StringBuilder strbuilder= new StringBuilder();
		strbuilder.append("hello");
		strbuilder.append("world");
		
		
		
		
	}

}

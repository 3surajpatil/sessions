package interviewtasks;

public class StringOperations {

	public static void main(String[] args) {
		
		
		String name="Vijay Dinanath Chouhan";
		

		
		System.out.println("String Length:- "+name.length());
		System.out.println("7 th character is :- "+name.charAt(6));
		
		System.out.println("Dina index is "+name.indexOf("Dina"));
		System.out.println("first i index is :- "+name.indexOf('i'));
		System.out.println("Last i Position is :- "+name.lastIndexOf('i'));
		
		System.out.println("firsti position(index) is "+name.indexOf("i"));
		System.out.println("Last i position is :-"+name.lastIndexOf("i"));
		
		System.out.println("a is replaced by b:- "+ name.replace('a', 'b'));
		System.out.println("a is replaced by b:- "+ name.replace("ij", "jk"));
		System.out.println("All a is replaced by b:- "+name.replaceAll("a", "b"));
		
		System.out.println("UpperCase "+name.toUpperCase());
		System.out.println("LowerCase "+name.toLowerCase());
		System.out.println("starts with Vijay:- "+name.startsWith("Vijay"));
		System.out.println("ends with han:- "+name.endsWith("han"));
		
		
		System.out.println("Sustring is :-"+name.substring(7));
		System.out.println("Sustring is :-"+name.substring(name.lastIndexOf('i')));
		
		
		System.out.println(name.concat("  gaon :- Mandva") );
		System.out.println(name+"  gaon :- Mandva");
		
		
	}

}

package executor;

public class StaticDataMembersCalling {

	public String info="welcome to java world :- instance variable...!";
	
	public static String info1="welcome to java world :- static variable...!";
	
	
	public static void main(String[] args) {
		
		B();
		
		
		StaticDataMembersCalling sdmc=new StaticDataMembersCalling();
		sdmc.A();
		
		
		
	}

	public void A()
	{
		System.out.println("------------------i am in instance A() method....----------------------------");
		// instance variable call be called directly without obect if they belong to same class..
		System.out.println("info:- "+info);
		// static variable can also be called directly without object if they belong to same class. from instance mthod context.
		System.out.println("info1:-"+info1);
	
	}
	
	public static void B()
	{
		System.out.println("------------------i am in static B() method....----------------------------");
		// instance variable cannot be called directly from context of a static method. provided both method and variable belong to same class.
		//System.out.println("info"+info);    // uncomment this line before running first time..//
		
		//static variable can be called directly from context of static method. provided both method and variable belong to same class.
		System.out.println("info1"+info1);
		
	}
	
	
	
	
}

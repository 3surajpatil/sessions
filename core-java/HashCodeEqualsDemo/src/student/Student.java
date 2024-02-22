package student;

public class Student {


	int rollNo;    
	String name;
	String std;
	
	final static double pi=3.14;
	
	
	
	public Student()
	{
		//System.out.println("i am in default Constructor....");
		this.rollNo=0;
		this.name="no-name";
		this.std="0";
	}
	
	
	public Student(int rollNo,String name)
	{
		//System.out.println("i am in 2 parameterized Constructor....");
		this.rollNo=rollNo;
		this.name=name;
		this.std="1";
	}
	
	public Student(int rollNo,String name, String std)
	{
		//System.out.println("i am in 3 parameterized Constructor....");
		this.rollNo=rollNo;
		this.name=name;
		this.std=std;
		
	}

	// getXXXX() :- are called getter method.
	// setXXX() :- are called setter method.
	
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	//this :- represent current class data member.
	// this is provided in java to distinguish between current class data members and input parameters in member methods or constructors..
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", std=" + std + "]";
	}
	
	
	public boolean equals(Student inputStudent)
	{
		boolean isEqual=false;
		
		if(this.rollNo == inputStudent.rollNo)
		{
			isEqual=true;
		}
		else if(this.rollNo > inputStudent.rollNo)
		{
			return false;
		}
		else if(this.rollNo < inputStudent.rollNo)
		{
			return false;
		}
		
		return isEqual;
	}
	

}

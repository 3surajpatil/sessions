package executor;

import students.Student;

public class StudentConstructorDemo2 {

	public static void main(String[] args) {
		
		
		Student s1=new Student();
		
		Student s2 = new Student(1,"Shweta","2");
		
		Student s3 = new Student(2,"Tauja","5");
		
		Student s4= new Student(3,"Pratiksha");
		
		
		s1.setName("Suraj");
		s1.setRollNo(4);
		s1.setStd("juniorKG");
		
		
		System.out.println("s1 is :- "+s1.toString());
		System.out.println("s2 is :- "+s2.toString());
		System.out.println("s3 is :- "+s3.toString());
		System.out.println("s4 is :- "+s4.toString());
	}

}

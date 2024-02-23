package executor;

import java.util.ArrayList;
import java.util.Collections;

import student.Student;

public class NewTest {

	public static void main(String[] args) {
		
		
		
		Student s1=new Student(1,"Suraj");
		Student s2=new Student(2,"Shweta");
		Student s3=new Student(3,"Tanuja");
		Student s4=new Student(4,"Anay");
		Student s5=new Student(5,"Supriya");
		
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s1));
		
		ArrayList al = new ArrayList();
		
		al.add(s1);
		al.add(s5);
		al.add(s2);
		al.add(s4);
		al.add(s3);
		
		System.out.println(al);
		
		
		Collections.sort(al);
	
		System.out.println(al);
		
		
		
		
	}

}

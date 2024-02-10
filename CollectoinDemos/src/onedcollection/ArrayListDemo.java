package onedcollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	
	public static void main(String args[])
	{
			
		ArrayList al =  new ArrayList();
	
		List l = new LinkedList();	 // for demonstration.
			
		al.add(10);
		al.add("Suraj");
		al.add(411057);
		al.add("pune");
		
		System.out.println("ArrayList elements are "+ al);
		
		al.add(1,"Dist Pune");
		
		System.out.println("ArrayList elements are "+ al);
		
		ArrayList al1= (ArrayList) al.clone();
		
		System.out.println("AL1 "+al1);
		
		al1.clear();
		
		System.out.println("AL1 after clear "+al1);
		System.out.println("AL after clear "+al);
		
		System.out.println("ArrayList contains element 'Suraj' or not :- "+al.contains("suraj") );
		
		al.add(null);
		al.add(null);
		
		System.out.println("AL after clear "+al);
		
		
		
		Iterator itr= al.iterator();
		
		for(int i=0; i<al.size(); i++)
		{
				if(itr.hasNext())
				{
			
					System.out.println(itr.next());  
				
				}
		}
		
		ListIterator li=	al.listIterator();
		Iterator itr1= al.iterator();
		
		
		
	}
	
}

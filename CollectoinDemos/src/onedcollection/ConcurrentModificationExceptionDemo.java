package onedcollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExceptionDemo {

	public static void main(String[] args) {
		
		
		List al = new ArrayList();
		
		al.add(10);
		al.add("Suraj");
		al.add(411057);
		al.add("pune");
		
		System.out.println("ArrayList elements are "+ al);
		
		al.add(1,"Dist Pune");
		
		System.out.println("ArrayList elements are "+ al);
		
		
		Iterator itr= al.iterator();
		
		al.remove(2);
		
		while (itr.hasNext()) {

				System.out.println("next element --> "+itr.next());
				
				itr.remove();
				System.out.println("all elements are -------------->"+al);
				//System.out.println("next element --->"+itr.next());						
				
		}

		
	}

}

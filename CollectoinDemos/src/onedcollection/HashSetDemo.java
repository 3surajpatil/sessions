package onedcollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		
		
		//HashSet hs =new HashSet();
		
		Set hs = new HashSet();
	
		/*	
		//hs.add(10);
		hs.add("Suraj");
		hs.add(411057);
		hs.add("pune");
		hs.add(null);
		*/
		hs.add(4);
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		
		System.out.println(hs.toString());
		//System.out.println(hs); // same as calling toString method.
		
		// hashSet doesen't allow duplicate elements.
		
		//hs.add(10);		
		//hs.add(null);
		
		Iterator itr=hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
	}

}

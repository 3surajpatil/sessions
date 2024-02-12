package onedcollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;



public class TreeSetDemo {

	public static void main(String[] args) {
		
		
		TreeSet ts=new TreeSet();
		//Set s= new TreeSet();
		//s =  new HashSet();
		
		System.out.println("treeset elements are "+ts);
		
		ts.add(3);
		ts.add(1);
		ts.add(4);
		ts.add(1);
		ts.add(2);
		
		System.out.println("treeset elements are "+ts);

		Iterator itr = ts.iterator();
		
		while(itr.hasNext())
		{
				System.out.println(itr.next());
		}
		
	}

}

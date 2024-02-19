package twodcollection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;



public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TreeMap tm = new TreeMap();
		/* note that when you put first element key , rest of the keys should be of same types. like integer
		 we can use multiple null values associated with different keys.
		 treemap will not accept null as key.
		*/
		//tm.put(null, 1);
		tm.put(1, null);
		tm.put(2, "killari");
		tm.put(3,null);
		
		System.out.println("treemap elements are "+tm);		
		System.out.println("tm.get(2):- "+tm.get(2));		
		Set keySet=tm.keySet();		
		System.out.println("keyset is "+keySet);
		
		System.out.println("=========retrive elements ==========>");
		
		Iterator itr =keySet.iterator();
		
		while(itr.hasNext())
		{
			System.out.println("--->"+itr.next());
		}
		
		
		System.out.println("=========remove element ==========>");
		tm.remove(3);
		System.out.println("after removal "+tm);
		
		// adding 1 key-value.
		tm.put(5, "New York");
		
		System.out.println("");
		
		
		System.out.println("containsKey(3) ? "+tm.containsKey(3));
		System.out.println("containsKey(3) ? "+tm.containsKey(5));
		
	}

}

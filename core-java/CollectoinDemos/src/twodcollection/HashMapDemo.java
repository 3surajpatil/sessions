package twodcollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap hm = new HashMap();
		
		//Map hm1= new HashMap();
		
		//Map hm2= new TreeMap();
		
		
		
		hm.put(1, "Car");
		hm.put(2,"Bus");
		hm.put(3,"Tempo");
		hm.put(4, "Airoplane");
		hm.put("Suraj","Car");
		
		System.out.println("hm elements are "+hm);
		
		Set hmKeySet =hm.keySet();
				
		System.out.println("hmKeySet is "+hmKeySet);
		
		System.out.println("get(1) :- "+hm.get(1) );
		
		Iterator hmIterator =hmKeySet.iterator();
		
		
		System.out.println("printing hm iterator elements");
		
		while (hmIterator.hasNext())
		{
			
			System.out.println(hmIterator.next());
		}
		
		
		System.out.println("=========================snd method to retrive lements =================");
		
		Set entrySet=hm.entrySet();
		
		System.out.println("entry set is"+entrySet); 
		
		Iterator entrySetIterator =entrySet.iterator();
		
		while(entrySetIterator.hasNext())
		{
			System.out.println( entrySetIterator.next() );
		}	
			
		
		System.out.println("====================Remove element======================");
		hm.remove("Suraj");
		
		System.out.println("after removal elemtns are "+hm);
		
	}

}

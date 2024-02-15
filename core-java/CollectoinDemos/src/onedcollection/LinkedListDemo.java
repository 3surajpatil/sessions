package onedcollection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		
		
		LinkedList ll= new LinkedList();
		
		ll.add(10);
		ll.add("Suraj");
		ll.add(411057);
		ll.add("pune");
		
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		System.out.println(ll.get(3));
		
		ll.addFirst("java");
		ll.addLast("python");

		System.out.println(ll);
		
		
		
		
	}

}

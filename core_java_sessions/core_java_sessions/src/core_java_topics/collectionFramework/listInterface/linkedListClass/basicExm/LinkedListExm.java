package core_java_topics.collectionFramework.listInterface.linkedListClass.basicExm;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExm {
	public static void main(String[] args) {
		//create object of LinkedList
		LinkedList<String> cities = new LinkedList<String>();
		//to add the elements using add(E e) method
		cities.add("Hyderabad");
		cities.add("Chennai");
		cities.add("Bangalore");
		cities.add("Mumbai");
		cities.add("Chennai");
		cities.add(null);
		System.out.println("================== Using add(E e) method ==================");
		//using for each loop
		for(String obj : cities) {
			System.out.println(obj);
		}
		//to add element at specific position
		cities.add(4, "Pune");
		System.out.println("================== Using add(int index, E e) method ==================");
		Iterator<String> itr = cities.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//to add the element at first
		System.out.println("================== Using addFirst(E e) method ==================");
		cities.addFirst("Raichur");
		//to add the element at last
		System.out.println("================== Using addLast(E e) method ==================");
		cities.addLast("Gulburga");
		for(String obj : cities) {
			System.out.println(obj);
		}
		System.out.println("To get element of specific position : " + cities.get(5));
		//to remove element from list object
		cities.remove("Chennai");
		System.out.println("============ After removing element using remove(Object e) method ================");
		ListIterator<String> listItr = cities.listIterator();
		while(listItr.hasNext()) {
			System.out.println(listItr.next());
		}
	}
}

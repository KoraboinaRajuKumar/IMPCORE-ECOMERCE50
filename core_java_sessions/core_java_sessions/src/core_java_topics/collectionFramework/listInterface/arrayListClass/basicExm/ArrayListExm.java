package core_java_topics.collectionFramework.listInterface.arrayListClass.basicExm;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExm {

	public static void main(String[] args) {
		//create the object of ArrayList
		
		ArrayList<String> listOfNames = new ArrayList<String>();
		//using add(E e) method to add the element into list object
		listOfNames.add("Karan Rana");
		listOfNames.add("Vishnu");
		listOfNames.add("Raunak");
		listOfNames.add("Arvind");
		listOfNames.add("Sai");
		listOfNames.add("Vishnu");
		listOfNames.add("Sai");
		listOfNames.add(null);
		
		//iterate over list object using for each loop
		//for(Type obj : collectionObject)
		System.out.println("====================== Using add(E e) method to add the object to list ======================");
		for(String name : listOfNames) {
			System.out.println("Name : " + name);
		}
		System.out.println("====================== Using add(int index, E e) method to add element at specific index ======================");
		listOfNames.add(1, "Kamran");
		
		//iterate over list object using Iterator interface
		Iterator<String> itr = listOfNames.iterator();
		while(itr.hasNext()) {
			System.out.println("Name : " + itr.next());
		}
		//create a new array list object
		ArrayList<String> listOfNames1 = new ArrayList<String>();
		listOfNames1.add("Yashas");
		listOfNames1.add("Akshay");
		listOfNames1.add("Manish");
		listOfNames1.add("Avinash");
		
		System.out.println("====================== Using new list of object to old list object using addAll(Collection) method ======================");
		listOfNames.addAll(listOfNames1);
		for(String name : listOfNames) {
			System.out.println("Name : " + name);
		}
		System.out.println("====================== adding new list of object to old list object using addAll(int index, Collection c) method at specified index ===============");
		
		ArrayList<String> listOfNames2 = new ArrayList<String>();
		listOfNames2.add("Usman");
		listOfNames2.add("Ajay");
		listOfNames2.add("Samapath");
		
		listOfNames.addAll(8, listOfNames2);
		Iterator<String> itr1 = listOfNames.iterator();
		while(itr1.hasNext()) {
			System.out.println("Name : " + itr1.next());
		}
		System.out.println("===== After removing element from list object using remove(int index) method ===========");
		listOfNames.remove(11);
		for(String name : listOfNames) {
			System.out.println("Name : " + name);
		}
		System.out.println("===== After removing element from list object using remove(Object obj) method ===========");
		listOfNames.remove("Vishnu");
		for(String name : listOfNames) {
			System.out.println("Name : " + name);
		}
		System.out.println("===== After removing element from list object using remove(Collection obj) method ===========");
		listOfNames.removeAll(listOfNames1);
		
		Iterator<String> itr2 = listOfNames.iterator();
		while(itr2.hasNext()) {
			System.out.println("Name : " + itr2.next());
		}
		System.out.println("To know the size of a list : " + listOfNames.size());
		//listOfNames.clear();
		//System.out.println("After clearing all the elements of list object using clear() method : " + listOfNames.size());
		
		System.out.println("To get the element of specific index : " + listOfNames.get(7));
		System.out.println(listOfNames.contains("Kamran"));
		System.out.println(listOfNames.containsAll(listOfNames2));
		System.out.println(listOfNames.contains("Hyderabad"));
		System.out.println(listOfNames.isEmpty());
		listOfNames.set(9, "Mitali");
		for(String name : listOfNames) {
			System.out.println("Name : " + name);
		}
	}

}



























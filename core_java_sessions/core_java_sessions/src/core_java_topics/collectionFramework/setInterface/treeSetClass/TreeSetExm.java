package core_java_topics.collectionFramework.setInterface.treeSetClass;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExm {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>();
		set.add("Akshay");
		set.add("Vishnu");
		set.add("Yashas");
		set.add("Kamran");
		set.add("Manish");
		
		for(String name : set) {
			System.out.println(name);
		}
		System.out.println("=========== Adding new set object to old set object using addAll(Collection c ) ============");
		TreeSet<String> set1 = new TreeSet<String>();
		set1.add("Sampath");
		set1.add("Usman");
		set1.add("Avinash");
		set.addAll(set1);
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("to check if the element present in set obj : " + set.contains("Kamran"));
		System.out.println("To check the size of set object : " + set.size());
		System.out.println("To check if the set object is empty : " + set1.isEmpty());
	}
}

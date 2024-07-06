package core_java_topics.collectionFramework.setInterface.hashSetClass.basicExm;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExm {

	public static void main(String[] args) {
		
		HashSet<String> setObj = new HashSet<String>();
		//to add the element to hashset object
		System.out.println("=========== to add the element to set object using add(E e) method ===========");
		setObj.add("Hyderabad");
		setObj.add("Pune");
		setObj.add("Chennai");
		setObj.add("Bangalore");
		setObj.add("Mumbai");
		setObj.add("Pune");
		setObj.add(null);
		for(String city : setObj) {
			System.out.println(city);
		}
		System.out.println("============ Using iterator() to iterate over the set object =================");
		Iterator<String> itr = setObj.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		HashSet<String> setObj1 = new HashSet<String>();
		setObj1.add("Raichur");
		setObj1.add("Nagpur");
		
		setObj.addAll(setObj1);
		System.out.println("======= Adding new set object to alreqady existing set object using addAll(Collection obj) method =============");
		for(String cities : setObj) {
			System.out.println(cities);
		}
		System.out.println("============ to clear the elements of set object using clear() method ======================================");
		//setObj.clear();
		System.out.println("To get the size of set object using size() method : " + setObj.size());
		System.out.println("To check if the element exixts in set object using contains() method : " + setObj.contains("Mumbai"));
		System.out.println("To check whether the set object is empty or not : " + setObj.isEmpty());
		setObj.remove(null);
		System.out.println("============= using remove(Object obj) method to remove the element from set object ==========================");
		Iterator<String> itr1 = setObj.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
	}

}
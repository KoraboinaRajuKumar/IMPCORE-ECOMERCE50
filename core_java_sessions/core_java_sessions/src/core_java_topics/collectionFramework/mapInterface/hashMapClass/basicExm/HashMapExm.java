package core_java_topics.collectionFramework.mapInterface.hashMapClass.basicExm;

import java.util.HashMap;
import java.util.Map;

public class HashMapExm {

	public static void main(String[] args) {
		
		//create the object of HashMap
		HashMap<Integer,String> nameObj1 = new HashMap<Integer,String>();
		//to add the key-value pair to map object we use put(K k, V v) method
		nameObj1.put(101, "Sai Kumar");
		nameObj1.put(102,"Sampath");
		nameObj1.put(103, "Yashas");
		nameObj1.put(104, "Raunak");
		nameObj1.put(105, "Das");
		nameObj1.put(null, "Kamran");
		nameObj1.put(106, null);
		nameObj1.put(107, null);
		nameObj1.put(108, null);
		nameObj1.put(103, "Manish");
		System.out.println("=================== using put(k,v) method to add/put key value pair in map object ==========================");
		//to iterate over the map object
		for(Map.Entry<Integer, String> obj : nameObj1.entrySet()) {
			System.out.println("Key : " + obj.getKey() + " = " + " Value : " + obj.getValue());
		}
		// to add new map object to already existing map object
		HashMap<Integer, String> nameObj2 = new HashMap<Integer,String>();
		nameObj2.put(109, "Akshay");
		nameObj2.put(110, "Vishnu");
		nameObj1.putAll(nameObj2);
		
		System.out.println("=================== using putAll(Map obj) method to add/put new object ==========================");
		//to iterate over the map object
		for(Map.Entry<Integer, String> obj : nameObj1.entrySet()) {
			System.out.println("Key : " + obj.getKey() + " = " + " Value : " + obj.getValue());
		}
		//to get the value based on specific key
		String name = nameObj1.get(104);
		System.out.println("Value of key 104 is : " + name);
		
		System.out.println(nameObj1.isEmpty());
		System.out.println(nameObj1.containsValue("Kamran"));
		System.out.println(nameObj1.containsKey(111));
		System.out.println("to get the size of map object : " + nameObj1.size());
		nameObj1.remove(null);
		
		System.out.println("======================= After removing the key from the map object using remove(Object obj) method ==============");
		for(Map.Entry<Integer, String> obj : nameObj1.entrySet()) {
			System.out.println("Key : " + obj.getKey() + " = " + " Value : " + obj.getValue());
		}
		
		nameObj1.replace(101, "Sai Kumar", "Usman");
		
		System.out.println("============ After replacing old value with new value using replace(Object key, Value old, Value new) method ======");
		for(Map.Entry<Integer, String> obj : nameObj1.entrySet()) {
			System.out.println("Key : " + obj.getKey() + " = " + " Value : " + obj.getValue());
		}
	}
}
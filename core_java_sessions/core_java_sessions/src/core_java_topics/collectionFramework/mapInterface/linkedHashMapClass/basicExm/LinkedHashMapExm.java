package core_java_topics.collectionFramework.mapInterface.linkedHashMapClass.basicExm;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExm {

	public static void main(String[] args) {
		LinkedHashMap<Integer, Integer> mapObj = new LinkedHashMap<Integer,Integer>();
		mapObj.put(101, 5647);
		mapObj.put(104, 3664);
		mapObj.put(103, 3657);
		mapObj.put(102, 3908);
		mapObj.put(105, 8586);
		mapObj.put(null, 3646);
		mapObj.put(106, null);
		mapObj.put(109, null);
		mapObj.put(null, 1111);
		
		for(Map.Entry<Integer, Integer> obj : mapObj.entrySet()) {
			System.out.println("Key : " + obj.getKey() + " Value : " + obj.getValue() );
		}
		
		LinkedHashMap<Integer, Integer> mapObj1 = new LinkedHashMap<Integer,Integer>();
		mapObj1.put(110, 5464);
		mapObj1.put(123, 5890);
		mapObj1.put(156, 3767);
		mapObj.putAll(mapObj1);
		System.out.println("========= Adding new map object to already exisiting map object ============");
		for(Map.Entry<Integer, Integer> obj : mapObj.entrySet()) {
			System.out.println("Key : " + obj.getKey() + " Value : " + obj.getValue() );
		}
		System.out.println("To get the value based on key : " + mapObj.get(105));
		//mapObj.remove(null);
		System.out.println("============ After removing the object from map object ===================");
		for(Map.Entry<Integer, Integer> obj : mapObj.entrySet()) {
			System.out.println("Key : " + obj.getKey() + " Value : " + obj.getValue() );
		}
	}

}

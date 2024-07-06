package core_java_topics.collectionFramework.mapInterface.treeMapClass;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExm {

	public static void main(String[] args) {

		TreeMap<Integer, String> mapObj = new TreeMap<Integer,String>();
		mapObj.put(105, "Sai");
		mapObj.put(101, "Sampath");
		mapObj.put(102, "Aravind");
		mapObj.put(104, "Avinash");
		mapObj.put(103, "Aravind");
		mapObj.put(107, null);
		mapObj.put(106, null);
		for(Map.Entry<Integer, String> obj : mapObj.entrySet()) {
			System.out.println("Key : " + obj.getKey() + " Value : " + obj.getValue());
		}
		
	}

}

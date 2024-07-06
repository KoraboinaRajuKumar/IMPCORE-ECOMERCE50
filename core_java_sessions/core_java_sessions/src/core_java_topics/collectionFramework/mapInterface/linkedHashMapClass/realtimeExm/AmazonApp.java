package core_java_topics.collectionFramework.mapInterface.linkedHashMapClass.realtimeExm;

import java.util.LinkedHashMap;
import java.util.Map;

public class AmazonApp {
	public static void main(String[] args) {
		ProductDetails prod1 = new ProductDetails(111111111l, "Samsung Galaxy Note 2","Good Mobile", 25000.0d, 12000.0d);
		ProductDetails prod2 = new ProductDetails(222222222l, "Samsung Galaxy M34 5G", "Outstanding Mobile",38000.0d, 4000.0d);
		ProductDetails prod3 = new ProductDetails(333333333l, "Samsung Galaxy M14 5G", "Good For Selfie", 42000.0d, 3000.0d);
		
		Map<Long, ProductDetails> samsungProd = new LinkedHashMap<Long,ProductDetails>();
		samsungProd.put(111111111l, prod1);
		samsungProd.put(222222222l, prod2);
		samsungProd.put(333333333l, prod3);
		
		ProductDetails prod4 = new ProductDetails(444444444l, "OnePlus Nord 3 5G","Misty Green, 8GB RAM, 128GB Storage", 39000.0d, 1000.0d);
		ProductDetails prod5 = new ProductDetails(555555555l, "OnePlus 11R 5G", "Good Battery Mobile",42000.0d, 3500.0d);
		ProductDetails prod6 = new ProductDetails(666666666l, "OnePlus CE3 5G", "Good For Selfie", 21000.0d, 1200.0d);
		
		Map<Long, ProductDetails> onePlusProd = new LinkedHashMap<Long,ProductDetails>();
		onePlusProd.put(444444444l, prod4);
		onePlusProd.put(555555555l, prod5);
		onePlusProd.put(666666666l, prod6);
		
		ProductDetails prod7 = new ProductDetails(777777777l, "RedMi3 5G","With good front camera", 29000.0d, 1800.0d);
		ProductDetails prod8 = new ProductDetails(888888888l, "RedMi13C 5G", "Good Mobile",31500.0d, 2200.0d);
		ProductDetails prod9 = new ProductDetails(999999999l, "Redmi 12 5G Pastel", "Good For Selfie", 41000.0d, 3200.0d);
		
		Map<Long, ProductDetails> redmiProd = new LinkedHashMap<Long,ProductDetails>();
		redmiProd.put(777777777l, prod7);
		redmiProd.put(888888888l, prod8);
		redmiProd.put(999999999l, prod9);
		
		Map<String, Map<Long, ProductDetails>> proMap = new LinkedHashMap<String, Map<Long,ProductDetails>>();
		proMap.put("Samsung", samsungProd);
		proMap.put("OnePlus", onePlusProd);
		proMap.put("RedMi", redmiProd);
		
		for(Map.Entry<String, Map<Long, ProductDetails>> obj : proMap.entrySet()) {
			System.out.println("Product Name : " + obj.getKey());
			Map<Long,ProductDetails> prod = obj.getValue();
			for(Map.Entry<Long, ProductDetails> obj1 : prod.entrySet()) {
				System.out.println(obj1.getValue());
			}
		}
	}
}
package core_java_topics.collectionFramework.mapInterface.linkedHashMapClass.realtimeExm;

import java.util.Map;

public class Product {

	private String brand_name;
	private Map<Long,ProductDetails> mapObj;
	
	public Product(String brand_name, Map<Long, ProductDetails> mapObj) {
		super();
		this.brand_name = brand_name;
		this.mapObj = mapObj;
	}
	@Override
	public String toString() {
		return "Product [brand_name=" + brand_name + ", mapObj=" + mapObj + "]";
	}
}

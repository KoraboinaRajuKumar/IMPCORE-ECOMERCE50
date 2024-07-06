package core_java_topics.collectionFramework.comparableInterface;

public class Products implements Comparable<Products>{

	long prod_id;
	String prod_name;
	String prod_feature;
	double prod_price;
	
	public Products(long prod_id, String prod_name, String prod_feature, double prod_price) {
		super();
		this.prod_id = prod_id;
		this.prod_name = prod_name;
		this.prod_feature = prod_feature;
		this.prod_price = prod_price;
	}

	@Override
	public int compareTo(Products product) {
		
		if(prod_price > product.prod_price)
			return 1;
		else if(prod_price < product.prod_price)
			return -1;
		else
			return 0;
	}

	@Override
	public String toString() {
		return "Products [prod_id=" + prod_id + ", prod_name=" + prod_name + ", prod_feature=" + prod_feature
				+ ", prod_price=" + prod_price + "]";
	}

}

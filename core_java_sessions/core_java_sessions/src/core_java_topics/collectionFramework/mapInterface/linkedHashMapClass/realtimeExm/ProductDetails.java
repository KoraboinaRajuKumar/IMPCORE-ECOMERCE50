package core_java_topics.collectionFramework.mapInterface.linkedHashMapClass.realtimeExm;

public class ProductDetails {

	private long prod_id;
	private String prod_name;
	private String prod_desc;
	private double prod_price;
	private double prod_offer;
	
	public ProductDetails(long prod_id, String prod_name, String prod_desc, double prod_price, double prod_offer) {
		super();
		this.prod_id = prod_id;
		this.prod_name = prod_name;
		this.prod_desc = prod_desc;
		this.prod_price = prod_price;
		this.prod_offer = prod_offer;
	}
	@Override
	public String toString() {
		return "ProductDetails [prod_id=" + prod_id + ", prod_name=" + prod_name + ", prod_desc=" + prod_desc
				+ ", prod_price=" + prod_price + ", prod_offer=" + prod_offer + "]";
	}
}

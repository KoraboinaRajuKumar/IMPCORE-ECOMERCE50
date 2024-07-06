package core_java_topics.collectionFramework.comparableInterface;

import java.util.ArrayList;

import java.util.Collections;

public class FlipkartProducts {

	public static void main(String[] args) {

		ArrayList<Products> products = new ArrayList<Products>();
		
		products.add(new Products(123458954l, "SIAVANTAGE PRO 2163  (Green)", "8 MB RAM | 8 MB ROM", 700.0d));
        products.add(new Products(123456789l, "TARAA 1709  (Black)", "32 MB RAM | 32 MB ROM", 674.0d));
        products.add(new Products(123451209l, "SAMSUNG Galaxy Z Fold5 (Icy Blue, 512 GB)  (12 GB RAM)", "1 Year Manufacturer Warranty ", 164999.0d));
        products.add(new Products(123454012l, "Apple iPhone 15 Pro Max (Blue Titanium, 256 GB)", "17.02 cm (6.7 inch) Super Retina XDR", 148000.0d));
        products.add(new Products(123450098l, "Apple iPhone 13 Pro Max (Alpine Green, 1 TB)", "1 TB ROM", 179999.0d));
        
        Collections.sort(products);
        for(Products prod : products) {
        	System.out.println(prod);
        }
	}

}

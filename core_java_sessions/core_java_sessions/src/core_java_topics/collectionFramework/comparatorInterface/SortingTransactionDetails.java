package core_java_topics.collectionFramework.comparatorInterface;

import java.util.ArrayList;
import java.util.Collections;

public class SortingTransactionDetails {

	public static void main(String[] args) {
		
		ArrayList<Transactions> transactions = new ArrayList<Transactions>();
		transactions.add(new Transactions(123456789l,"01-06-2024", "Phone pe", 5200.0d));
		transactions.add(new Transactions(123453053l, "01-06-2024", "GPay", 3200.0d));
		transactions.add(new Transactions(123450519l,"03-06-2024", "PatTm", 1000.0d));
		transactions.add(new Transactions(123457100l, "05-06-2024", "GPay", 7000.0d));
		transactions.add(new Transactions(123459012l,"06-06-2024", "Phone pe", 500.0d));
		transactions.add(new Transactions(123455105l, "10-06-2024", "GPay", 13200.0d));
		
		System.out.println("=========== Sorting based on Transaction Id =====================");
		Collections.sort(transactions, new TransIdComparator());
		for(Transactions obj : transactions) {
			System.out.println(obj);
		}
		System.out.println("=========== Sorting based on Transaction Amount =================");
		Collections.sort(transactions, new TransAmtComparator());
		for(Transactions obj : transactions) {
			System.out.println(obj);
		}
	}

}

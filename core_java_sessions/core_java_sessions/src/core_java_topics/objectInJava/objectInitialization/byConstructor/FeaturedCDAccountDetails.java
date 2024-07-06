package core_java_topics.objectInJava.objectInitialization.byConstructor;

public class FeaturedCDAccountDetails {

	public static void main(String[] args) {
		
		FeaturedCDAccount account1 = new FeaturedCDAccount(123456789l, "Akshay", 5000.0d, 6.5d, true, 7, 500000.0d);
		FeaturedCDAccount account2 = new FeaturedCDAccount(987654321l, "Srinivas", 4000.0d, 7.6d, true, 5, 200000.0d);
		FeaturedCDAccount account3 = new FeaturedCDAccount(869538965l, "Karan Rana", 5500, 8.25d, true, 10, 300000.0d);
		
		account1.displayFDAACCInfo();
		account2.displayFDAACCInfo();
		account3.displayFDAACCInfo();

	}

}

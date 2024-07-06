package core_java_topics.collectionFramework.setInterface.hashSetClass.realtimeExm;

import java.util.HashSet;

public class SavingAccountDetails {

	public static void main(String[] args) {
		
		SavingAccount account1 = new SavingAccount(123456789l, "Sai", "Hyderabad Branch", "Hyderabad City", 100000.0d);
		SavingAccount account2 = new SavingAccount(987654321l, "Yashas", "Bangalore Branch", "Bangalore City", 200000.0d);
		SavingAccount account3 = new SavingAccount(987654345l, "Das", "Kolkata Branch", "Kolkata City", 300000.0d);
		SavingAccount account4 = new SavingAccount(987654343l, "Manish", "Mumbai Branch", "Mubai City", 500000.0d);
		SavingAccount account5 = new SavingAccount(987654312l, "Akshay", "Pune Branch", "Pune City", 700000.0d);
		SavingAccount account6 = new SavingAccount(987654345l, "Das", "Kolkata Branch", "Kolkata City", 300000.0d);

		System.out.println("hashcode of account3 : " + account3.hashCode());
		System.out.println("hashcode of account6 : " + account6.hashCode());
		
		HashSet<SavingAccount> hashSet = new HashSet<SavingAccount>();
		hashSet.add(account1);
		hashSet.add(account2);
		hashSet.add(account3);
		hashSet.add(account4);
		hashSet.add(account5);
		hashSet.add(account6);
		
		for(SavingAccount accounts : hashSet) {
			System.out.println(accounts);
		}
	}

}

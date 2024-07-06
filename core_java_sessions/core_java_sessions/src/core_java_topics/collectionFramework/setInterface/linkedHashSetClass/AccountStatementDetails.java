package core_java_topics.collectionFramework.setInterface.linkedHashSetClass;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class AccountStatementDetails {
	public static void main(String[] args) {

		HashMap<Account, LinkedHashSet<TransactionStatement>> mapObj = new HashMap<Account,LinkedHashSet<TransactionStatement>>();
		
		Account account1 = new Account(123456789l, "Mohammed Kamran","Raichur Branch", 10000.0d);
		LinkedHashSet<TransactionStatement> setObj1 = new LinkedHashSet<TransactionStatement>();
		setObj1.add(new TransactionStatement(123456789l, "Phone Pe", "09-06-2024", 10));
		setObj1.add(new TransactionStatement(987654321l, "GPay", "09-06-2024", 10));
		setObj1.add(new TransactionStatement(768548964l, "Phone Pe", "10-06-2024", 1000));
		
		Account account2 = new Account(567349087l, "Mohammed Zeeshan","Hyderabad Branch", 65000.0d);
		LinkedHashSet<TransactionStatement> setObj2 = new LinkedHashSet<TransactionStatement>();
		setObj2.add(new TransactionStatement(786453908l, "Phone Pe", "11-06-2024", 10));
		setObj2.add(new TransactionStatement(867530987l, "Phone pe", "09-06-2024", 10));
		setObj2.add(new TransactionStatement(348976547l, "GPay", "09-06-2024", 1200));
		setObj2.add(new TransactionStatement(876490874l, "Phone Pe", "02-06-2024", 250));
		setObj2.add(new TransactionStatement(563905789l, "GPay", "10-06-2024", 400));
		setObj2.add(new TransactionStatement(590090564l, "Phone Pe", "05-06-2024", 900));
		
		Account account3 = new Account(897645398l, "Mohammed Irfan","Riyadh Branch", 250000.0d);
		LinkedHashSet<TransactionStatement> setObj3 = new LinkedHashSet<TransactionStatement>();
		setObj3.add(new TransactionStatement(678451090l, "Phone Pe", "09-06-2024", 600));
		setObj3.add(new TransactionStatement(389674099l, "GPay", "09-06-2024", 320));
		setObj3.add(new TransactionStatement(129870906l, "Phone Pe", "10-06-2024", 500));
		setObj3.add(new TransactionStatement(711093458l, "Phone Pe", "10-06-2024", 8000));
		
		mapObj.put(account1, setObj1);
		mapObj.put(account2, setObj2);
		mapObj.put(account3, setObj3);
		
		for(Map.Entry<Account, LinkedHashSet<TransactionStatement>> map : mapObj.entrySet()) {
			Account acc = map.getKey();
			System.out.println("========================================== Account Details =====================================");
			System.out.println(acc);
			System.out.println("====================== Transaction History =====================================================");
			LinkedHashSet<TransactionStatement> transaction = map.getValue();
			for(TransactionStatement statement : transaction) {
				System.out.println(statement);
			}
		}
	}
}
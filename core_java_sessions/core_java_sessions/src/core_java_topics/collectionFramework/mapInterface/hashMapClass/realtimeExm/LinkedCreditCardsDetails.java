package core_java_topics.collectionFramework.mapInterface.hashMapClass.realtimeExm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class LinkedCreditCardsDetails {

	public static void main(String[] args) {
		
		HashMap<Long, List<CreditCard>> mapObj = new HashMap<Long,List<CreditCard>>();
		
		List<CreditCard> cardObj1 = new ArrayList<CreditCard>();
		cardObj1.add(new CreditCard(111111111l, "Akshay", "07-06-2030", 333, 1456, 50000.0d));
		cardObj1.add(new CreditCard(222222222l, "Akshay","07-06-2034", 444, 9777, 100000.0d));
		
		List<CreditCard> cardObj2 = new ArrayList<CreditCard>();
		cardObj2.add(new CreditCard(333333333l, "Manish", "07-06-2029", 555, 2365, 150000.0d));
		cardObj2.add(new CreditCard(444444444l, "Manish","07-06-2037", 111, 6754, 50000.0d));
		cardObj2.add(new CreditCard(555555555l, "Manish","07-06-2040", 777, 8989, 200000.0d));
		
		List<CreditCard> cardObj3 = new ArrayList<CreditCard>();
		cardObj3.add(new CreditCard(666666666l, "Kamran", "07-06-2030", 999, 3435, 25000.0d));
		
		mapObj.put(123456789l, cardObj1);
		mapObj.put(987654321l, cardObj2);
		mapObj.put(786567578l, cardObj3);
		
		for(Map.Entry<Long, List<CreditCard>> obj : mapObj.entrySet()) {
			System.out.println("=================================================================");
			System.out.println(" Account Number : " + obj.getKey());
			System.out.println("============= Credit Cards linked to the account ===============");
			List<CreditCard> cardList = obj.getValue();
			Iterator<CreditCard> itr = cardList.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
		
	}

}

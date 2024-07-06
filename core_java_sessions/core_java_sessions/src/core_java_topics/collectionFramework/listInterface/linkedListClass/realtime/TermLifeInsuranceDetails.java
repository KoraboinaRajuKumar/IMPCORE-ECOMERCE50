package core_java_topics.collectionFramework.listInterface.linkedListClass.realtime;

import java.util.LinkedList;

public class TermLifeInsuranceDetails {

	public static void main(String[] args) {
	
		LinkedList<TermLifeInsurance> lifeInsurance = new LinkedList<TermLifeInsurance>();
		lifeInsurance.add(new TermLifeInsurance("TATA AIA", 95.6d, 60, 3000000.0d, 2300.0d));
		lifeInsurance.add(new TermLifeInsurance("HDFC Met Life", 93.6d, 60, 4500000.0d, 3200.0d));
		lifeInsurance.add(new TermLifeInsurance("ICICI Prudential", 97.3d, 70, 5500000.0d, 3100.0d));
		lifeInsurance.add(new TermLifeInsurance("Baja Life Insurance", 92.1d, 65, 2000000.0d, 1700.0d));
		lifeInsurance.add(new TermLifeInsurance("PnB Met Life", 90.0d, 60, 4200000.0d, 1600.0d));
		
		for(TermLifeInsurance insurance : lifeInsurance) {
			System.out.println(insurance);
		}

	}

}

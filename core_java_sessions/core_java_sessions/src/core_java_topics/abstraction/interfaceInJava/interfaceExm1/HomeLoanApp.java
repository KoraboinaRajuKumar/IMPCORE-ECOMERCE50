package core_java_topics.abstraction.interfaceInJava.interfaceExm1;

public class HomeLoanApp {

	public static void main(String[] args) {

		BankBazar bankOfBaroda = new BankOfBaroda();
		BankBazar kotakBank = new KotakMahindra();
		BankBazar unionBank = new UnionBankOfIndia();
		
		System.out.println("This is Bank Of Baroda Rate Of Interest : " + bankOfBaroda.getHomeLoanROI("Bank Of Baroda"));
		System.out.println("This is Kotak Mahindra Bank Rate Of Interest : " + kotakBank.getHomeLoanROI("Kotak"));
		System.out.println("This is Union Bank Of India Rate OF Interest : " + unionBank.getHomeLoanROI("union bank"));
	}

}

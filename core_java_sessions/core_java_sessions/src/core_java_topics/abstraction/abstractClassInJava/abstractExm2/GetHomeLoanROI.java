package core_java_topics.abstraction.abstractClassInJava.abstractExm2;

public class GetHomeLoanROI {

	public static void main(String[] args) {

		BankBazaar hdfc = new HDFCHomeLoan();
		BankBazaar kotak = new KotakMahindraBank();
		BankBazaar union = new UnionBankOfIndia();
		System.out.println(hdfc.rateOfInterest() + " " + hdfc.processingFee());
		System.out.println(kotak.rateOfInterest() + " " + kotak.processingFee());
		System.out.println(union.rateOfInterest() + " " + union.processingFee());
	}

}

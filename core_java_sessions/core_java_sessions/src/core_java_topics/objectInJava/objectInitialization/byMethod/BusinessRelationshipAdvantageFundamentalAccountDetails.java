package core_java_topics.objectInJava.objectInitialization.byMethod;

public class BusinessRelationshipAdvantageFundamentalAccountDetails {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BusinessRelationshipAdvantageFundamentalAccount account1 = new BusinessRelationshipAdvantageFundamentalAccount();
		BusinessRelationshipAdvantageFundamentalAccount account2 = new BusinessRelationshipAdvantageFundamentalAccount();
		BusinessRelationshipAdvantageFundamentalAccount account3 = new BusinessRelationshipAdvantageFundamentalAccount();
		
		account1.insertAccInfoDetails(123456789l, "Mohammed Kamran", "Raichur Branch","Raichur City", 7207513883l, "Opp Court Complex",
				"Near Govt School", "Karnataka", 70000.0d);
		account2.insertAccInfoDetails(987654321, "Mohammed Zeeshan", "Hyderabad Branch","Hyderabad City", 7676394042l, "Near Zoo Park",
				"Boys Town School", "Telangana", 65000.0d);
		account3.insertAccInfoDetails(745680945l, "Mohammed Irfan", "Riyadh Branch","Riyadh City", 5495684126l, "Hara Hotel",
				"Dummy", "KSA", 32000.0d);
		
		account1.displayAccInfo();
		account2.displayAccInfo();
		account3.displayAccInfo();
		
	}

}

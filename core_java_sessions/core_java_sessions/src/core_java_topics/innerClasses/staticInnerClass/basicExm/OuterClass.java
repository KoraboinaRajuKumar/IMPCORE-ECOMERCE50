package core_java_topics.innerClasses.staticInnerClass.basicExm;

public class OuterClass {

	static long NUMBER = 4658965757l;
	private static String BANK_NAME = "Bank Of America";
	
	static class StaticInnerClass{
		
		static void displayInfo() {
			System.out.println("This number value is : " + NUMBER);
			System.out.println("Bank Name : " + BANK_NAME);
		}
	}
	
	public static void main(String[] args) {
		
		OuterClass.StaticInnerClass.displayInfo();
	}
}

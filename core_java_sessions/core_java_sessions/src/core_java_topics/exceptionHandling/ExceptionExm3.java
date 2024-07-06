package core_java_topics.exceptionHandling;

public class ExceptionExm3 {

	public static void main(String[] args) {
		System.out.println("Important Code 1");
		System.out.println("Important Code 2");
		try {
			String name = "Kamran";
			System.out.println("Length of name : " + name.length());
		} catch (NullPointerException npe) {
			npe.printStackTrace();
		}
		System.out.println("Important Code 3");
		System.out.println("Important Code 4");
	}
}

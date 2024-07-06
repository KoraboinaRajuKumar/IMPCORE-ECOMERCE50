package core_java_topics.exceptionHandling;

public class ExceptionFinnalyBlock {

	public static void main(String[] args) {
		System.out.println("Important Code 1");
		System.out.println("Important Code 2");
		try {
			   String name = null;
			   System.out.println("Length of Name : " + name.length());
		} catch(NullPointerException npe) {
			npe.printStackTrace();
		}
		finally {
			System.out.println("This block will always gets execute...");
		}
		System.out.println("Important Code 3");
		System.out.println("Important COde 4");
	}

}

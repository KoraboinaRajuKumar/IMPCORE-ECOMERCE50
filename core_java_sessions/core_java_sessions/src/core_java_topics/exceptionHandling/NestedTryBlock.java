package core_java_topics.exceptionHandling;

public class NestedTryBlock {

	public static void main(String[] args) {
		System.out.println("Statement 1");
		System.out.println("Statement 2");
		//outer try block
		try {
				//inner try block
				try {
						System.out.println("Statement 3");
						int number = 20/0;
						System.out.println("Value after division : " + number);
				}catch (ArithmeticException ae) {
					ae.printStackTrace();
				}
				//inner try block
				try {
						String name = null;
						System.out.println("Length of the name : " + name.length());
				}catch (NullPointerException npe) {
					npe.printStackTrace();
				}
			  
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			System.out.println("This will always get execute....");
		}

	}

}

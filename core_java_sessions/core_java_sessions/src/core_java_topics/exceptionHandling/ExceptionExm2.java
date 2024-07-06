package core_java_topics.exceptionHandling;

public class ExceptionExm2 {

	public static void main(String[] args) {
		System.out.println("Important Code 1");
		System.out.println("Important Code 2");
		try {
			int arr[] = {31,45,90,56,41};
			System.out.println("Element at 3 index : " + arr[3]);
		} catch (ArrayIndexOutOfBoundsException aie) {
			aie.printStackTrace();
		}
		System.out.println("Important Code 3");
		System.out.println("Important Code 4");

	}

}

package core_java_topics.exceptionHandling;

public class MultipleCatchBlock {

	public static void main(String[] args) {

		System.out.println("Importnat Code 1");
		System.out.println("Important Code 2");
		try {
				String name = null;
				int num = 100/50;
				int arr[] = {45,9,67,21,60};
				System.out.println("Length Of the name : " + name.length());
				System.out.println("Value after division : " + num);
				System.out.println("Element at 7th index : " + arr[3]);
				
		}catch (ArrayIndexOutOfBoundsException npe) {
			npe.printStackTrace();
		}catch (NullPointerException npe) {
			System.out.println("handled null pointer exception");
			npe.printStackTrace();
		}catch (ArithmeticException aie) {
			aie.printStackTrace();
		}catch (Exception e) {
			System.out.println("null pointer exception");
			e.printStackTrace();
		}finally {
			System.out.println("This code will always execute...");
		}
		System.out.println("Important Code 3");
	}

}

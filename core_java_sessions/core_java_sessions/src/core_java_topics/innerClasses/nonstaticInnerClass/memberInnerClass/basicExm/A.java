package core_java_topics.innerClasses.nonstaticInnerClass.memberInnerClass.basicExm;

public class A {

	private long number = 8765787896l;
	private String name = "Saba Naaz Siddiqui";
	
	//this is member inner class
	class B{
		public void displayB() {
			System.out.println("========== This is member inner class B =======");
			System.out.println("Number : " + number);
			System.out.println("Name : " + name);
		}
	}
	
	//declare outer class A method
	public void displayA() {
		System.out.println("This is Outer class A");
	}
	
	public static void main(String[] args) {
		
		A a = new A();
		A.B b = a.new B();
		b.displayB();
	}
}

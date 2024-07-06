package core_java_topics.abstraction.interfaceInJava.interfaceExm3;

public class C extends B{

	@Override
	public void method3() {
		System.out.println("This is method3()");
	}
	public static void main(String[] args) {
		
		C c = new C();
		c.method1();
		c.method2();
		c.method3();
		c.method4();
	}
}

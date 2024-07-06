package core_java_topics.abstraction.coupling.tightCoupling.basicExm;

public class A {

	B b;
	C c;
	D d;
	E e;
	
	public A() {
		
		b = new B();
		c = new C();
		d = new D();
		e = new E();
	}
	
	public void display() {
		System.out.println("This is Class A method");
		b.display();
		c.display();
		d.display();
		e.display();
	}
}

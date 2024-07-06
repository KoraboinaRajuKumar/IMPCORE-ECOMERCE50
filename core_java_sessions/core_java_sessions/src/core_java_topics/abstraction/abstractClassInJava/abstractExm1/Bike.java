package core_java_topics.abstraction.abstractClassInJava.abstractExm1;

public abstract class Bike {

	public abstract void run();
	public void price(double amt) {
		System.out.println("This is price method..." + amt);
	}
	public void bikeName(String bikeName) {
		System.out.println("this is : " + bikeName);
	}
}

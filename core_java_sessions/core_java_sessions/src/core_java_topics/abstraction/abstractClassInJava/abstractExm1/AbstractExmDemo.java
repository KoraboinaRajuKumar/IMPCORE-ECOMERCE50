package core_java_topics.abstraction.abstractClassInJava.abstractExm1;

public class AbstractExmDemo {

	public static void main(String[] args) {
		
		Bike tvs = new TVSScooter();
		tvs.run();
		
		Bike honda = new HondaActiva();
		honda.run();
		
		Bike ninja = new KwasakiNinja();
		ninja.run();
		ninja.price(300000.0d);
		ninja.bikeName("Ninja Bike");
	}
}

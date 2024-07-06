package designPatterns.creationalDesignPattern.factoryDesignPattern;

public class FarmerPlan extends Plan{

	@Override
	void getRate() {
		rate_per_unit = 5.0d;
	}

}

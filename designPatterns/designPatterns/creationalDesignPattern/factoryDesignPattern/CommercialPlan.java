package designPatterns.creationalDesignPattern.factoryDesignPattern;

public class CommercialPlan extends Plan{

	@Override
	void getRate() {
		rate_per_unit = 11.0d;
	}

}

package designPatterns.creationalDesignPattern.factoryDesignPattern;

public class PlanFactory {

	public Plan getPlan(String planName) {
		if(planName == null) {
			return null;
		}
		if(planName.equalsIgnoreCase("homeplan")) {
			return new HomePlan();
		}
		if(planName.equalsIgnoreCase("commercialplan")) {
			return new CommercialPlan();
		}
		if(planName.equalsIgnoreCase("farmerplan")) {
			return new FarmerPlan();
		}
		if(planName.equalsIgnoreCase("institutionalplan")) {
			return new InstitutionalPlan();
		}
		return null;
	}
}

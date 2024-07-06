package core_java_topics.abstraction.coupling.looseCoupling.realtimeExm;

public class ElectricityRecharge implements IRechargeService{

	@Override
	public void recharge() {
		System.out.println("This is Electricity Recharge.....");
	}

}

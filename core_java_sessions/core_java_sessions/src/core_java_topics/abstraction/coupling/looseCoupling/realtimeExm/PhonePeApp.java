package core_java_topics.abstraction.coupling.looseCoupling.realtimeExm;

public class PhonePeApp {

	public static void main(String[] args) {
		
		IRechargeService mobile = new MobileRecharge();
		IRechargeService dth = new DTHRecharge();
		IRechargeService fastTag = new FastTagRecharge();
		IRechargeService electricity = new ElectricityRecharge();
		IRechargeService gas = new GasRecharge();
		
		RechargeAmount amount1 = new RechargeAmount(mobile);
		amount1.rechargeBill(7207513883l,721d);
		System.out.println("==========================================");

		RechargeAmount amount2 = new RechargeAmount(dth);
		amount2.rechargeBill(31276895,1500d);
		
		System.out.println("==========================================");
		RechargeAmount amount3 = new RechargeAmount(fastTag);
		amount3.rechargeBill(7856,3000.0d);
		
		System.out.println("==========================================");
		RechargeAmount amount4 = new RechargeAmount(electricity);
		amount4.rechargeBill(33564656l,5000.0d);
		
		System.out.println("==========================================");
		RechargeAmount amount5 = new RechargeAmount(gas);
		amount5.rechargeBill(5465784898l,1100.0d);
		
		
	}

}

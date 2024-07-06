package designPatterns.creationalDesignPattern.factoryDesignPattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GenerateElectricityBillApp {

	public static void main(String[] args) {

		try {
			
				PlanFactory factory = new PlanFactory();
				System.out.println("Enter the plan name to generate the bill");
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				String pName = reader.readLine();
				
				System.out.println("Enter number of units consumed");
				int numberOfUnits = Integer.parseInt(reader.readLine());
				
				Plan plan = factory.getPlan(pName);
				System.out.println("Bill Amount generated for " + pName + " for number of units consumed " + numberOfUnits);
				plan.getRate();
				plan.calculateBill(numberOfUnits);
				
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

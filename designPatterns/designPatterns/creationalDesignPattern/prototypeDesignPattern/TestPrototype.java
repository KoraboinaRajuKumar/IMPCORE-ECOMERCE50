package designPatterns.creationalDesignPattern.prototypeDesignPattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestPrototype {
	
	public static void main(String[] args) {
		try {
			
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Please enter trans id");
				Long t_id = Long.parseLong(reader.readLine());
				System.out.println("Please enter trans date");
				String t_date = reader.readLine();
				System.out.println("Please enter trans amount");
				Double t_amt = Double.parseDouble(reader.readLine());
				System.out.println("Please enter trans type");
				String t_type = reader.readLine();
				Transaction tObj = new Transaction(t_id, t_date, t_amt, t_type);
				Transaction tObj1 = (Transaction) tObj.clone();
				System.out.println("============= This object is before cloning ==========================================");
				System.out.println(tObj);
				System.out.println("============= This object is after cloning ===========================================");
				System.out.println(tObj1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

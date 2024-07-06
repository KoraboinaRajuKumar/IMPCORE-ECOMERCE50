package designPatterns.structuralDesignPattern.facadeDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlipkartApplication {
	private static int choice;
	public static void main(String[] args) {
		try {
				do {
					  System.out.println("=============== Television Brands =================");
					  System.out.println("       1. Samsung        ");
					  System.out.println("       2. LG             ");
					  System.out.println("       3. Motorola       ");
					  System.out.println("       4. Exit           ");
					  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
					  try {
						  	choice = Integer.parseInt(reader.readLine());
					  }catch (NumberFormatException nfe) {
						nfe.printStackTrace();
					}catch (IOException ioe) {
						ioe.printStackTrace();
					}
					  FlipkartProducts products = new FlipkartProducts();
					  switch(choice) {
					  		case 1 : 
					  			  products.getSamsungTV();
					  			  break;
					  		case 2 :
					  			  products.getLGTV();
					  			  break;
					  		case 3 :
					  			  products.getMotorolaTV();
					  			  break;
					  		
					  		default :
					  			System.out.println("You have entered wrong option");
					  }
				}while(choice!=4);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}

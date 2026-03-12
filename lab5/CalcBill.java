/*
* @author: Leila Stowe
* CalcBill.java
*/

import java.util.Scanner;

public class CalcBill{
	public static void main(String args[]){
		double units, base, standard, premium;

		Scanner keyboard = new Scanner(System.in);
		ElectricityBill myBill = new ElectricityBill();

		System.out.println("Enter how many units have you used:");
		units = keyboard.nextDouble();
		myBill.setUnits(units);

		if(units < 1500){

			myBill.base(units);
			base = myBill.getBase();

			System.out.println("Your bill costs " + base + " and you are Base tier");

		}else if(units >= 1500 && units <=2500){

			myBill.standard(units);
			standard = myBill.getStandard();

			System.out.println("Your bill costs " + standard + " and you are Standard tier");

		}else if(units >2500){

			myBill.premium(units);
			premium = myBill.getPremium();

			System.out.println("Your bill costs " + premium + " and you are Premium tier");

		}else{
			System.out.println("Invalid entry");
		}

	}
}
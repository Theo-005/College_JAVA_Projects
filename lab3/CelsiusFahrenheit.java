/*
* @author: Leila Stowe
* CelsiusFahrenheit.java
*/

import java.util.Scanner;

public class CelsiusFahrenheit{
	public static void main(String args[]){
		int option;
		double degrees,convertF, convertC;

		Scanner keyboard;
		keyboard = new Scanner(System.in);

		System.out.println("Enter degrees:");
		degrees = keyboard.nextInt();
		System.out.println("Enter choice:");
		System.out.println("1 to convert degrees from Fahrenheit to Celcius");
		System.out.println("2 to convert degrees from Celsius to Fahrenheit");
		option = keyboard.nextInt();

		if (option==1){
			convertF = formulaOne(degrees);
			System.out.println(degrees + " Fahrenheit to Celsius is " + convertF);
		}else if(option==2){
			convertC = formulaTwo(degrees);
			System.out.println(degrees + " Celsius to Fahrenheit is " + convertC);
		}else{
			System.out.println("Invalid entry");
		}
	}

	public static double formulaOne(double degrees){
		double convertF	= (degrees-32)*5/9;
		return convertF;
	}

	public static double formulaTwo(double degrees){
		double convertC = (degrees*9/5)+32;
		return convertC;
	}


}
/*
* @author: Leila Stowe
* OddEven.java
*/

import java.util.Scanner;

public class OddEven{
	public static void main(String args[]){
		int num, evenAdd, oddAdd;

		Scanner keyboard;
		keyboard = new Scanner(System.in);

		System.out.println("Enter a whole number:");
		num = keyboard.nextInt();



		if (num%2 == 0){
			evenAdd = num + 3;
			System.out.println("Print: " + evenAdd/10);
			System.out.println("Print: " + evenAdd%10);

		}else if (num%2 != 0){
			oddAdd = num + 7;
			System.out.println("Print: " + oddAdd/10);
			System.out.println("Print: " + oddAdd%10);

		}else {
			System.out.println("Error ");
		}
	}
}
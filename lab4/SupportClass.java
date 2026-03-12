/*
* @author: Leila Stowe
* SupportClass.java
*/

import java.util.Scanner;

public class SupportClass {
	public static void main (String args[]){
		int subject,duration;

		Scanner keyboard;
		keyboard = new Scanner(System.in);

		System.out.println("Please select your subject: \n 1. JAVA \n 2. Databases");
		subject = keyboard.nextInt();
		System.out.println("Please enter the duration in minutes");
		duration = keyboard.nextInt();

		classDay(subject, duration);
	}

	public static void classDay(int subject, int duration){
		if(subject == 1){

			if(duration <= 30){
				System.out.println("Your support class is on Monday");
			}else if(duration  <= 60){
				System.out.println("Your support class is on Tuesday");
			}else{
				System.out.println("Invalid duration enrty");
			}


		}else if(subject == 2){

			if(duration <= 30){
				System.out.println("Your support class is on Wednesday");
			}else if(duration <= 60){
				System.out.println("Your support class is on Thursday");
			}else{
				System.out.println("Invalid duration enrty");
			}

		}else{
			System.out.println("Invalid subject enrty");
		}
	}

}
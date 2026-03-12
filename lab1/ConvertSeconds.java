import java.util.Scanner;

public class ConvertSeconds{

	public static void main (String args []){

		int inputSeconds;

		Scanner keyboard;
		keyboard = new Scanner (System.in);

		System.out.println("Enter second: ");
		inputSeconds= keyboard.nextInt();

		int hrs = inputSeconds/3600;
		int mins = (inputSeconds%3600)/60;
		int seconds =(inputSeconds%60) /1;

		System.out.println(inputSeconds + " seconds = " + hrs + " hours, " + mins + " minutes, " + seconds + " Seconds");
	}

}
/*
*Route66App.java
*6/3/26
*/

import java.util.Scanner;

public class Route66App{
	public static void main(String args[]){

		// variables and objects
		double length = 0.0;
		double speed = 0.0;
		double membersNum, totalTime, numOfBlocks, blocksPerMember, hoursLeft;

		Scanner keyboard = new Scanner(System.in);
		Route66 myRoute = new Route66();

		// input
		myRoute.setLength(3945);

		System.out.println("Enter the average speed:");
		speed = keyboard.nextInt();
		myRoute.setSpeed(speed);

		System.out.println("Enter the number of team members:");
		membersNum = keyboard.nextInt();
		myRoute.setMembersNum(membersNum);


		// process
		myRoute.calcTotalTime(length, speed);
		totalTime = myRoute.getTotalTime();

		myRoute.calcNumOfBlocks(totalTime);
		numOfBlocks = myRoute.getNumOfBlocks();

		myRoute.calcBlocksPerMember(numOfBlocks, membersNum);
		blocksPerMember = myRoute.getBlocksPerMember();

		myRoute.calcHoursLeft(numOfBlocks);
		hoursLeft = myRoute.getHoursLeft();

		// output
		System.out.println("The total time to complete is " + totalTime);
		System.out.println("The number of 15 hour blocks to be cycled is " + numOfBlocks);
		System.out.println("The blocks per team member is " + blocksPerMember);
		System.out.println("The hours leftover is " + hoursLeft);
	}
}
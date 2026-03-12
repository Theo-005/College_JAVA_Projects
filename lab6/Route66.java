/*
*Route66App.java
*6/3/26
*/

public class Route66{

		// data members
		private double length, speed, membersNum, totalTime, numOfBlocks, blocksPerMember, hoursLeft;


		// constructor
		public Route66(){
			length = 0;
			speed = 0;
			membersNum = 0;
			totalTime = 0;
		}

		// set
		public void setLength(double length){
			this.length = length;
		}

		public void setSpeed(double speed){
			this.speed = speed;
		}

		public void setMembersNum(double membersNum){
			this.membersNum = membersNum;
		}

		// calculate
		public void calcTotalTime(double length, double speed){
			totalTime = length/speed;
		}

		public void calcNumOfBlocks(double totalTime){
			numOfBlocks = totalTime/15;
		}

		public void calcBlocksPerMember(double numOfBlocks, double membersNum){
			blocksPerMember = numOfBlocks/membersNum;
		}

		public void calcHoursLeft(double numOfBlocks){
			hoursLeft = totalTime%(numOfBlocks*15);
		}


		// get
		public double getTotalTime(){
			return totalTime;
		}

		public double getNumOfBlocks(){
			return numOfBlocks;
		}

		public double getBlocksPerMember(){
			return blocksPerMember;
		}

		public double getHoursLeft(){
			return hoursLeft;
		}
	}
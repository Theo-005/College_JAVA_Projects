/*
*PasswordApp.java
*10/4/26
*/

import javax.swing.JOptionPane;

public class PasswordApp{
	public static void main (String args[]){

		//variables and objects
		Password myPassword = new Password();

		String fName,lName, id, password;
		id = "";
		int sizeID = 1;

		//input
		fName = JOptionPane.showInputDialog(null, "Enter your first name:");
		myPassword.setFName(fName);

		lName = JOptionPane.showInputDialog(null, "Enter your surname:");
		myPassword.setLName(lName);


		while(sizeID !=0){
			id = JOptionPane.showInputDialog(null, "Enter a six digit ID:");
			if(id.length() != 6){
				sizeID = 1;
			}else{
				sizeID = 0;
			}
		}

		myPassword.setId(id);

		//process
		myPassword.computePassword();
		password = myPassword.getPassword();



		//output
		JOptionPane.showMessageDialog(null, "Your password is " + password + "2026");

	}
}
/*
*Password.java
*10/4/26
*/

public class Password{

	private String fName, lName,id, password;
	private StringBuffer strBuff;

	//constructor
	public Password(){
		fName = "";
		lName = "";
		id = "";
		strBuff = new StringBuffer();
	}

	//set
	public void setFName(String fName){
		this.fName = fName;
	}

	public void setLName(String lName){
		this.lName = lName;
	}

	public void setId(String id){
		this.id = id;
	}


	//process
	public void computePassword(){
		int size = id.length();
		strBuff.append(id.charAt(0));
		strBuff.append(id.charAt(size - 1));
		strBuff.append(fName.charAt(0));
		strBuff.append(lName.charAt(0));
		password = strBuff.toString();
	}



	//get
	public String getPassword(){
		return password;
	}

}
/*
* @author: Leila Stowe
* ElectricityBill.java
*/

public class ElectricityBill{
	private double units, base, standard, premium;

	public ElectricityBill(){
		units = 0.0;
		base = 0.0;
		standard = 0.0;
		premium = 0.0;
	}

	public void setUnits(double units){
		this.units = units;
	}

	public void base(double units){
		base = units*5;
	}

	public void standard(double units){
			standard = units*5.5;
	}

	public void premium(double units){
			premium = units*5.75;
	}

	public double getBase(){
		return base;
	}

	public double getStandard(){
			return standard;
	}

	public double getPremium(){
			return premium;
	}

}
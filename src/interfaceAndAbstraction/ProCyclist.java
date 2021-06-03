package interfaceAndAbstraction;

import interfaceAndAbstraction.Interface.Bike;
import interfaceAndAbstraction.Interface.ProTeam;

public class ProCyclist extends Cyclist implements Bike, ProTeam {
	
	ProCyclist(String n, int a){
		super(n,a);
		iHaveBike();
		iHaveASupportTeam();
	}
	
	public void iHaveBike() {
		System.out.println("Since i am a pro, i have many carbon bikes!");
	}
	
	public void iHaveASupportTeam() {
		System.out.println("The support my team gives to me is my fuel when the time is dark and hard.");
	}
	
}

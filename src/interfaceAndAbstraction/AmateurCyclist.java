package interfaceAndAbstraction;

import interfaceAndAbstraction.Interface.Bike;
import interfaceAndAbstraction.Interface.DayJob;

public class AmateurCyclist extends Cyclist implements Bike, DayJob{
	
	AmateurCyclist(String n, int a) {
		super(n,a);
		iHaveBike();
		iHaveADayJob();
	}
	
	public void iHaveBike() {
		System.out.println("I am an Amateur cyclists, i have a almost top of the line bike.");
	}
	
	public void iHaveADayJob() {
		System.out.println("I have a day job.");
	}
	
}

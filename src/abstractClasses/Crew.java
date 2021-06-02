package abstractClasses;

public class Crew extends Person{
	
	Crew(String n, String l) {
		super(n,l);
	}
	
	public void introduceYourself() {
		System.out.println("I handle your bikes and your nutrition.");
	}
	
	public void whatDoCrewsDo() {
		System.out.println("i hugas ur bottles!");
	}

}

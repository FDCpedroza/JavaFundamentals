package inheritance;

public class Cyclist {
	
	String name;
	String skills;
	int age;
	
	Cyclist() {}
	
	Cyclist(String n, String s, int a) {
		this.name = n;
		this.skills = s;
		this.age = a;
		showDetails();
	}
	
	public void speakName () {
		System.out.println("NAME: " + this.name);
	}
	
	public void showDetails() {
		System.out.println("Name: " + this.name);
		System.out.println("Skilss: " + this.skills);
		System.out.println("Age: " + this.age);
	}

}

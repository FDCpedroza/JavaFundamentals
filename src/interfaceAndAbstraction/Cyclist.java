package interfaceAndAbstraction;

abstract class Cyclist {
	
	String name;
	int age;
	
	Cyclist(String n, int a) {
		this.name = n;
		this.age = a;
		speakCyclists();
		cycleNow();
	}
	
	public void cycleNow() {
		System.out.println("I am a cyclist, and i cycle.");
	}
	
	public void speakCyclists() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
	}
	
}

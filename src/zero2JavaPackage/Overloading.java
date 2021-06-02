package zero2JavaPackage;

public class Overloading {
	
	Diver d1;
	Diver d2;
	Diver d3;
	
	public Overloading() {
		d1 = new Diver();
		d2 = new Diver("Testing Name");
		d3 = new Diver("Name", "Freedive", 25);
	}
	
	public void testMethod() {
		d1 = new Diver();
		d2 = new Diver("Testing Name");
		d3 = new Diver("Name", "Freedive", 25);
	}

}

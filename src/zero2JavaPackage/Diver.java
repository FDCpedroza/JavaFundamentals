package zero2JavaPackage;

public class Diver {
	
	String fname;
	String type_of_dive;
	int age;
	
	
	public Diver() {
		this.showDetails();
	}
	
	public Diver(String fname) {
		this.fname = fname;
		this.showDetails(fname);
	}
	
	public Diver(String fname, String type_of_dive, int age) {
		this.fname = fname;
		this.type_of_dive = type_of_dive;
		this.age = age;
		this.showDetails(fname, type_of_dive, age);
	}
	
	public void print(String s) {
//		System.out.println("tests");
		System.out.println(s);
	}
	
	public void showDetails() {
		this.print("I dont have enogh data.");
	}
	
	public void showDetails(String fname) {
		this.print("Fname: " + fname);
	}
	
	public void showDetails(String fname, String type_of_dive, int age) {
		this.print("Fname: " + fname + "Type of Dive: "+ type_of_dive + "Age: " + age);
	}

}

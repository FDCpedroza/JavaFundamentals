package abstractClasses;

abstract class Person {
	
	String name;
	String location;
	
	Person() {}
	
	abstract void introduceYourself();
	
	Person(String n, String l) {
		this.name = n;
		this.location = l;
		introduceYourself();
	}
	
	public void speakPerson() {
		System.out.println("Name: " + name);
		System.out.println("Location: " + location);
	}
	
	

}

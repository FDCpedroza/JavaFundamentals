package abstractClasses;

public class Cyclist extends Person{
	
	Cyclist (String s, String l) {
		super(s,l);
	}
	
	public void introduceYourself() {
		System.out.println("I am a Cyclists!");
	}
	
	public void whatCyclistsDo() {
		System.out.println("I bike all the way.");
	}
	
	
}

	

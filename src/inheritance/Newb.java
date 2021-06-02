package inheritance;

public class Newb extends Cyclist {
	
	String knowledge;
	
	Newb() {}

	Newb(String n, String s, int a, String k) {
		super(n, s, a);
		this.knowledge = k;
		speakKnowl();
	}
	
	public void speakKnowl() {
		System.out.println("Knowledge: " + this.knowledge);
	}
	
}

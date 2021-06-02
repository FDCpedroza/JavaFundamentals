package abstractClasses;

public class Coach extends Person{

	Coach(String n, String l) {
		super(n,l);
	}
	
	public void introduceYourself() {
		System.out.println("I AM THE COACH, TRAIN U MADAFAKA CYCLIST!");
	}
	
	public void whatDoCoachesDo() {
		System.out.println("I Coach the cyclistserist!");
	}
	
}

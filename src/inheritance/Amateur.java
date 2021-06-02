package inheritance;

public class Amateur extends Newb {
	
	public Amateur() {}
	
	public Amateur (String n, String s, int a, String k) {
		super(n,s,a,k);
		tryToPerform();
	}
	
	public void tryToPerform() {
		System.out.println("i will do my best!!");
	}
	
}

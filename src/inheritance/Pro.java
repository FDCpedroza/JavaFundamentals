package inheritance;

public class Pro extends Amateur{
	
	public Pro(String n, String s, int a, String k) {
		super(n,s,a,k);
		doItNow();
	}
	
	public void doItNow() {
		System.out.println("Deliver And Perform! paker!");
	}
	
	public Pro() {}
	

}

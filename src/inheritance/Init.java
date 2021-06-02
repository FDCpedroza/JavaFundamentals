package inheritance;

public class Init {

	public static void main(String[] args) {
		
		Cyclist c = new Cyclist("name", "test", 25);
		System.out.println();
		
		Newb n = new Newb("newb name", "na skills", 25, "excitement");
		System.out.println();
		
		//cyc that is nb
		Cyclist cy = new Newb("newb2 name", "walang Skills", 26, "gero");
		System.out.println();
		
		
		Amateur a = new Amateur("Level2", "merong puso", 25, "practice!");
		System.out.println();
		
		Pro p = new Pro("Pro Ligid", "Perform!", 25, "you just need to do your best");
		System.out.println();
		
	
		//ang pro nag pa newb2 lol
		//polymorphism sample
		Cyclist pa_nb = new Pro("nakataghap!", "kabaw sad!", 25, "swerteas buang!");
		System.out.println();
		
		

	}

}

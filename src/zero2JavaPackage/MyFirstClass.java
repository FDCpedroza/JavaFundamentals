package zero2JavaPackage;

import java.util.Scanner;

public class MyFirstClass {
	

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//ask name
		//store name
		//print name
		
		String name;
		Scanner myS = new Scanner(System.in);
		
		System.out.print("Hi! whats ur name!");
		name = myS.nextLine();
		System.out.println("Nc to meet youu!" + name);
		System.out.println();
		System.out.println();
		
		new Overloading();	
//		oclass.testMethod();
	}

}

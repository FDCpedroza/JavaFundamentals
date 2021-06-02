package abstractClasses;

public class Init {

	public static void main(String[] args) {
		
		//you cant do this anymore
//		Person p = new Person("John", "USA"); 
//		p.speakPerson();
		
		
		//p1 can be cyclist, crew, coach
		//beacause he is a person 
		Person p1 = new Cyclist("Cyc1", "USA");
		p1.speakPerson();
		System.out.println();
		
		
		// basin start 
		Cyclist c = new Cyclist("name1", "Negros");
		c.speakPerson();
		c.whatCyclistsDo();
		System.out.println();
		
		Crew cr = new Crew("Danny", "Bohol");
		cr.speakPerson();
		cr.whatDoCrewsDo();
		System.out.println();
		
		Coach ch = new Coach("C Ansay", "SlamDunk");
		ch.speakPerson();
		ch.whatDoCoachesDo();
		System.out.println();
		
		
		
	
	}

}

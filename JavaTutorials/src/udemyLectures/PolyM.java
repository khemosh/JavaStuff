package udemyLectures;

public class PolyM {

	public static void main(String[] args) {
		
		
		// Person and Bob extends it..
		
		Person p = new Person();
		p.sleep();
		
		Bob bobby = new Bob();
		bobby.sleep();
		
		Person robert = new Bob();
		robert.sleep();
		
		sayAge(bobby);
		sayAge(p);
		sayAge(robert);
		

	}
	
	public static void sayAge(Person person){
		System.out.println("My age is: " + person.getAge());
	}

}

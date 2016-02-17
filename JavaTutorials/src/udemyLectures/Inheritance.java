package udemyLectures;

public class Inheritance {

	public static void main(String[] args) {
		Person p = new Person();
		p.sleep();
		
		Bob bob1 = new Bob();
		bob1.sleep(); //Overrides sleep in Person
		bob1.awake(); // calls awake in Person
		
		System.out.println(bob1.age); // gets age from Person
		/* System.out.println(bob1.gender); cannot access gender cos its private in Person */
		
		
		
		
		

	}

}

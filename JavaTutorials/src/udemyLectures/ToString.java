package udemyLectures;


class People{

	private String name;
	private int age;

	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		/*StringBuilder sb = new StringBuilder();
		sb.append(name).append(" : ").append(age);
		return sb.toString();
		*/
		// StringBuilder or this below is much more efficient than concat of strings
		return String.format("%4s :%d", name, age);
		
	}

}

public class ToString {

	public static void main(String[] args) {

		People person2 = new People("Bill", 56);
		People person1 = new People("Jim", 44);
		People person3 = new People("Mick", 33);
		
		
		// using toString is a good way to identify objects...
		System.out.println(person1.toString());
		System.out.println(person2.toString());
		System.out.println(person3.toString());

	}

}

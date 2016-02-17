package udemyLectures;

public class Bob extends Person {
	
	public String age = "Bob's age";
	
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public void sleep(){
		System.out.println("Bob is sleeping..zzzz");
	}
	
	public void speak(){
		System.out.println("Hello!");
	}
	
}

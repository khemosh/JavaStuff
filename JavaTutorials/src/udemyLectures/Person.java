package udemyLectures;

public class Person {
	
	protected String state = "alive"; // visible to the Bobs
	private String gender = "male"; // not visible to bobs
	public String age = "Person age"; // this or default visible to bobs
	
	public void sleep(){
		System.out.println("Sleeping..zzzz");
	}
	
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void awake(){
		System.out.println("Awake!!!");
	}

}

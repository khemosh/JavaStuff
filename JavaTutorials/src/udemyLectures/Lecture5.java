package udemyLectures;


// some comment here for the branch
public class Lecture5 {

	public static void main(String[] args) {
		// types of primitive variables

		int myInt = 5;
		double myDouble = 3.44;
		float myFloat = 5.66f;
		short myShort = 43;
		long myLong = 345464;
		byte myByte = 34;

		char myChar = 'f';

		boolean myBool = true;
		
		// String assignment and equality
		String one = new String("one");
		String two = "one";
		String three = "one";
		
		System.out.println(two.equals(one)); // two has the same value as one
		System.out.println(two == one); // but two does not point to the same thing as one ??
		System.out.println(two == three); // but here two points to the same thing as three cos the way it was assigned!!!

	}

}

package udemyLectures;

public class StringBuilderFormatting {

	public static void main(String[] args) {
		
		// StringBuffer is the same but its thread safe
		StringBuilder sb =  new StringBuilder();
		
		sb.append("Something");
		sb.append(" another thing");
		
		System.out.println(sb.toString());
		
		sb.append(" more here").append(" and more again");
		
		System.out.println(sb.toString());
		
		//formatting
		
		System.out.printf("here is a %d\n", 4);
		System.out.printf("and here is %6d\n", 4);
		System.out.printf("1 : a thing\n");
		System.out.printf("10 : anotther thing\n");  // doing this 10 knocks out the alignment
		System.out.printf("%2d : here is nice alignment\n", 1); // this way keeps the the alignment
		System.out.printf("%2d : here is nice alignment\n", 10);
		System.out.printf("%-3d : here is nice aligned the other way!\n", 1); // this way keeps the the alignment
		System.out.printf("%-3d : here is nice aligned the other way!\n", 100);
		
		// floating point numbers
		System.out.printf("Here is a float %.3f to 3 decimal places and rounded up\n", 5.3698542);
		
		// use indexOf to find a char in a string
		// or startsWith endsWith
		
		char c = '@';
		String b = "b";
		String word = "thing";
		String email = "b@something.com";
		String notEmail = "some other string";
		System.out.println("index: " + email.indexOf(c)); // returns the index of the char 
		System.out.println("index: " + notEmail.indexOf(c)); // or returns -1 if not there...use and if -1 to check!!!
		System.out.println("index of word etc: " + email.indexOf(word)); // use to find string. returns index of first char
		System.out.println(notEmail.endsWith(word)); // returns true or false
		System.out.println(email.startsWith(b));
		
		

	}

}

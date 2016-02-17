package udemyLectures;

import java.util.Scanner;

public class UserInput {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a string: ");
		
		String word = input.nextLine();
		
		System.out.println("You typed " + word);
		
		
	}
}

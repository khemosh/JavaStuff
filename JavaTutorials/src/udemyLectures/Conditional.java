package udemyLectures;

import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) {

		int newValue = 5;
		if (newValue < 10) {
			System.out.println("less than ten");
		}

		else if (newValue < 20) {
			System.out.println("greater than ten");
		}

		else {
			System.out.println("none of the above");
		}
		
		// Guessing game with a While loop
		int num = 6;

		System.out.println("What number am I thinking of?");

		Scanner input = new Scanner(System.in);

		int guess = input.nextInt();

		int guessCount = 1;

		while (guess != num) {
			System.out.println("Wrong guess again..");

			guessCount++;

			Scanner inputNext = new Scanner(System.in);

			guess = inputNext.nextInt();
		}

		System.out.printf("Right! Good guess. Got it on %d tries.", guessCount);
		
	}

}

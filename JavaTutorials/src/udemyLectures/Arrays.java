package udemyLectures;

public class Arrays {

	public static void main(String[] args) {

		int[] nums;
		nums = new int[3];

		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;

		// or

		int[] nums2 = { 4, 5, 6 };

		System.out.printf("Length of array 1 is: %d\n", nums.length);

		for (int num : nums) {
			System.out.println(num);
		}

		// multi dem array

		String words[][] = { { "first", "row", "here" },
				{ "second", "row", "here" }, { "last", "row" } };

		// iterate over this
		for (int row = 0; row < words.length; row++) {
			for (int col = 0; col < words[row].length; col++) {
				System.out.print(words[row][col] + "\t");

			}
			System.out.println();

		}

	}

}

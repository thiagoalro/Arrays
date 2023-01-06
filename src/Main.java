public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		int[] myArray = new int[5];
		// int[] myArray;
		// declare the array variable
		// myArray = new int[12];
		// create the array; assign to array variable
		String[] strings = new String[6];

		for (int counter = 0; counter < myArray.length; counter++) {
			System.out.printf("%d, %d%n", counter, myArray[counter]);
		}

		for (int counter = 0; counter < strings.length; counter++) {
			System.out.printf("%d, %s%n", counter, strings[counter]);
		}

	}
}
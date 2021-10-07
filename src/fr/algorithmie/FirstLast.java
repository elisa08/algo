package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {

		int[] array = { 17, 15, -3, 0, 8, 7, 4, -2, 28, 5, -1, 17, 2, 3, 0, 14, 17 };

		boolean val = false;

		for (byte i = 0; i <= array.length - 1; i++) {

			if (array[0] == array[array.length - 1] && array.length >= 1 ) {

				val = true;

			}

		}

		System.out.println(val);
		

	}

}

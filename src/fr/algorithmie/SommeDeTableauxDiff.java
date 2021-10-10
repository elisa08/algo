package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {

		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 } ;
		int[] arraySomme = new int[array.length];

		for (byte i = 0; i <= array2.length - 1; i++) {

			arraySomme[i] = array2[i] + array[i];

			System.out.println(arraySomme[i]);
		}
		for (int i = array2.length-1; i < arraySomme.length; i++) {
			
			arraySomme[i]= array[i];
			System.out.println(arraySomme[i]);
			
		}
		
	}
}

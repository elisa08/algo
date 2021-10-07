package fr.algorithmie;

public class CaculMoyenne {


	public static void main(String[] args) {
		
		
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int somme=0;
		
		for (byte i = 0; i <= array.length - 1; i++) {

			somme= array[i]+somme;
				
		}
		
		System.out.println(somme/array.length);
		
	}
	
}

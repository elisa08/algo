package fr.algorithmie;

public class RechercherMax {
	
	public static void main(String[] args) {
		
		
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14,8} ;
		int max=0;
		
		for (byte i = 0; i <= array.length - 1; i++) {

			if(array[i]>max) {
				
				max= array[i];
				
				
				
			}

		}
		
		System.out.println(max);
		
	}
	
}

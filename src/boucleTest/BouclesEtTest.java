package boucleTest;

public class BouclesEtTest {
	
	
	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		for(byte i=0;i<= array.length-1;i++) {
			
			System.out.println("nombre: "+array[i]);
			
		}
		
		for (int i = array.length - 1; i >= 0; i--) {

			System.out.println(array[i]);

		}
		
		for (byte i = 0; i <= array.length-1; i++) {

			if (array[i] > 3) {

				System.out.println("Nombres sup à 3 : " + array[i]);
				
			}
		}
		
		for (int i = 0; i <= array.length-1; i++) {

			if (array[i] % 2 == 0 && array[i] != 0) {

				System.out.println("Nombres pairs : " + array[i]);
			}
		}
		
		for (int i = 0; i <= array.length-1; i++) {

			if (i % 2 == 0 && i != 0) {

				System.out.println("index pairs : " + i);
			}
		}

		for (int i = 0; i <= array.length-1; i++) {

			if (array[i] % 2 != 0) {

				System.out.println("Nombres impairs : " + array[i]);
			}
		}
		
		
	}
	
	
	

}

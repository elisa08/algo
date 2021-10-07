package fr.algorithmie;

import java.util.Arrays;

public class Rotation {
	
	public static void main(String[] args) {

		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
	
		int[] arrayCopie = null;
		
		array[0]= array[array.length-1];
		
		arrayCopie= Arrays.copyOf(array, array.length-1);
		
	   for(int i=0;i< arrayCopie.length;i++) {
		   
		   System.out.println(arrayCopie[i]);
	   }
		

	}

}

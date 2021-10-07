package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		
		
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 5, -1, 17, 2, 3, 0, 14, 17} ;
		
		boolean val= false;
		
		for (byte i = 0; i <= array.length - 1; i++) {
			
			
			
			if(array[i] == 6 || array[0] == 6 || array[array.length-1] == 6) {
				
				val= true;
					
				
			}
			 
		}
		
		
		System.out.println(val);
		
		
	}
}

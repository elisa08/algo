package fr.boucles;

public class ExerciceBoucleBase {
	
	public static void main(String[] args) {
		
		
		for(byte i=1;i<=10;i++) {
			
			System.out.println(i);
			
		}
		
		String prenom="Elisa";
		
		byte j=0;
		
		while(j < 20) {
			
			j++;
			System.out.println(j+prenom);
			
		}
		
		for (byte i = 2; i <= 100; i++) {

			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		for (byte i = 1; i <= 99; i++) {

			if (i % 2 != 0) {
				
				System.out.println(i);
			}
			
		}
			
		
	}
	
}

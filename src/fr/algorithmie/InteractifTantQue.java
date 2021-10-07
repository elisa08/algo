package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
	

	public static void main(String[] args) {
		
		
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Ecrire un nombre : ");
		
		int nb= scanner.nextInt();
		
	
		
		while(nb>=1) {
			
	
			
			if(nb<1 || nb>10) {
				
				System.out.println("Entrer un nombre entre 1 et 10.");
				
				nb= scanner.nextInt();
				
				
				
			}else {
				
				
				System.out.println("Nombre choisi : "+nb);
				
				break;
				
			}
			
		
			
		 
		
			
			
		}
		
		
	
		
	}

}

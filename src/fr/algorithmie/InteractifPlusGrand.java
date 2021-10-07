package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ecrire dix nombre : ");
		int nb = 0;
		int[] nombres= new int[10];
		
		int nbLePlusGrd=0;
		
		for (int i=0;i < nombres.length;i++) {
		
			System.out.println("Encore un nombre : ");
			nb = scanner.nextInt();
			nombres[i]= nb;
		
			
			if(nombres[i]>nbLePlusGrd) {
				
				nbLePlusGrd= nombres[i];
				
			}
			
		}

		System.out.println("Le nombre le plus grand est " + nbLePlusGrd);
		

	}
}

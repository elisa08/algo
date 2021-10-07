package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ecrire un nombre : ");

		int nb = scanner.nextInt();
	
		
		while (nb >= 1) {

			if (nb < 1 || nb > 10) {

				System.out.println("Entrer un nombre entre 1 et 10.");

				nb = scanner.nextInt();

			} else {
				
				
				for (int i = 1; i <= 10; i++) {

					int tab= nb*i;

					System.out.println( nb + "x" + i + " = " +tab);
					
				}
				
				break;
			}

		}

	}

}

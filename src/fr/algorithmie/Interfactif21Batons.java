package fr.algorithmie;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Interfactif21Batons {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int t = 0;
		int[] joueurs = new int[2];

		int[] batons = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < batons.length; i++) {
			
		
			System.out.println(t);
			
		
			t++;
			if (t > 1) {

				t = 0;

			}
			
			System.out.println("Entrer un nombre joueur ");

			int choix = scanner.nextInt();

			
			

			System.out.println("-"+t);

			while (joueurs[t] <= 3) {

				int length = batons.length;
				length = length - choix;
				batons = Arrays.copyOf(batons, length);

				for (int j = 0; j < batons.length; j++) {

					System.out.println(batons[j]);

				}

				break;
			}

	
		}
	}

}

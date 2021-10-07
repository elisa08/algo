package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ecrire un nombre : ");

		int nb = scanner.nextInt();

		int j = 0;
		int somme = 0;

		while (j < nb) {

			j++;

			somme = somme + j;

		}
		System.out.println(somme);

	}
}

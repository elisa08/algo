package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {
	public static void main(String[] args) {

		int[] array = new int[0];

		int[] arrayCopy = null;

		Scanner scanner = new Scanner(System.in);
		int option = 0;

		while (option != 3) {

			System.out.println("Saisir votre choix : ");

			option = scanner.nextInt();

			int nb = 0;

			switch (option) {

			case 1:

				System.out.println("Donner un nombre");

				nb = scanner.nextInt();
				arrayCopy = Arrays.copyOf(array, array.length + 1);
				arrayCopy[arrayCopy.length - 1] = nb;
				array = arrayCopy;



				break;

			case 2:
				for (int j = 0; j < array.length; j++) {

					System.out.println(array[j]);

				}
				break;

			default:
				System.out.println("Option invalide. Recommencer.");

				break;

			}

		}
	}
}

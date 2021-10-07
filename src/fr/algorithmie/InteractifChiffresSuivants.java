package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ecrire un nombre : ");

		int nb = scanner.nextInt();
		
		int j= 0;

		while (j < 10) {
			
			j++;
			
			int nombre=nb+j;
			
			System.out.println(nombre);

		}

	}

}

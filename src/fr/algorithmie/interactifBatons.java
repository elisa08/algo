package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class interactifBatons {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int nbBaton = 21;
	
		while (nbBaton > 0) {

			int nbJoueur1 = (int) (Math.random() * 3 + 1);
			
			
			nbBaton = nbBaton - nbJoueur1;
			System.out.println("Nombre de batons restants : "+nbBaton);
			
			if (nbBaton <= 0) {

				System.out.println("Vous avez perdu !");
				break;

			}
			
			System.out.println("Entrez un nombre joueur 2");

			int nbJoueur2 = scanner.nextInt();
			if (nbJoueur2 <= 3) {
				nbBaton = nbBaton - nbJoueur2;
				System.out.println("Nombre de batons restants : "+nbBaton);
			}else {
				
				System.out.println("Entrez un nombre entre 1 et trois");
				break;
			}
			
			if(nbBaton<=0) {
				
				System.out.println("Joueur 2, vous avez perdu !");
				break;
			}
			



		}

				


	
		}

}

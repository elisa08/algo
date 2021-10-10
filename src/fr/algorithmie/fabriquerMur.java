package fr.algorithmie;

public class fabriquerMur {
	public static void main(String[] args) {
		verifier(3,1,8,true);
		
		
	}
	 static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {
		 
		nbSmall= 1*nbSmall;
		nbBig= 5*nbBig;
		int res= nbBig+nbSmall;
		 boolean resultat=false;
		if(res == longueur) {
		
		  resultat= true;
		  
		}
		return resultat;
	 }
	 
	 private static void verifier(int nbSmall, int nbBig, int longueur, boolean b) {

		if(!fabriquerMur(nbSmall,  nbBig, longueur) == b) {
			
			System.out.println(nbSmall+" "+nbBig+" "+longueur+" ne permettent pas de fabriquer un mur.");
			
		}
		
		 
	 }

}

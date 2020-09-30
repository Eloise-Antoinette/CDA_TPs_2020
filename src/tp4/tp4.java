package tp4;

import outils.Clavier;
import outils.MaDate;

public class tp4 {

	public static void main(String[] args) {
		MaDate.aujourdhui();
		MaDate.maintenant();
		MaDate.saisirDate();
		moyenne();
		// TODO Auto-generated method stub
		/*int i, n, som;
		som = 0;
		i = 0;
*/
		/*
		 * Original
		 * 
		 * for (i = 0; i < 4; i++) { System.out.println(i+"-Donnez un entier"); n =
		 * Clavier.lireInt(); som += n; } System.out.println("Somme = " + som);
		 */

		/*
		 * Avec le while while( i <4) { System.out.println(i+"-Donnez un entier"); n =
		 * Clavier.lireInt(); som += n; i++; } System.out.println("Somme = " + som);
		 */

		/*
		 * Avec le do while do { System.out.println(i+"-Donnez un entier"); n =
		 * Clavier.lireInt(); som += n; i++; } while (i < 4);
		 * System.out.println("Somme = " + som);
		 */

		  
		 
	}
	
	public static void moyenne() {
		  //Exercice moyenne 
		  
		  System.out.println("entrez note 1"); int note1 = Clavier.lireInt();
		  System.out.println("entrez note 2"); int note2 = Clavier.lireInt();
		  System.out.println("entrez note 3"); int note3 = Clavier.lireInt();
		  System.out.println("entrez note 4"); int note4 = Clavier.lireInt();
		  
		  int moy = (note1 + note2 + note3 + note4)/4; if(moy >= 10) {
		  System.out.println("vous êtes admis"); } else if (moy >=8) {
		  System.out.println("vous êtes admissible"); } else {
		  System.out.println("recalé"); }
		
	}

}

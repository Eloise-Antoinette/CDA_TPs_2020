package tp3_4;

import outils.Clavier;

public class Tp3 {

	public static void main(String[] args) {
		System.out.println("enter values");
		int valeur1 = Clavier.lireInt();
		int valeur2 = Clavier.lireInt();
		int valeur3 = Clavier.lireInt();
		int valeur4 = Clavier.lireInt();
		
		compareValues(valeur1, valeur2, valeur3, valeur4);
		/*
		 * System.out.println("Veuillez saisir la note"); double note =
		 * Clavier.lireInt(); admission(note);
		 */

	}

	public static void compareTwoValues(int valeur1, int valeur2) {

		int greatestValue = valeur2;
		/*
		 * if (valeur1 > valeur2) { System.out.println(valeur1); } else {
		 * System.out.println(valeur2); }
		 */
		if (valeur1 > valeur2) {
			greatestValue = valeur1;
		}

		System.out.println(greatestValue);

	}

	public static void compareValues(int valeur1, int valeur2, int valeur3, int valeur4) {

		

		int greatestValue = valeur4;

		if (valeur1 > valeur2 && valeur1 > valeur3 && valeur1 > 4) {
			greatestValue = valeur1;
		} else if (valeur2 > valeur3 && valeur2 > valeur4) {
			greatestValue = valeur2;
		} else if (valeur3 > valeur4) {
			greatestValue = valeur3;
		} 
		
		
		System.out.println("greatest value = " + greatestValue);
	}

	public static void admission(double note) {

		String admission = "Vous êtes ";

		if (note >= 10) {

			admission += "admise";

		} else {
			if (note >= 8) {
				admission += "sur liste d'attente";
			} else {
				admission += "refusée";
			}
		}

		mention(note);
		System.out.println(admission);

	}

	public static void mention(double note) {

		String mention = "Vous avez la mention ";

		if (note >= 16) {
			mention += "très bien";
		} else if (note >= 14) {
			mention += " bien";
		} else if (note >= 12) {
			mention += " assez bien";
		} else {
			mention = "";
		}
		System.out.println(mention);
	}

}

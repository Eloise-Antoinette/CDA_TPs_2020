package tp3_4;

import outils.Clavier;

public class Tp3 {

	public static void main(String[] args) {

		
	}
	
	// Exercice 1

	/*
	 * Launches the exercices 1
	 * */
	
	public static void launchesNote() {

		System.out.println("Veuillez saisir la note");
		double note = Clavier.lireInt();
		admission(note);

	}
	
	/*
	 * checks admission
	 * 
	 * */
	
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
	
	/*
	 * checks mention
	 * 
	 * */
	
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

	

	// Exercice 2

	/*
	 * Launches Compare Values
	 * */
	public static void launchesCompareValues() {

		System.out.println("enter values");
		int valeur1 = Clavier.lireInt();
		int valeur2 = Clavier.lireInt();
		int valeur3 = Clavier.lireInt();
		int valeur4 = Clavier.lireInt();

		compareValues(valeur1, valeur2, valeur3, valeur4);
	}

	
	/*
	 * compare 2 values
	 * 
	 * @param valeur1, valeur2
	 * 
	 * */
	public static int compareTwoValues(int valeur1, int valeur2) {

		int greatestValue = valeur2;
		/*
		 * if (valeur1 > valeur2) { System.out.println(valeur1); } else {
		 * System.out.println(valeur2); }
		 */
		if (valeur1 > valeur2) {
			greatestValue = valeur1;
		}

		return greatestValue;

	}
	
	public static int compareFast(int valeur1, int valeur2) {
		return ( valeur1 > valeur2)? valeur1:valeur2;
	}

	/*
	 * compare 4 values
	 * 
	 * @param valeur1, valeur2, valeur3, valeur4
	 * 
	 * */
	
	public static int compareValues(int valeur1, int valeur2, int valeur3, int valeur4) {

		int greatestValue = valeur4;

		if (valeur1 > valeur2 && valeur1 > valeur3 && valeur1 > valeur4) {
			greatestValue = valeur1;
		} else if (valeur2 > valeur3 && valeur2 > valeur4) {
			greatestValue = valeur2;
		} else if (valeur3 > valeur4) {
			greatestValue = valeur3;
		}

		return greatestValue;
	}


	

	public static void unitTestAlike() {
		System.out.println("Test 1 " + (compareTwoValues(-5, 2) == 2));
	}

	public static void testForCompareTwoValues() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {

				System.out.println("entre " + i + " et " + j + " la plus grande valeur est " + compareTwoValues(i, j));
			}
		}
	}

}

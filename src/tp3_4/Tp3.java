package tp3_4;

public class Tp3 {

	public static void main(String[] args) {

		System.out.println("Veuillez saisir la note");

		int note = Clavier.lireInt();

		if (note >= 10) {
		
			System.out.println("Vous êtes admise");
			
			if ( note < 12) {
				System.out.println("Votre mention est assez bien");	
			} else if ( note < 14) {
				System.out.println("Votre mention est bien");			
			} else if (note < 16) {
				System.out.println("Votre mention est très bien");
			} 
		} else {
			if(note >= 8 ) {
				System.out.println("Vous êtes sur liste d'attente");
			} else {
				System.out.println("Vous êtes refusée");
			}
		}
		
		
	}

}

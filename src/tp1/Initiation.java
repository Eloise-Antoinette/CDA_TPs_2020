package tp1;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Scanner;

public class Initiation {

	/**
	 * Execution
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		afficheDate();

		Date dateEloise = new Date(94, 9, 22);
		Profil eloise = new Profil("moreau","eloise", dateEloise, "Toulouse");
			
		etatCivil(eloise);
		
		saisir();
		
		saisirNouvelEtatCivil();
		
	}

	/**
	 * Change le format de la date et l'affiche
	 * 
	 * @param une_date
	 */
	public static void afficheDate() {
		Date ma_date = new Date();
		long time = ma_date.getTime();
		SimpleDateFormat mon_format = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Affichage de la date :");
		System.out.println(mon_format.format(ma_date));
		System.out.println("");
	}

	/**
	 * Appelle la methode d'affichage de l'Etat civil de l'objet Profil
	 * 
	 * @param profil
	 */
	public static void etatCivil(Profil profil){
        profil.afficherEtatCivil();
     }	

	
	/**
	 * Saisit le nom et salue la personne
	 */
	public static void saisir(){
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Veuillez saisir votre nom"); 
	    String nom = sc.nextLine(); 
	    String nomUppercase = nom.substring(0, 1).toUpperCase() + nom.substring(1);
	    System.out.println("Bonjour, " + nomUppercase);
	    System.out.println("");
	}
	
	
	/**
	 * Saisit les données, crée le nouveau Profil, affiche ses données
	 **/
	public static void saisirNouvelEtatCivil() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nous allons vous créer un profil"); 
		System.out.println("Veuillez saisir votre nom"); 
	    String nom= sc.nextLine();
	    System.out.println("Veuillez saisir votre prénom"); 
	    String prenom = sc.nextLine();
	    System.out.println("Veuillez saisir votre date de naissance (dd/mm/yyyy)"); 
	    String date = sc.nextLine();
	    System.out.println("Veuillez saisir ville de naissance"); 
	    String ville = sc.nextLine();

		System.out.println("");
	    
	    Date date1;
	  
	    try {
			date1= new SimpleDateFormat("dd/MM/yyyy").parse(date);
		} catch (ParseException e) {
			date1= new Date(0, 0, 0);
		}
	    
	    Profil nouvellePersonne = new Profil(nom, prenom, date1, ville);
	    nouvellePersonne.afficherEtatCivil();
	    
	    
		
	}
	 

}
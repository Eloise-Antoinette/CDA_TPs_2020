package tp1;
import java.text.SimpleDateFormat;
import java.util.Date;

/* Objet Profil */
public class Profil {

	String modelNom;
	String modelPrenom;
	Date modelDate;
	String modelVille;

	/**
	 * Constructor
	 * 
	 * @param nom, prenom, date, ville
	 */
	
	public Profil(String nom, String prenom, Date date, String ville) {
		modelNom = nom;
		modelPrenom = prenom;
		modelDate = date;
		modelVille = ville;
	}

	/* Getter & Setters */

	public String getModelNom() {
		return modelNom;
	}

	public void setModelNom(String modelNom) {
		this.modelNom = modelNom;
	}

	public String getModelPrenom() {
		return modelPrenom;
	}

	public void setModelPrenom(String modelPrenom) {
		this.modelPrenom = modelPrenom;
	}

	public Date getModelDate() {
		return modelDate;
	}

	public void setModelDate(Date modelDate) {
		this.modelDate = modelDate;
	}

	public String getModelVille() {
		return modelVille;
	}

	public void setModelVille(String modelVille) {
		this.modelVille = modelVille;
	}

	
	/**
	 * Affichage de l'état civil
	 * 
	 * reformatation de la date, mise en majuscule des initiales, et affichage des données mises en page
	 * 
	 */
	
	public void afficherEtatCivil() {
		
		// Verification et reformatation de la date de naissance
		
		String myDate;
		
		Date wrongDate = new Date(0, 0, 0);

		if(modelDate.compareTo(wrongDate) == 0) {
			myDate = "Il semblerait que nous ne reconnaissions pas le format de la date que vous avez entrée";
		} else {
			SimpleDateFormat dateMonFormat = new SimpleDateFormat("dd/MM/yyyy");
			myDate = dateMonFormat.format(modelDate);	
		}
		
		// Initiales en majuscules
		
		String nomUppercase = modelNom.substring(0, 1).toUpperCase() + modelNom.substring(1);
		String prenomUppercase = modelPrenom.substring(0, 1).toUpperCase() + modelPrenom.substring(1);
		String villeUppercase = modelVille.substring(0, 1).toUpperCase() + modelVille.substring(1);

		// Affiche les données
		System.out.println("");
		System.out.println("Affichage de l'état civil : ");
		System.out.println("Nom Prénom : " + nomUppercase + " " + prenomUppercase);
		System.out.println("Date de naissance : " + myDate);
		System.out.println("Ville : " + villeUppercase);
		System.out.println("");
	}

}

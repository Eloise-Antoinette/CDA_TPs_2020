package PierreFeuilleCiseaux;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PFCMain {

	static int scorePlayer;
	static int scoreComputer;
	static List<String> pfc = Arrays.asList("pierre", "feuille", "ciseaux");

	/**
	 * Main : Greeting user at the beginning & Launches the game
	 * 
	 * @author ELO.MOREAU
	 * @param args
	 */
	public static void main(String[] args) {
		greetings();
		gamePlay();
	}

	/**
	 * greetings : Greets user and gives the game rules
	 * 
	 * @author ELO.MOREAU
	 */
	public static void greetings() {
		System.out.println("Bienvenue dans votre Pierre Feuille Ciseaux ! Vous allez jouer contre l'ordinateur");
		System.out.println("Petit rappel : la pierre écrase les ciseaux, la feuille enrobe la pierre et les ciseaux découpent la feuille.");
	}

	/**
	 * gamePlay : gets the entry of the user and the entry from the computer
	 * Launches the comparison and gives finals results
	 * 
	 * @author ELO.MOREAU
	 */
	public static void gamePlay() {

		String playerRound = receivePlayerRound(pfc);
		String computerRound = receiveComputerRound(pfc);

		System.out.println(compareResults(playerRound, computerRound));
		givesResults();
	}

	/**
	 * receivePlayerRound : gets the user entry and checks its validity
	 * 
	 * @author ELO.MOREAU
	 * @param pfc
	 */
	public static String receivePlayerRound(List<String> pfc) {
		Scanner sc = new Scanner(System.in);
		String entry;
		do {
			System.out.println("C'est votre tour : veuillez entrer \"pierre\" ou \"feuille\" ou \"ciseaux\"");
			entry = sc.nextLine().toLowerCase();
			entry = entry.replace(" ", "");
			if (!pfc.contains(entry)) {
				System.out.println("votre entrée n'est pas valide");
				entry = null;
			}
		} while (!pfc.contains(entry));
		System.out.println("vous avez entré " + entry);
		return entry;

	}

	/**
	 * receivePlayerRound : gets the computer entry by Random function from the pfc
	 * array
	 * 
	 * @author ELO.MOREAU
	 * @param pfc
	 */
	public static String receiveComputerRound(List<String> pfc) {
		Random rand = new Random();
		String round = pfc.get(rand.nextInt(pfc.size()));
		System.out.println("Votre adversaire a joué : " + round + " !");
		return round;
	}

	/**
	 * compareResults() : compare user and computer entries and launches result()
	 * 
	 * @author ELO.MOREAU
	 * @param player, computer
	 */
	public static String compareResults(String player, String computer) {

		String result = "";
		List<String> pfcrules = Arrays.asList("La pierre écrase les ciseaux, ", "La feuille enveloppe la pierre, ", "Les ciseaux découpent la feuille, ");
		
		if (player.equals(computer)) {
			result = result("");
		} else {
			switch (player) {
			case "pierre":
				switch (computer) {
				case "feuille":
					result = pfcrules.get(1) + result("lost");
					break;
				case "ciseaux":
					result = pfcrules.get(0) + result("won");
					break;
				}
				break;
			case "feuille":
				switch (computer) {
				case "ciseaux":
					result = pfcrules.get(2) + result("lost");
					break;
				case "pierre":
					result = pfcrules.get(1) + result("won");
					break;
				}
				break;
			case "ciseaux":
				switch (computer) {
				case "pierre":
					result = pfcrules.get(0) + result("lost");
					break;
				case "feuille":
					result = pfcrules.get(2) + result("won");
					break;
				}
				break;
			}
		}

		return result;

	}

	/**
	 * equality : Gives results message / doesn't change the score
	 * 
	 * @author ELO.MOREAU
	 */
	public static String result(String res) {

		String result = "";
		switch(res) {
		case "won" : 
			result = "vous avez donc gagné !";
			scorePlayer++;
			break;
		case "lost" : 
			result = "vous avez donc perdu !";
			scoreComputer++;
		case "" : 
			result = "Il y a donc égalité !";
		}
		return result;

	}

	/**
	 * lost : Gives totals scores Asks if the player wants to continue : launches
	 * another game || says goodbye
	 * 
	 * @author ELO.MOREAU
	 */
	public static void givesResults() {

		String pt = scorePlayer < 2 ? " point" : " points";
		System.out.println("Votre score : " + scorePlayer + pt);

		pt = scoreComputer < 2 ? " point" : " points";
		System.out.println("Le score de votre adversaire : " + scoreComputer + pt);

		Scanner sc = new Scanner(System.in);
		System.out.println("Voulez vous continuer la partie ? oui/non");
		String entry = sc.nextLine();
		if (entry.equals("oui")) {
			gamePlay();
		} else {
			System.out.println("Merci d'avoir joué ! A très vite ! ");
		}

	}

}

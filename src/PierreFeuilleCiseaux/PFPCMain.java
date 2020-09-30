package PierreFeuilleCiseaux;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PFPCMain {

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
	 * gamePlay : gets the entry of the user and the entry from the computer,
	 * Launches the comparison and gives finals results
	 * 
	 * @author ELO.MOREAU
	 * */
	public static void gamePlay() {
		
		String playerRound = receivePlayerRound(pfc);
		String computerRound = receiveComputerRound(pfc);
		
		compareResults(playerRound, computerRound);
		givesResults();
	}

	/**
	 * greetings : Greeting user and gives the game rules
	 * 
	 * @author ELO.MOREAU
	 */
	public static void greetings() {
		System.out.println("Bienvenue dans votre Pierre Feuille Ciseaux ! Vous allez jouer contre l'ordinateur");
		System.out.println("Petit rappel : la pierre écrase les ciseaux, la feuille enrobe la pierre et les ciseaux découpent la feuille.");
	}

	/**
	 * receivePlayerRound : gets the user entry and checks its validity
	 * 
	 * @author ELO.MOREAU
	 * @param pfc
	 */
	public static String receivePlayerRound(List<String> pfc) {
		Scanner sc = new Scanner(System.in);
		System.out.println("C'est votre tour : veuillez entrer \"pierre\" ou \"feuille\" ou \"ciseaux\"");
		String entry = sc.nextLine().toLowerCase();
		entry = entry.replace(" ", "");
		if (pfc.contains(entry)) {
			System.out.println("vous avez entré " + entry);
			return entry;
		} else {
			System.out.println("votre entrée n'est pas valide");
			receivePlayerRound(pfc);
			return null;
		}

	}

	/**
	 * receivePlayerRound : gets the computer entry by Random function from the pfc array
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
	 * compareResults() : compare user and computer entries and launches won(), lost(), or equality().
	 * 
	 * @author ELO.MOREAU
	 * @param player, computer
	 */
	public static void compareResults(String player, String computer) {
		
				
		if (player.equals(computer)) {
			equality();
		} else {
			switch (player) {
			case "pierre":
				switch (computer) {
				case "feuille":
					lost();
					break;
				case "ciseaux":
					won();
					break;
				}
				break;
			case "feuille":
				switch (computer) {
				case "ciseaux":
					lost();
					break;
				case "pierre":
					won();
					break;
				}
				break;
			case "ciseaux":
				switch (computer) {
				case "pierre":
					lost();
					break;
				case "feuille":
					won();
					break;
				}
				break;
			}
		}

	}

	/**
	 * equality : Gives results message / doesn't change the score
	 * 
	 * @author ELO.MOREAU
	 */
	public static void equality() {
		System.out.println("Il y a donc égalité !");
	}

	/**
	 * lost : Gives results message / add a point to the computer Score
	 * 
	 * @author ELO.MOREAU
	 */
	public static void lost() {
		System.out.println("Vous avez donc perdu !");
		scoreComputer ++;
	}
	
	/**
	 * win : Gives results message / add a point to the user Score
	 * 
	 * @author ELO.MOREAU
	 */
	public static void won() {
		System.out.println("Vous avez donc gagné !");
		scorePlayer ++;
	}
	
	/**
	 * lost : Gives totals scores 
	 * Asks if the player wants to continue : launches another game || says goodbye
	 * 
	 * @author ELO.MOREAU
	 */
	public static void givesResults() {
		
		if(scorePlayer < 2) {
			System.out.println("Votre score : " + scorePlayer + " point");
		} else {
			System.out.println("Votre score : " + scorePlayer + " points");	
		}
		
		if(scoreComputer < 2) {
			System.out.println("Votre score : " + scoreComputer + " point");
		} else {
			System.out.println("Le score de votre adversaire : " + scoreComputer + " points");
		}
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Voulez vous continuer la partie ? oui/non");
		String entry = sc.nextLine();
		if(entry.equals("oui")) {
			gamePlay();
		} else {
			System.out.println("Merci d'avoir joué ! A très vite ! ");
		}
		
	}

}

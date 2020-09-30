package outils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MaDate {

	public static void aujourdhui() {
		Date ajd = new Date();
		SimpleDateFormat dateMonFormat = new SimpleDateFormat("dd/MM/yyyy");
		String ajdString = dateMonFormat.format(ajd);
		System.out.println(ajdString);

	}

	public static void maintenant() {
		Date ajd = new Date();
		SimpleDateFormat dateMonFormat = new SimpleDateFormat("hh:mm");
		String ajdString = dateMonFormat.format(ajd);
		System.out.println(ajdString);

	}

	public static void saisirDate() {

		String date = Clavier.lireString();

		Date date1;

		;
		try {
			date1 = new SimpleDateFormat("dd/MM/yyyy").parse(date);
		} catch (ParseException e) {
			date1 = new Date(0, 0, 0);
		}

		System.out.println(date1);

		Date wrongDate = new Date(0, 0, 0);

		if (date1.compareTo(wrongDate) == 0) {
			String myDate = "Il semblerait que nous ne reconnaissions pas le format de la date que vous avez entrée";
		} else {
			SimpleDateFormat dateMonFormat = new SimpleDateFormat("dd/MM/yyyy");
			String myDate = dateMonFormat.format(date1);
			System.out.println("myDate" + myDate);
		}
	}

}

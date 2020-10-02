package PierreFeuilleCiseaux;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class pfcTest extends PFCMain {

	
	static List<String> pfc = Arrays.asList("pierre", "feuille", "ciseaux");
	static List<String> results = Arrays.asList("Vous avez donc gagné !", "Vous avez donc perdu !", "Il y a donc égalité !");
	
	@Test
	void test() {
		//gagné
		assertEquals(results.get(0), compareResults(pfc.get(0), pfc.get(2)));
		assertEquals(results.get(0), compareResults(pfc.get(1), pfc.get(0)));
		assertEquals(results.get(0), compareResults(pfc.get(2), pfc.get(1)));
		
		//perdu
		assertEquals(results.get(1), compareResults(pfc.get(0), pfc.get(1)));
		assertEquals(results.get(1), compareResults(pfc.get(1), pfc.get(2)));
		assertEquals(results.get(1), compareResults(pfc.get(2), pfc.get(0)));
		
		//égalité
		assertEquals(results.get(2), compareResults(pfc.get(0), pfc.get(0)));
		assertEquals(results.get(2), compareResults(pfc.get(1), pfc.get(1)));
		assertEquals(results.get(2), compareResults(pfc.get(2), pfc.get(2)));
		
	}

}

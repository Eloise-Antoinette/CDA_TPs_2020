package outils;

import static org.junit.Assert.*;

import org.junit.Test;

public class testMaDate extends MaDate {

	@Test
	public void test() {
		assertEquals(true, isBisextile(2016));
		assertEquals(true, isBisextile(2000));
		assertEquals(false, isBisextile(2003));
		assertEquals(false, isBisextile(2100));
		assertEquals(false, isBisextile(1900));
		
	}

}

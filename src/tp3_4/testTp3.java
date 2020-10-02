package tp3_4;

import static org.junit.Assert.*;

import org.junit.Test;

public class testTp3 extends Tp3 {

	@Test
	public void testCompareTwoValues() {
		assertEquals(12, compareTwoValues(1, 12));
		assertEquals(8, compareTwoValues(4, 8));
		assertEquals(1, compareTwoValues(-1, 1));
		assertEquals(-9, compareTwoValues(-48, -9));
	}
	
	@Test
	public void testCompareValues() {
		assertEquals(1, compareValues(2,5,8,12));
		assertEquals(22, compareValues(22,4,-8,2));
		assertEquals(15, compareValues(2,5,-14,15));		
		assertEquals(6, compareValues(6,5,-2,4));
		
	}
	
	@Test
	public void testCompareFast() {
		assertEquals(12, compareFast(1, 12));
		assertEquals(8, compareFast(4, 8));
		assertEquals(1, compareFast(-1, 1));
		assertEquals(-9, compareFast(-48, -9));
	}

}

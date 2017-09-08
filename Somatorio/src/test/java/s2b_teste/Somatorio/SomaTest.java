package s2b_teste.Somatorio;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomaTest {

	@Test
	public void testThatZeroPlusZeroIsZero() {
		double expected = 0;
		double actual = Soma.soma(0,0);
		assertEquals(expected, actual, 1);
	}
	
	@Test
	public void testThatZeroPlusOneIsOne() {
		double expected = 1;
		double actual = Soma.soma(1,0);
		assertEquals(expected, actual,1 );
	}
	
	@Test
	public void testThatHalfPlusHalfIsOne() {
		double expected = 1;
		double actual = Soma.soma(0.5,0.5);
		assertEquals(expected, actual, 0.1);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testFirstNumberIsNegativeGivesException(){
		Soma.soma(-10, 0);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testSecondNumberIsNegativeGivesException(){
		Soma.soma(0, -10);
	}
	
}

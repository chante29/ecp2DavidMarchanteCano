package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
	private Fraction f;
	private Fraction f1;
	private Fraction f2;
	

	@Before 
	public void before() { 
		f = new Fraction(2, 3); 
		this.f1 = new Fraction(2,3);
		this.f2 = new Fraction(4,6);
	} 

	@Test 
	public void testFractionIntInt() { 
		assertEquals(2, f.getNumerator()); 
		assertEquals(3, f.getDenominator()); 
	} 

	@Test
	public void testDecimal() {
		assertEquals(0.66, f.decimal(), 0.01);
	} 

	@Test
	public void testIsEquivalente(){
		assertEquals(false, this.f1.isEquivalente(f2));
		assertEquals(true, this.f.isEquivalente(f1));
	}
}
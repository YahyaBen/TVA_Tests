package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import mains.TVAServices;

public class TVAServicesTest {
	TVAServices a;
	@Before
	public void setUp() throws Exception {
		 a = new TVAServices();
	}

	@After
	public void tearDown() throws Exception {
		a=null;
	}

	@Test
	public void testCalculer() {
		a.setTauxTVA(0);
		assertEquals(0, a.calculer(100));// Vrai
	}
	@Test
	public void testCalculer1() {
		a.setTauxTVA(10);
		assertEquals(10, a.calculer(100));// Vrai
	}
	@Test
	public void testCalculer2() {
		a.setTauxTVA(20);
		assertEquals(21, a.calculer(100));// Faux
	}
	@Test
	public void testCalculer3() {
		a.setTauxTVA(30);
		assertEquals(30, a.calculer(100));//Vrai
	}
}

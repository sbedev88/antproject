package testunitaire;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatriceTest {

	@SuppressWarnings("unused")
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		Calculatrice c = new Calculatrice();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddition() {
		
		double expected = 30;
		double actual = Calculatrice.addition(10, 20);
		
		
		Assert.assertEquals(expected, actual, 0.000001);
		
		
	}

	/**
	 * Test method for {@link testunitaire.Calculatrice#soustraire(double, double)}.
	 */
	@Test
	public void testSoustraire() {

		double expected = 10;
		double actual = Calculatrice.soustraire(30, 20);
		
		Assert.assertEquals(expected, actual, 0.000001);
	
	}
	
	@Test
	public void testDiviser() {

		double expected = 15;
		double actual = Calculatrice.diviser(30, 2);
		
		Assert.assertEquals(expected, actual, 0.000001);
	
	}

}

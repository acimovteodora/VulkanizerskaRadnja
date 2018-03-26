package guma;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AutoGumaTest {
	
	private AutoGuma guma;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		guma = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		guma = null;
	}

	@Test
	public void testSetMarkaModel() {
		guma.setMarkaModel("Pirelli B Zero");
		assertEquals("Pirelli B Zero", guma.getMarkaModel());
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelPrazanString() {
		guma.setMarkaModel("");
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelKraciNaziv() {
		guma.setMarkaModel("P");
	}
	
	
	
	@Test 
	public void testSetPrecnik() {
		guma.setPrecnik(18);
		assertEquals(18, guma.getPrecnik());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikManjegPrecnika() {
		guma.setPrecnik(5);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikVecegPrecnika() {
		guma.setPrecnik(500);
	}

	
	
	@Test
	public void testSetSirina() {
		guma.setSirina(200);
		assertEquals(200, guma.getSirina());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaManja() {
		guma.setSirina(80);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaVeca() {
		guma.setSirina(400);
	}

	
	

	@Test
	public void testSetVisina() {
		guma.setVisina(45);
		assertEquals(45, guma.getVisina());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaManja() {
		guma.setVisina(12);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaVeca() {
		guma.setVisina(180);
	}
	
	
	

	@Test
	public void testToString() {
		guma.setMarkaModel("Matador MP47 Hectorra 3");
		guma.setPrecnik(18);
		guma.setSirina(200);
		guma.setVisina(45);
		assertEquals("AutoGuma [markaModel=Matador MP47 Hectorra 3, precnik=18, sirina=200, visina=45]",guma.toString());
	}
	
	@Test
	public void testEqualsObjectTrue() {
		guma.setMarkaModel("Matador MP47 Hectorra 3");
		guma.setPrecnik(18);
		guma.setSirina(200);
		guma.setVisina(45);
		
		AutoGuma guma2 = new AutoGuma();
		guma2.setMarkaModel("Matador MP47 Hectorra 3");
		guma2.setPrecnik(18);
		guma2.setSirina(200);
		guma2.setVisina(45);
		
		assertTrue(guma.equals(guma2));
	}
	
	@Test
	public void testEqualsObjectFalse() {
		guma.setMarkaModel("Matador MP47 Hectorra 3");
		guma.setPrecnik(18);
		guma.setSirina(200);
		guma.setVisina(45);
		
		AutoGuma guma2 = new AutoGuma();
		guma2.setMarkaModel("Matador GP47 Hectorra 3");
		guma2.setPrecnik(18);
		guma2.setSirina(200);
		guma2.setVisina(45);
		
		assertFalse(guma.equals(guma2));
	}
	

}

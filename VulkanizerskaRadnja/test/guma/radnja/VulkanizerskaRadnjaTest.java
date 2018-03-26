package guma.radnja;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import guma.AutoGuma;

public class VulkanizerskaRadnjaTest {
	
	private VulkanizerskaRadnja radnja;
	private AutoGuma guma;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		radnja = new VulkanizerskaRadnja();
		guma = new AutoGuma();
		
		guma.setMarkaModel("Pirelli B Zero");
		guma.setPrecnik(18);
		guma.setSirina(200);
		guma.setVisina(45);
	}

	@After
	public void tearDown() throws Exception {
		radnja = null;
		guma = null;
	}

	
	
	@Test
	public void testDodajGumu() {
		radnja.dodajGumu(guma);
		assertEquals(radnja.pronadjiGumu(guma.getMarkaModel()).get(0), guma);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajGumuNull() {
		guma = null;
		radnja.dodajGumu(guma);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajGumuContains() {
		radnja.dodajGumu(guma);
		radnja.dodajGumu(guma);
	}

	
	
	
	@Test 
	public void testPronadjiGumuNull() {
		assertEquals(null, radnja.pronadjiGumu(null));
	}
	
	@Test 
	public void testPronadjiGumuNePostoji() {
		radnja.dodajGumu(guma);
		assertEquals(0,radnja.pronadjiGumu("Matador MP47 Hectorra 3").size());
	}

	
	@Test
	public void testPronadjiGumuJednaGuma() {
		AutoGuma guma2 = new AutoGuma();
		guma2.setMarkaModel("Matador MP47 Hectorra 3");
		guma2.setPrecnik(20);
		guma2.setSirina(210);
		guma2.setVisina(50);
		
		radnja.dodajGumu(guma);
		radnja.dodajGumu(guma2);
		
		LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();
		gume.add(guma2);
		
		assertTrue(radnja.pronadjiGumu(guma2.getMarkaModel()).equals(gume));
	}
	
	@Test
	public void testPronadjiGumuViseGuma() {
		AutoGuma guma2 = new AutoGuma();
		guma2.setMarkaModel("Matador MP47 Hectorra 3");
		guma2.setPrecnik(20);
		guma2.setSirina(210);
		guma2.setVisina(50);
		
		AutoGuma guma3 = new AutoGuma();
		guma3.setMarkaModel("Pirelli B Zero");
		guma3.setPrecnik(20);
		guma3.setSirina(180);
		guma3.setVisina(50);
		
		radnja.dodajGumu(guma);
		radnja.dodajGumu(guma2);
		radnja.dodajGumu(guma3);
		
		LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();
		gume.addFirst(guma);
		gume.addFirst(guma3);
		
		assertTrue(radnja.pronadjiGumu(guma3.getMarkaModel()).equals(gume));
	}
}

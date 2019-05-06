package Tester;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Hospital.Personal;
public class PersonalTest {
Personal personal1 =null;
Personal personal2 = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		//int identificador, String nombre, String puesto
		personal1=new Personal(1,"David","Celador");
		personal2=new Personal(2,"Gustavo","Enfermero");
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEsCelador() {
		assertTrue(personal1.esCelador());
		assertFalse(personal2.esCelador());
	}
	@Test
	public void test() {
		
	}/*
	@Test
	public void test() {
		fail("Not yet implemented");
	}*/

}

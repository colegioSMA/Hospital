package Pruebas;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import Hospital.*;

public class PersonalTest {

	Personal personal;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		personal=new Personal(1, "Pedro","Celador");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void esCelador() {
		assertTrue(personal.esCelador());
		personal.setPuesto("Cirujano");
		assertFalse(personal.esCelador());
	}

}

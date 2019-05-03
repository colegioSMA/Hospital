package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import hospital.Personal;

public class personalTest {
	Personal personal = null;
	Personal personal1 = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		personal = new Personal(0, "Carlos", "Celador");
		personal1 = new Personal(0, "Jaime", "Enfermero");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void esCeladorTest() {
		assertTrue(personal.esCelador());
		assertFalse(personal1.esCelador());
	}

}

package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Hospital.Personal;

public class PersonalTest {
	
	Personal personal=null;
	

	@Before
	public void setUp() throws Exception {
		personal= new Personal(1, "Juan", "Celador");
	}

	@Test
	public void esCeladorTest() {		
			
		assertTrue(personal.esCelador());
		
		personal.setPuesto("celador");
		assertFalse(personal.esCelador());
	}

}

package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Hospital.Personal;

public class PersonalTest {
	
	Personal[] personal =  null;

	@Before
	public void setUp() throws Exception {
		
		personal = new Personal[4];
		
		personal[0] = new Personal(1,"Manuel", "Enfermero");
		personal[1] = new Personal(2,"Pedro", "Celador");
		personal[2] = new Personal(3,"María", "Enfermera");
		
	}

	@Test
	public void esCeladorTest1() {
		
		assertTrue(personal[1].esCelador());
		
	}
	
	@Test
	public void esCeladorTest2() {
		
		assertFalse(personal[0].esCelador());
		
	}

}

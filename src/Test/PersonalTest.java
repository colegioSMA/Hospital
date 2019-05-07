package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Hospital.Personal;

public class PersonalTest {
	Personal personal1= new Personal("Jose", "Celadora");

	@Test
	public void testesCelador() {
		assertTrue(personal1.esCelador());
		assertFalse(!personal1.esCelador());
		
	}
	


}

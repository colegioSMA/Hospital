package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Hospital.Personal;

public class PersonalTest {

	@Test
	public void esCeladorTest() {
		
		Personal p = new Personal(1,"Jorge", "Celador");
		Personal p2 = new Personal(2,"Mario", "Medico");

		boolean a = p.esCelador();
		boolean b = p2.esCelador();
		
		assertTrue(a);
		assertFalse(b);
		
	}

}

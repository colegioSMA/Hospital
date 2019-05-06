package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Hospital.Paciente;
import Hospital.Personal;

public class PersonalTest {
	Personal p = null;
	Personal p2 = null;
	
	@Before
	public void setUp() throws Exception{
		 p = new Personal(1,"Jorge", "Celador");
		 p2 = new Personal(2,"Mario", "Medico");
	}
	
	
	//Ejercicio 9 

	@Test
	public void esCeladorTest() {
		
		assertTrue(p.esCelador());
		assertFalse(p2.esCelador());
	}
	
	

}

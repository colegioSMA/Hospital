package Pruebas;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import Hospital.*;

public class PacienteTest {

	Paciente paciente;
	
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		paciente=new Paciente(1,"Pepe",20,"66548219","123456789as");
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected=NullPointerException.class)
	public void identificadorTest() {
		paciente.setIdentificador(1);
	}

	@Test
	public void esNumeroSSValidoTest() {
		assertTrue(paciente.esNumeroSSValido());
	}
	
	@Test
	public void esMayorEdadTest() {
		boolean edad=true;
		
		if(paciente.esMayorEdad()) {
			edad=false;
		}
		
		assertFalse(edad);
		
	}
}

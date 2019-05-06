package Tester;

import Hospital.Paciente;
//int identificador, String nombre, int edad, String telefono, String numeroSeguridadSocial
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PacienteTest {
 Paciente paciente1=null;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		paciente1=new Paciente(1,"Paco",22,"689514295","12345678910");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected=NullPointerException.class)
	public void testlanzaExcepcion() {
		paciente1.setIdentificador(23);
		
	}
	@Test
	public void seguridadSocial() {
		
	assertTrue(paciente1.esNumeroSSValido());
	paciente1.setNumeroSeguridadSocial("33");
	assertFalse(paciente1.esNumeroSSValido());
	}
		@Test
	public void mayor_edad() {
		paciente1.setEdad(16);
		assertFalse(paciente1.esMayorEdad());
	}
/*	@Test
	public void test() {
		fail("Not yet implemented");
	}*/

}

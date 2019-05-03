package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import hospital.Paciente;

public class pacienteTest {
	Paciente paciente = null;
	Paciente paciente1 = null;
	Paciente paciente2 = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		paciente1 = new Paciente(0, "Pablo", 18, "654542453", "12345678912");
		paciente2 = new Paciente(0, "Pablo", 12, "653342453", "12345678912");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected = Exception.class)
	public void setIdentificadorTest() throws NullPointerException {
		paciente = new Paciente(0, "Pablo", 19, "657688655", "123456789101");
		paciente.setIdentificador(2);
	}

	@Test
	public void esNumeroSSValidoTest() {
		assertTrue(paciente1.esNumeroSSValido());
	}

	@Test
	public void esMayorEdadTest() {
		assertFalse(paciente2.esMayorEdad());
	}
}

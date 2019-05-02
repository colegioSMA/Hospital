package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Hospitalclases.*;

public class PacienteTest {
	
Paciente paciente=new Paciente(1,"David",18,"666547895","11234567890");

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected=NullPointerException.class)
	public void nomodificarId() {
		paciente.setIdentificador(8);
		
	}
	@Test
	public void esNumeroValido() {
		assertTrue(paciente.esNumeroSSValido());
	//he probado tambien que si se introduce un numero mas largo el resultado sea false y no valido por tanto
	//	paciente.setNumeroSeguridadSocial("112345678902");
	//	assertFalse(paciente.esNumeroSSValido());
	}
	@Test
	public void nomayorDeEdado() {
		paciente.setEdad(16);
		assertFalse(paciente.esMayorEdad());
		
	}

}

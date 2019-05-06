package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import Hospital.Paciente;



public class PacienteTest {
	Paciente p = null;
	Paciente p2 = null;
	
	
	@Before
	public void setUp() throws Exception{
		p = new Paciente(1, "Juan", 33, "915252348", "12345678901");
		p2 = new Paciente(1, "Juan", 16, "915252348", "12345678901");
	}
	
	
	//Ejercicio6

	
	@Test (expected = NullPointerException.class)
	public void setIdentificadorTest() {

		p.setIdentificador(4);
		
	}

	
	//Ejercicio7
	@Test
	public void esNumeroSSValidoTest(){

		assertTrue(p.esNumeroSSValido());
	}
	
	
	//Ejercicio8
	
	@Test
	public void esMayorEdadTest() {


		assertFalse(p2.esMayorEdad());
	}

	
}

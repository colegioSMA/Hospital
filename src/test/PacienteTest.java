package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Hospital.Paciente;

public class PacienteTest {
	
	Paciente[] paciente = null;

	@Before
	public void setUp() throws Exception {
		
		paciente = new Paciente[4];
		
		paciente[0]= new Paciente(1,"Manuel", 34,"676567765", "28056754323");
		paciente[1]= new Paciente(2,"Manuel", 16,"676567765", "28056754323");
		paciente[2]= new Paciente(3,"Manuel", 34,"676567765", "28056754323");
		
	}

	@Test(expected = NullPointerException.class)
	public void setIdentificadorTest() {
		
		paciente[0].setIdentificador(3);
		
	}
	
	@Test
	public void esNumeroSSValidoTest() {
		
		assertTrue(paciente[1].esNumeroSSValido());
		
	}
	
	@Test
	public void esMayorEdadTest() {
		
		assertFalse(paciente[1].esMayorEdad());
		
	}
	
	
	

}

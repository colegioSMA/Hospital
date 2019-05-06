package Test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import Hospital.Paciente;



public class PacienteTest {
	
	//Ejercicio6

	
	@Test (expected = NullPointerException.class)
	public void setIdentificadorTest() {
		
		Paciente p = new Paciente(1, "Juan", 33, "915252348", "12345678901");

		p.setIdentificador(4);
		
	}

	
	//Ejercicio7
	@Test
	public void esNumeroSSValidoTest(){
		
		Paciente p = new Paciente(1, "Juan", 33, "915252348", "12345678901");
		
		boolean a  = p.esNumeroSSValido();
		
		assertTrue(a);
	}
	
	//Ejercicio8
	
	@Test
	public void esMayorEdadTest() {
		
		Paciente p = new Paciente(1, "Juan", 16, "915252348", "12345678901");

		boolean a = p.esMayorEdad()	;
		
		assertFalse(a);
	}

	
}

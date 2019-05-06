package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import Hospital.Paciente;

public class PacienteTest {
	
	Paciente paciente;

	@Before
	public void setUp() throws Exception {
		paciente= new Paciente(1,"Jose",20,"66548219","123456789as");
	}
	
	@Test(expected=NullPointerException.class)
	public void setIdentificadorTest() {	
		paciente.setIdentificador(2);
		
	}
	
	@Test
	public void esNumeroSSValidoTest() {		
		assertTrue(paciente.esNumeroSSValido());		
		
	}
	
	@Test
	public void esMayorEdadTest() {
		
		boolean esCierto=true;
		
		if(paciente.esMayorEdad()) {
			esCierto=false;
		}
		assertFalse(esCierto);				
	}
	
	
	}
	



package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import Hospital.Paciente;

public class PacienteTest {
	
	Paciente paciente;	

	@Before
	public void setUp() throws Exception {
		paciente= new Paciente(1,"Jose",18,"66548219","123456789as");
	}
	
	@Test
	public void setIdentificadorTest() {	
		
		boolean seHaLanzado=false;
		
		try {
			paciente.setIdentificador(2);
		} catch (NullPointerException e) {
			seHaLanzado=true;
		}
		
		assertTrue(seHaLanzado);
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
	



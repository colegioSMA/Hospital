package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Hospital.Paciente;

public class PacienteTest {
	Paciente paciente1 = new Paciente("Pepe", 14, "23445", "1234");
	
	

	
@Test(expected=NullPointerException.class)
public void testSetIdentificador() {
	paciente1.setIdentificador(22);
}
@Test
public void testEsNumeroSSValido() {
	
	assertTrue(paciente1.esNumeroSSValido());
	
}
@Test
public void testEsMayorDeEdad() {
	assertTrue(paciente1.esMayorEdad());
}




}

package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Hospital.Paciente;
import Hospital.Personal;
import Hospital.Sistema;

public class SistemaTest {
Sistema sistema = null;
Personal personal1 = null;
Personal personal2 = null;
Personal personal3 = null;
Paciente paciente1 = null;
Paciente paciente2 = null;
Paciente paciente3 = null;
List<Personal> trabajadores = null;
List<Paciente> pacientes = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		
		personal1  = new Personal(1,"Jorge", "Celador");
		personal2 = new Personal(2,"Mario", "Medico");
		personal3 = new Personal(3,"Dudio", "Medico"); 
		
		 paciente1 = new Paciente(1, "Juan", 33, "915252348", "12345678901");
		 paciente2 = new Paciente(2, "Jose", 16, "915252348", "12345678901");
		 paciente3 = new Paciente(3, "Jorge", 35, "915252348", "12345678901");
		 
		 trabajadores = new ArrayList<>();
		 pacientes = new ArrayList<>();
		 
		 trabajadores.add(personal1);
		 trabajadores.add(personal2);
		 pacientes.add(paciente1);
		 sistema = new Sistema(pacientes, trabajadores);
		 
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void hayMasPersonalQuePacientes() {

		assertTrue(sistema.hayMasPersonalQuePacientes());
		assertEquals(true, sistema.hayMasPersonalQuePacientes());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void anadePacienteTest1() {
		
		List<Paciente>pacientesAux = new ArrayList<>();
		pacientesAux.add(paciente1);
		
		sistema.anadePaciente(paciente1);
	}
	
	@Test
	public void anadePacienteTest2() {
		
		
		List<Paciente>listaPacientes = new ArrayList<>();
		listaPacientes.add(paciente1);
		listaPacientes.add(paciente2);
		
		sistema.anadePaciente(paciente2);

		assertArrayEquals(listaPacientes.toArray(), sistema.getListaPacientes().toArray());
		assertNotNull(listaPacientes);
	}
	
	@Test
	public void anadePersonalTest() {
		
		List<Personal>listaPersonal = new ArrayList<>();
		listaPersonal.add(personal1);	
		listaPersonal.add(personal2);	
		listaPersonal.add(personal3);	
		
		sistema.anadePersonal(personal3);
		assertArrayEquals(listaPersonal.toArray(), sistema.getListaPersonal().toArray());
		assertNotNull(sistema.getListaPersonal());
	}
}

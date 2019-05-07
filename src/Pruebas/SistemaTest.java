package Pruebas;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import Hospital.*;

public class SistemaTest {
	List<Personal> listaPersonal;
	List<Paciente> listaPacientes;
	Sistema sistema;
	Paciente paciente1;
	Paciente paciente2;
	Personal personal1;
	Personal personal2;
	Personal personal3;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		paciente1=new Paciente(1,"Pepe",20,"66548219","123456789as");
		paciente1=new Paciente(2,"Maria",20,"66548219","123456789as");
		personal1= new Personal(1, "Pedro","Celador");
		personal2= new Personal(1, "Cesar","Cirujano");
		personal3= new Personal(1, "Eva","Celador");
		List<Paciente> listaPacientes = new ArrayList<>();
		listaPacientes.add(paciente1);
		listaPacientes.add(paciente2);
		List<Personal> listaPersonal = new ArrayList<>();
		listaPersonal.add(personal1);
		listaPersonal.add(personal2);
		listaPersonal.add(personal3);
		sistema=new Sistema(listaPacientes, listaPersonal);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void hayMasPersonalQuePacientesTest() {
		assertTrue(sistema.hayMasPersonalQuePacientes());
		assertEquals(true, sistema.hayMasPersonalQuePacientes());
		
	}
	@Test(expected=IllegalArgumentException.class)
	public void anadePacienteTest() {
		sistema.anadePaciente(paciente1);
		
	}
	@Test
	public void anadePacienteNuevoTest() {
		
		List<Paciente> listaAux = Arrays.asList(paciente1, paciente2);
		assertArrayEquals(listaAux.toArray(), listaPacientes.toArray());
		assertNotNull(sistema.getListaPacientes());
		
	}
}

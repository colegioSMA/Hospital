package Tester;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

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
	Sistema sistema1 = null;
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
		personal1 = new Personal(1, "David", "Celador");
		personal2 = new Personal(2, "Gustavo", "Enfermero");
		personal3 = new Personal(3, "Maria", "Enfermero");
		paciente1 = new Paciente(1, "Paco", 22, "689514295", "12345678910");
		paciente2 = new Paciente(1, "Po", 22, "689514295", "12345678910");
		trabajadores = new ArrayList<>();
		pacientes = new ArrayList<>();
		trabajadores.add(personal1);
		trabajadores.add(personal2);
		pacientes.add(paciente1);
		sistema1 = new Sistema(pacientes, trabajadores);

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testmaspersonalquepacientes() {
		assertTrue(sistema1.hayMasPersonalQuePacientes());
		assertEquals(true, sistema1.hayMasPersonalQuePacientes());

	}

	@Test(expected=IllegalArgumentException.class)
	public void testAñadePaciendeYaExiste() {
		sistema1.anadePaciente(paciente1);
	}

	@Test
	public void testAñadePaciendeNoExiste() {
		List<Paciente> listaPacientes = 
				new ArrayList<>();
		listaPacientes.add(paciente1);
		listaPacientes.add(paciente2);
		sistema1.anadePaciente(paciente2);
		assertArrayEquals(
				listaPacientes.toArray(), 
				sistema1.getListaPacientes().toArray());
		assertNotNull(sistema1.getListaPacientes());
	}
	@Test
	public void testAñadePersonal() {
		List<Personal> listaPersonal = 
				new ArrayList<>();
		listaPersonal.add(personal1);
		listaPersonal.add(personal2);
		listaPersonal.add(personal3);
		
		sistema1.anadePersonal(personal3);
		assertArrayEquals(listaPersonal.toArray(), 
				sistema1.getListaPersonal().toArray());
		assertNotNull(sistema1.getListaPersonal());
		
	}
}

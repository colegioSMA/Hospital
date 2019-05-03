package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import hospital.Paciente;
import hospital.Personal;
import hospital.Sistema;

public class sistemaTest {
	Paciente paciente = null;
	Paciente paciente1 = null;
	Paciente paciente2 = null;
	Personal personal = null;
	Personal personal1 = null;
	Personal personal2 = null;
	Sistema lista = null;
	Sistema lista2 = null;
	Sistema lista3 = null;
	Sistema lista4 = null;
	Sistema lista5 = null;
	Sistema lista6 = null;
	Sistema lista7 = null;
	Sistema lista8 = null;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		paciente = new Paciente(0, "Pablo", 19, "657688655", "123456789101");
		paciente1 = new Paciente(1, "Pepe", 18, "654542453", "12345678912");
		paciente2 = new Paciente(2, "Luis", 19, "653342453", "12345678912");
		personal = new Personal(0, "Carlos", "Celador");
		personal1 = new Personal(1, "Jaime", "Enfermero");
		personal2 = new Personal(2, "Eustaquio", "Celador");
		List<Paciente> pacientes = new ArrayList<>();
		pacientes.add(paciente);
		pacientes.add(paciente1);
		List<Personal> personal5 = new ArrayList<>();
		personal5.add(personal);
		personal5.add(personal1);
		personal5.add(personal2);
		lista = new Sistema(pacientes, personal5);
		List<Paciente> pacientes1 = new ArrayList<>();
		pacientes1.add(paciente);
		pacientes1.add(paciente1);
		pacientes1.add(paciente2);
		List<Personal> personal6 = new ArrayList<>();
		personal6.add(personal);
		personal6.add(personal1);
		lista2 = new Sistema(pacientes1, personal6);
		List<Paciente> pacientes2 = new ArrayList<>();
		pacientes2.add(paciente);
		pacientes2.add(paciente1);
		List<Personal> personal7 = new ArrayList<>();
		personal7.add(personal);
		personal7.add(personal1);
		personal7.add(personal2);
		lista3 = new Sistema(pacientes2, personal7);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void hayMasPersonalQuePacientesTest() {
		assertTrue(lista.hayMasPersonalQuePacientes());
		assertFalse(lista2.hayMasPersonalQuePacientes());
		assertEquals(lista3.hayMasPersonalQuePacientes(), lista.hayMasPersonalQuePacientes());
		
	}
	
	@Test(expected = Exception.class)
	public void anadePacienteTest1() throws IllegalArgumentException{
		lista4.anadePaciente(paciente);
		lista4.anadePaciente(paciente);
	}
	
	@Test(expected = Exception.class)
	public void anadePacienteTest2() {
		lista5.anadePaciente(paciente);
		lista5.anadePaciente(paciente1);
		lista5.anadePersonal(personal1);
		assertNotNull(lista5);
		lista6.anadePaciente(paciente1);
		lista6.anadePersonal(personal1);
		assertEquals(lista6, lista5);
	}
	
	@Test(expected = Exception.class)
	public void anadePersonalTest() {
		lista7.anadePaciente(paciente);
		lista7.anadePaciente(paciente1);
		lista7.anadePersonal(personal1);
		assertNotNull(lista7);
		lista8.anadePaciente(paciente);
		lista8.anadePaciente(paciente1);
		lista8.anadePersonal(personal1);
		assertEquals(lista8, lista7);
	}
}

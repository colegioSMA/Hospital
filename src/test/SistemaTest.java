package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import Hospital.Paciente;
import Hospital.Personal;
import Hospital.Sistema;

public class SistemaTest {
	
	List<Personal> personal = new ArrayList<Personal>();
	List<Paciente> paciente = new ArrayList<Paciente>();
	
	List<Personal> personal_2 = new ArrayList<Personal>();
	List<Paciente> paciente_2 = new ArrayList<Paciente>();
	Sistema sistema = null;
	Sistema sistema2 = null;
	Sistema sistema3 = null;

	@Before
	public void setUp() throws Exception {
		
		//List<Paciente> paciente = new ArrayList<Paciente>();
		//List<Personal> personal = new ArrayList<Personal>();

		Paciente paciente1 = new Paciente(1,"Manuel", 34,"676567765", "28056754323");
		Paciente paciente2 = new Paciente(2,"Manuel", 16,"676567765", "28056754323");
		Paciente paciente3 = new Paciente(3,"Manuel", 34,"676567765", "28056754323");
		
		Personal personal1 = new Personal(1,"Manuel", "Enfermero");
		Personal personal2 = new Personal(2,"Pedro", "Celador");
		Personal personal3 = new Personal(3,"María", "Enfermera");
		
		paciente.add(paciente1);
		//paciente.add(paciente2);
		paciente.add(paciente3);
		
		personal.add(personal1);
		personal.add(personal2);
		personal.add(personal3);
		
		paciente_2.add(paciente1);
		paciente_2.add(paciente2);
		paciente_2.add(paciente3);
		
		personal_2.add(personal1);
		//personal_2.add(personal2);
		personal_2.add(personal3);
		
		sistema = new Sistema(paciente,personal);

		sistema2 = new Sistema(paciente_2,personal_2);
		
	}

	@Test
	public void masPersonalDuePacientesTest1() {
		
		assertTrue(sistema.hayMasPersonalQuePacientes());
			
	}
	
	@Test
	public void masPersonalDuePacientesTest2() {
		
		assertFalse(sistema2.hayMasPersonalQuePacientes());
			
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void anadePacienteTest1() {
		
		Paciente paciente2 = new Paciente(2,"Manuel", 16,"676567765", "28056754323");

		sistema.anadePaciente(paciente2);

		sistema.anadePaciente(paciente2);

	}

	@Test
	public void anadePacienteTest2() {
		
		List<Personal> personal_3 = new ArrayList<Personal>();
		List<Paciente> paciente_3 = new ArrayList<Paciente>();
		List<Paciente> paciente_4 = new ArrayList<Paciente>();
		
		Paciente paciente5 = new Paciente(1,"Manuel", 34,"676567765", "28056754323");
		Paciente paciente6 = new Paciente(2,"Manuel", 16,"676567765", "28056754323");
		Paciente paciente7 = new Paciente(3,"Manuel", 34,"676567765", "28056754323");
		Paciente paciente8 = new Paciente(4,"Manuel", 34,"676567765", "28056754323");
		
		sistema3 = new Sistema(paciente_3,personal_3);
		
		paciente_4.add(paciente5);
		paciente_4.add(paciente6);
		paciente_4.add(paciente7);
		paciente_4.add(paciente8);
		
		sistema3.anadePaciente(paciente5);
		sistema3.anadePaciente(paciente6);
		sistema3.anadePaciente(paciente7);
		sistema3.anadePaciente(paciente8);
		
		assertArrayEquals(paciente_4.toArray(), sistema3.getListaPacientes().toArray());
		
		assertNotNull(sistema3.getListaPacientes().get(3));
	}
	
	@Test
	public void anadePersonalTest1() {
		
		List<Personal> personal_3 = new ArrayList<Personal>();
		List<Paciente> paciente_3 = new ArrayList<Paciente>();
		List<Personal> personal_4 = new ArrayList<Personal>();
		
		Personal personal4 = new Personal(1,"Manuel", "Enfermero");
		Personal personal5 = new Personal(2,"Pedro", "Celador");
		Personal personal6 = new Personal(3,"María", "Enfermera");
		
		sistema3 = new Sistema(paciente_3,personal_3);
		
		personal_4.add(personal4);
		personal_4.add(personal5);
		personal_4.add(personal6);
		
		
		sistema3.anadePersonal(personal4);
		sistema3.anadePersonal(personal5);
		sistema3.anadePersonal(personal6);
		
		
		assertArrayEquals(personal_4.toArray(), sistema3.getListaPersonal().toArray());
		
		assertNotNull(sistema3.getListaPersonal().get(2));
		
	}
	
}

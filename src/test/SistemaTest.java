package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import Hospitalclases.*;

public class SistemaTest {
	

Personal p1=new Personal(1,"david","Celador");
Personal p2=new Personal(2,"Gus","Enfermero");
Personal p3=new Personal(3,"Mario","Medico");
Paciente pc1=new Paciente(4,"pedro",18,"666555895","45671123890");
Paciente pc2=new Paciente(5,"pablo",18,"666333895","11548906723");
Paciente pc3=new Paciente(6,"Manuel",18,"666547222","11789023456");
List<Paciente>gente=new ArrayList<>();
List<Personal>trabajadores=new ArrayList<>();
Sistema sistema=new Sistema(gente,trabajadores);
		
		
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void MaspersonalquePacientes() {
		sistema.anadePersonal(p1);
		sistema.anadePersonal(p2);
		sistema.anadePaciente(pc1);
		assertTrue(sistema.hayMasPersonalQuePacientes());
		//assertEquals
	}
	@Test(expected=IllegalArgumentException.class)
	public void anaderepetido() {
		sistema.anadePaciente(pc1);
		sistema.anadePaciente(pc1);
		assertEquals(1, trabajadores.size());
		assertNotNull(gente);
	}
	@Test
	public void anadepersonal() {
		sistema.anadePersonal(p1);
		assertNotNull(trabajadores);
		assertEquals(1, trabajadores.size());
		
	}

}

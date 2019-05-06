package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import Hospital.*;

public class SistemaTest {

	Sistema sistema=null;
	
	Paciente paciente1=null;
	Paciente paciente2=null;
	Paciente paciente3=null;
	
	
	Personal personal1=null;
	Personal personal2=null;
	Personal personal3=null;
	
	
	List<Paciente> listaPacientes=null;
	List<Personal> listaPersonal=null;

	
	@Before
	public void setUp() throws Exception {
		
		paciente1= new Paciente(1, "Alfredo", 89 , "668246549", "458216549df");
		paciente2= new Paciente(2, "JuanCarlos", 45, "6489961236", "456795821fg");
		paciente3= new Paciente(3, "Pedro", 67 , "624642284", "123485649rt");
		
		
		personal1=new Personal(1, "Miguel", "Celador");
		personal2=new Personal(2, "Angela", "Cirujano");
		personal3=new Personal(3, "Samuel", "Enfermero");	
		
		listaPacientes=new ArrayList<Paciente>();
		listaPacientes.add(paciente1);
		
		
		listaPersonal=new ArrayList<Personal>();
		listaPersonal.add(personal1);
		listaPersonal.add(personal2);
		

		
		sistema= new Sistema(listaPacientes, listaPersonal);	
		
	}	
	

	@Test
	public void hayMasPersonalQuePacientesTest() {		
				
		assertTrue(sistema.hayMasPersonalQuePacientes());				
		assertEquals(true,sistema.hayMasPersonalQuePacientes());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void anadePacienteExistenteTest() {			
			sistema.anadePaciente(paciente1);	
	}			
	
	@Test
	public void anadePacienteNuevoTest() {	
		
			
		List<Paciente> listaAux=Arrays.asList(paciente1,paciente2);
		
		sistema.anadePaciente(paciente2);
		
		assertNotNull(sistema.getListaPacientes());	
		assertArrayEquals(listaAux.toArray(),listaPacientes.toArray());
	}
	
	@Test
	public void anadePersonalTest() {	
		
		List<Personal> listaAux=Arrays.asList(personal1,personal2,personal3);
		
		sistema.anadePersonal(personal3);
		
		assertNotNull(sistema.getListaPersonal());
		assertArrayEquals(listaAux.toArray(), listaPersonal.toArray());
		
	}
	
}

package Test;
import java.util.*;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Hospital.Paciente;
import Hospital.Personal;
import Hospital.Sistema;

public class SistemaTest {
	Sistema sistema=null;
	Paciente paciente1=null;
	Paciente paciente2=null;
	
	Personal personal1=null;
	Personal personal2=null;
	Personal personal3=null;
	
	List<Paciente> listaPacientes=null;
	List<Personal> listaPersonal=null;
	

	@Before
	public void setUp() throws Exception {
	paciente1= new Paciente("Pepe",99,"82828282","12637281726");
	paciente2= new Paciente("Juan", 12, "29381", "123456125364");
	
	personal1=new Personal("Miguel", "Celador");
	personal2=new Personal("Fer", "Cirujano");
	personal3=new Personal("Samu", "Enfermero");
	listaPacientes=new ArrayList<Paciente>();
	listaPacientes.add(paciente1);
	listaPacientes.add(paciente2);
	
	
	
	listaPersonal=new ArrayList<Personal>();
	listaPersonal.add(personal1);
	listaPersonal.add(personal2);
	listaPersonal.add(personal3);
	
	sistema=new Sistema(listaPacientes, listaPersonal);
	
		
	}
	@Test
	public void testHayMasPersonalQuePacientes() {
		assertTrue(sistema.hayMasPersonalQuePacientes());
		assertEquals(true, sistema.hayMasPersonalQuePacientes());
	}
	@Test(expected = IllegalArgumentException.class )
	public void testAnadePaciente() {
		sistema.anadePaciente(paciente2);
		
	}
	@Test
	public void testanadePaciente() {
		List<Paciente> listaAux=Arrays.asList(paciente1,paciente2);
		
		assertArrayEquals(listaAux.toArray(),listaPacientes.toArray());
	}

	@After
	public void tearDown() throws Exception {
	}


}

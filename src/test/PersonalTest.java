package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Hospitalclases.*;
public class PersonalTest {
Personal celador1=new Personal(1,"david","Celador");
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
	public void test() {
		assertTrue(celador1.esCelador());
		celador1.setPuesto("Enfermero");
		assertFalse(celador1.esCelador());
	}
	/*
	public void test() {
		fail("Not yet implemented");
	}
	public void test() {
		fail("Not yet implemented");
	}*/

}

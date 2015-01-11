package org.bosphorus.test.expression.scalar.math;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.expression.scalar.executor.math.AddDoubleExecutor;
import org.bosphorus.expression.scalar.executor.tuple.ListElementExecutor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AddTest {
	private AddDoubleExecutor add = new AddDoubleExecutor();

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
	public void test() throws Exception {
		assertTrue(30.0 == add.execute(10, 20));
		//fail("Not yet implemented");
	}

}

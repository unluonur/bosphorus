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
	private AddDoubleExecutor<List<Object>> add = new AddDoubleExecutor<List<Object>>(new ListElementExecutor<List<?>, Double>(0), new ListElementExecutor<List<?>, Double>(1));

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
		ArrayList<Object> input = new ArrayList<Object>();
		input.add(10);
		input.add(20);
		assertTrue(30.0 == add.execute(input));
		//fail("Not yet implemented");
	}

}

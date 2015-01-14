package org.bosphorus.test.api.expression.scalar;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.bosphorus.api.builder.ListStreamBuilder;
import org.bosphorus.api.builder.expression.scalar.IScalarExpression1;
import org.bosphorus.core.expression.scalar.executor.IScalarExecutor1;
import org.bosphorus.test.api.util.SampleTupleFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ObjectListStreamTest {
	private ListStreamBuilder stream = new ListStreamBuilder("City", "Member", "Price", "Date");

	private SampleTupleFactory factory = new SampleTupleFactory();

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
	public void test_scalar() throws Exception {
		List<Object> tuple = factory.makeRandomTuple();
		
		IScalarExpression1<List<Object>, String> expression = stream.stringField("City");
		IScalarExecutor1<List<Object>, String> executor = expression.build().create();
		System.out.println(expression);
		assertEquals((String)tuple.get(0), executor.execute(tuple));
	}
	
}

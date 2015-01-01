package org.bosphorus.test.api.expression.scalar;

import static org.junit.Assert.*;

import java.util.List;

import org.bosphorus.api.fluent.expression.scalar.primitive.StringExpression;
import org.bosphorus.api.fluent.stream.ListStream;
import org.bosphorus.expression.scalar.executor.IScalarExecutor;
import org.bosphorus.test.api.util.SampleTupleFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ObjectListStreamTest {
	private ListStream stream = new ListStream("City", "Total");
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
		
		StringExpression<List<Object>> expression = stream.field("City").stringValue();
		IScalarExecutor<List<Object>, String> executor = expression.build();
		System.out.println(expression);
		assertEquals((String)tuple.get(0), executor.execute(tuple));
	}
	
}

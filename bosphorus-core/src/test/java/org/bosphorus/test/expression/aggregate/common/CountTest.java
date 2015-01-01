package org.bosphorus.test.expression.aggregate.common;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.bosphorus.expression.aggregate.executor.common.CountIntegerExecutor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CountTest {
	private CountIntegerExecutor intExecutor = new CountIntegerExecutor();

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
	public void testListEquality() {

		ArrayList<Object> list1 = new ArrayList<Object>();
		list1.add(1);
		list1.add(2);
		
		ArrayList<Object> list2 = new ArrayList<Object>();
		list2.add(1);
		list2.add(2);

		ArrayList<Object> list3 = new ArrayList<Object>();
		list3.add(1);
		list3.add(3);
		
		assertTrue(list1.equals(list2));
		assertFalse(list1.equals(list3));
	}

	@Test
	public void testInteger() throws Exception {
		intExecutor.execute("zzz");
		intExecutor.execute("zzz");
		intExecutor.execute("zzz");
		assertTrue(3 == intExecutor.getValue());
	}

	@Test
	public void test_performance() throws Exception {
		Date startDate = new Date();
		
		for(int i=1; i<1000000000; i++) {
			intExecutor.execute("zzz");
		}
		System.out.println(new Date().getTime() - startDate.getTime());
	}

}

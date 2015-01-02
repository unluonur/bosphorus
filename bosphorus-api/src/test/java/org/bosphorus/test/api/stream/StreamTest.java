package org.bosphorus.test.api.stream;

import static org.junit.Assert.*;

import java.util.List;

import org.bosphorus.api.builder.node.INodeContext;
import org.bosphorus.api.builder.node.Node;
import org.bosphorus.api.builder.stream.FilterPipe;
import org.bosphorus.api.builder.stream.IStreamInput;
import org.bosphorus.api.fluent.stream.ListStream;
import org.bosphorus.stream.IPipeExecutor;
import org.bosphorus.test.api.util.SampleTupleFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StreamTest {
	private SampleTupleFactory sampleDataFactory = new SampleTupleFactory();

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
	public void test_stream_filter() throws Exception {
		//fail("Not yet implemented");
		ListStream stream = new ListStream("City", "Member", "Price", "Date");
		Node node = new Node();
		FilterPipe<List<Object>> filter = new FilterPipe<List<Object>>(stream.field("City").stringValue().isEqualTo("Ýstanbul"));
		filter.getOutput().getDestinations().add(new IStreamInput<List<Object>>() {
			
			@Override
			public IPipeExecutor<List<Object>> build(INodeContext context)
					throws Exception {
				return new IPipeExecutor<List<Object>>() {
					
					@Override
					public void writeOne(List<Object> input) throws Exception {
						assertTrue(input.get(0) == "Ýstanbul");
						System.out.println(input);
					}
					
					@Override
					public void writeMulti(List<? extends List<Object>> input) throws Exception {
						System.out.println(input);
					}
				};
			}
		});
		node.registerInput("sample", filter);
		INodeContext context = node.build();
		IPipeExecutor<List<Object>> pipe = context.<List<Object>>pipe("sample");

		for(Integer i=1; i<=10000000; i++) {
			pipe.writeOne(sampleDataFactory.makeRandomTuple());
		}
	}

}

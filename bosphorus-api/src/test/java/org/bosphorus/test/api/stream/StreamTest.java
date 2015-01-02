package org.bosphorus.test.api.stream;

import static org.junit.Assert.*;

import java.util.List;

import org.bosphorus.api.builder.node.INodeContext;
import org.bosphorus.api.builder.node.Node;
import org.bosphorus.api.builder.stream.ConsoleLogPipe;
import org.bosphorus.api.builder.stream.FilterPipe;
import org.bosphorus.api.builder.stream.IStreamInput;
import org.bosphorus.api.builder.stream.OneToManyPipe;
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
		ListStream stream = new ListStream("City", "Member", "Price", "Date");
		Node node = new Node();
		FilterPipe<List<Object>> filter = new FilterPipe<List<Object>>(stream.field("City").stringValue().isEqualTo("Ýstanbul"));
		filter.getOutput().getDestinations().add(new ConsoleLogPipe<List<Object>>());
		node.registerInput("sample", filter);
		INodeContext context = node.build();
		IPipeExecutor<List<Object>> pipe = context.<List<Object>>pipe("sample");

		for(Integer i=1; i<=10000000; i++) {
			pipe.writeOne(sampleDataFactory.makeRandomTuple());
		}
	}
	
	@Test
	public void test_multiple_pipes() throws Exception {
		ListStream stream = new ListStream("City", "Member", "Price", "Date");
		Node node = new Node();
		OneToManyPipe<List<Object>> pipe = new OneToManyPipe<List<Object>>();
		node.registerInput("sample-stream", pipe);
		node.registerOutput("sample-stream", pipe.getOutput());
		
		FilterPipe<List<Object>> filter1 = new FilterPipe<List<Object>>(stream.and(stream.field("City").stringValue().isEqualTo("Ýstanbul"), stream.field("Price").doubleValue().isLessThan(10.0)));
		filter1.getOutput().getDestinations().add(new ConsoleLogPipe<List<Object>>());
		
		FilterPipe<List<Object>> filter2 = new FilterPipe<List<Object>>(stream.field("City").stringValue().isEqualTo("Ankara"));
		filter2.getOutput().getDestinations().add(new ConsoleLogPipe<List<Object>>());
		
		pipe.getOutput().getDestinations().add(filter1);
		pipe.getOutput().getDestinations().add(filter2);

		INodeContext context = node.build();
		IPipeExecutor<List<Object>> executor = context.<List<Object>>pipe("sample-stream");

		for(Integer i=1; i<=10000000; i++) {
			executor.writeOne(sampleDataFactory.makeRandomTuple());
		}

	}

}

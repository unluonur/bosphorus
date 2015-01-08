package org.bosphorus.test.api.stream;

import java.util.List;

import org.bosphorus.api.builder.expression.aggregate.IAggregateExpression;
import org.bosphorus.api.builder.node.IBuildContext;
import org.bosphorus.api.builder.node.TopologyBuilder;
import org.bosphorus.api.builder.stream.ConsoleLogPipe;
import org.bosphorus.api.builder.stream.FilterPipe;
import org.bosphorus.api.builder.stream.OneToManyPipe;
import org.bosphorus.api.builder.stream.TimeIntervalAggregateStream;
import org.bosphorus.api.fluent.stream.ListStream;
import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.stream.IPipeExecutor;
import org.bosphorus.test.api.util.SampleTupleFactory;
import org.bosphorus.topology.ITopology;
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
		//TopologyBuilder node = new TopologyBuilder();
		FilterPipe<List<Object>> filter = new FilterPipe<List<Object>>(stream.field("City").stringValue().isEqualTo("Ýstanbul"));
		filter.getOutput().add(new ConsoleLogPipe<List<Object>>());
		//node.registerInput("sample", filter);
		//ITopology context = node.build();
		//IPipeExecutor<List<Object>> pipe = context.<List<Object>>stream("sample");
		IPipeExecutor<List<Object>> pipe = filter.build();

		for(Integer i=1; i<=100000; i++) {
			pipe.writeOne(sampleDataFactory.makeRandomTuple());
		}
	}
	/*
	@Test
	public void test_multiple_pipes() throws Exception {
		ListStream stream = new ListStream("City", "Member", "Price", "Date");
		TopologyBuilder node = new TopologyBuilder();
		OneToManyPipe<List<Object>> pipe = new OneToManyPipe<List<Object>>();
		node.registerInput("sample-stream", pipe.then(node.createOutput("sample-stream")));
		
		FilterPipe<List<Object>> filter1 = new FilterPipe<List<Object>>(stream.and(stream.field("City").stringValue().isEqualTo("Ýstanbul"), stream.field("Price").doubleValue().isLessThan(10.0)));
		filter1.getOutput().add(new ConsoleLogPipe<List<Object>>());
		
		FilterPipe<List<Object>> filter2 = new FilterPipe<List<Object>>(stream.field("City").stringValue().isEqualTo("Ankara"));
		filter2.getOutput().add(new ConsoleLogPipe<List<Object>>());
		
		pipe.getOutput().add(filter1);
		pipe.getOutput().add(filter2);

		ITopology context = node.build();
		IPipeExecutor<List<Object>> executor = context.<List<Object>>stream("sample-stream");

		for(Integer i=1; i<=100; i++) {
			executor.writeOne(sampleDataFactory.makeRandomTuple());
		}

	}
	
	@Test
	public void test_recursion() throws Exception {
		TopologyBuilder node = new TopologyBuilder();
		OneToManyPipe<List<Object>> pipe = new OneToManyPipe<List<Object>>();
		node.registerInput("stream-input", pipe.then(node.createOutput("stream-output")));
		node.<List<Object>>streamOutput("stream-output").add(new ConsoleLogPipe<List<Object>>());
		node.<List<Object>>streamOutput("stream-output").add(node.streamInput("stream-input"));
		ITopology context = node.build();
		IPipeExecutor<List<Object>> executor = context.<List<Object>>stream("stream-input");

		executor.writeOne(sampleDataFactory.makeRandomTuple());
		
	}
	
	@Test
	public void test_aggregation() throws Exception {
		ListStream stream = new ListStream("City", "Member", "Price", "Date");
		IAggregateExpression<List<Object>, List<Object>> expression = stream.list(
				stream.countInteger(),
				stream.avgDouble(stream.field("Price").doubleValue()),
				stream.min(stream.field("Price").doubleValue()),
				stream.max(stream.field("Price").doubleValue()),
				stream.countDistinct(stream.field("City").stringValue()),
				stream.distinct(stream.field("City").stringValue())
			);
		TopologyBuilder builder = new TopologyBuilder();
		builder.registerInput("sample-stream",
				new OneToManyPipe<List<Object>>()
				.then(new TimeIntervalAggregateStream<List<Object>, List<Object>>(expression, 1000)
						.then(new ConsoleLogPipe<List<Object>>())));
		System.out.println(builder);
		ITopology topology = builder.build();
		System.out.println(topology);
		IPipeExecutor<List<Object>> executor = topology.<List<Object>>stream("sample-stream");

		for(Integer i=1; i<=10000000; i++) {
			executor.writeOne(sampleDataFactory.makeRandomTuple());
		}
	}
	

	
	@Test
	public void test_group_aggregation() throws Exception {
		ListStream stream = new ListStream("City", "Member", "Price", "Date");
		IAggregateExpression<List<Object>, List<Object>> expression = stream.list(
				stream.countInteger(),
				stream.avgDouble(stream.field("Price").doubleValue()),
				stream.min(stream.field("Price").doubleValue()),
				stream.max(stream.field("Price").doubleValue()),
				stream.countDistinct(stream.field("City").stringValue()),
				stream.distinct(stream.field("City").stringValue()),
				stream.group(
						stream.field("City").stringValue(), // Key Value
						stream.list(
								stream.countInteger(),
								stream.avgDouble(stream.field("Price").doubleValue()),
								stream.min(stream.field("Price").doubleValue()),
								stream.max(stream.field("Price").doubleValue()),
								stream.group(
										stream.field("Member").stringValue(),
										stream.list(
												stream.countInteger(),
												stream.avgDouble(stream.field("Price").doubleValue()),
												stream.min(stream.field("Price").doubleValue()),
												stream.max(stream.field("Price").doubleValue())
										)
								)
								//stream.countDistinct(stream.field("City").stringValue()),
								//stream.distinct(stream.field("City").stringValue())
						)
				)
			);
		TopologyBuilder builder = new TopologyBuilder();
		builder.registerInput("sample-stream",
			new TimeIntervalAggregateStream<List<Object>, List<Object>>(expression, 1000)
				.then(new ConsoleLogPipe<List<Object>>()));
		System.out.println(builder);
		ITopology topology = builder.build();
		System.out.println(topology);
		IPipeExecutor<List<Object>> executor = topology.<List<Object>>stream("sample-stream");

		for(Integer i=1; i<=10000000; i++) {
			executor.writeOne(sampleDataFactory.makeRandomTuple());
		}
	}
	*/

}

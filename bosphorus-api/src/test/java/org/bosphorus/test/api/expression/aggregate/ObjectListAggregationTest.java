package org.bosphorus.test.api.expression.aggregate;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.bosphorus.api.builder.expression.aggregate.IAggregateExpression;
import org.bosphorus.api.fluent.expression.scalar.primitive.StringExpression;
import org.bosphorus.api.fluent.stream.ListStream;
import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.expression.scalar.executor.IScalarExecutor;
import org.bosphorus.test.api.util.SampleTupleFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ObjectListAggregationTest {
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
	public void test_aggregate_count_all() throws Exception {
		ListStream stream = new ListStream("City", "Member", "Price", "Date");
		IAggregateExecutor<List<Object>, Integer> executor = stream.countInteger().build().create();
		
		for(Integer i=1; i<1000; i++) {
			executor.execute(sampleDataFactory.makeRandomTuple());

			assertEquals(i, executor.getValue());
		}
	}

	@SuppressWarnings("unchecked")
	@Test
	public void test_aggregate_list() throws Exception {
		ListStream stream = new ListStream("City", "Member", "Price", "Date");
		IAggregateExecutor<List<Object>, List<Object>> executor = stream.list(
			stream.countInteger(),
			stream.avgDouble(stream.field("Price").doubleValue()),
			stream.min(stream.field("Price").doubleValue()),
			stream.max(stream.field("Price").doubleValue()),
			stream.countDistinct(stream.field("City").stringValue()),
			stream.stdDevDouble(stream.field("Price").doubleValue()),
			stream.distinct(stream.field("City").stringValue())
		).build().create();
				
		Date date = new Date();

		for(Integer i=1; i<=10000; i++) {
			executor.execute(sampleDataFactory.makeRandomTuple());
		}

		// 3,3M EPS
		System.out.println(new Date().getTime() - date.getTime());
		/*
		 * Sample output : 
		 * [10000000, 50.012890240373466, 1.8183743200061997E-5, 99.99999377681694, 81, [Hatay, Sivas, Erzurum, Sakarya, Trabzon, Giresun, Bolu, Konya, Bursa, Aydýn, Ýstanbul, Bartýn, Balýkesir, Gaziantep, Sinop, Kütahya, Edirne, Ardahan, Artvin, Ordu, Burdur, Samsun, Çorum, Nevþehir, Malatya, Kýrklareli, Bayburt, Ýzmir, Diyarbakýr, Aðrý, Uþak, Düzce, Kilis, Çankýrý, Erzincan, Bingöl, Iðdýr, Karaman, Tekirdað, Van, Aksaray, Karabük, Tokat, Bilecik, Bitlis, Adana, Yalova, Antalya, Kahramanmaraþ, Þýrnak, Muþ, Rize, Hakkâri, Afyonkarahisar, Kars, Osmaniye, Gümüþhane, Muðla, Kýrþehir, Manisa, Mardin, Kýrýkkale, Mersin, Zonguldak, Kocaeli, Isparta, Elazýð, Batman, Denizli, Kayseri, Eskiþehir, Tunceli, Niðde, Adýyaman, Amasya, Þanlýurfa, Siirt, Çanakkale, Kastamonu, Yozgat, Ankara]]
		 */
		System.out.println(executor.getValue());
		//System.out.println(executor.getState());

	}

	@SuppressWarnings("unchecked")
	@Test
	public void test_group_aggregate() throws Exception {
		ListStream stream = new ListStream("City", "Member", "Price", "Date");
		
		IAggregateExecutor<List<Object>, ?> executor = stream.group(
			stream.list(stream.field("Member").stringValue(), stream.field("City").stringValue()),
			stream.list(
				stream.countInteger(),
				stream.avgDouble(stream.field("Price").doubleValue())
				//stream.min(stream.field("Price").doubleValue()),
				//stream.max(stream.field("Price").doubleValue()),
				//stream.stdDevDouble(stream.field("Price").doubleValue())
			)
		).build().create();
		
			
		Date date = new Date();

		for(Integer i=1; i<=1000; i++) {
			executor.execute(sampleDataFactory.makeRandomTuple());
		}

		// 3,3M EPS (without standard deviation)
		System.out.println(new Date().getTime() - date.getTime());

		
		System.out.println(executor.getValue());
		//System.out.println(executor.getState());

	}

	@SuppressWarnings("unchecked")
	@Test
	public void test_nested_group_aggregate() throws Exception {
		ListStream stream = new ListStream("City", "Member", "Price", "Date");
		
		IAggregateExecutor<List<Object>, ?> executor = stream.group(
			stream.field("Member").stringValue(),
			stream.list(
				stream.countInteger(),
				stream.avgDouble(stream.field("Price").doubleValue()),
				//stream.min(stream.field("Price").doubleValue()),
				//stream.max(stream.field("Price").doubleValue()),
				//stream.countDistinct(stream.field("Member").stringValue()),
				stream.group(
					stream.field("City").stringValue(), 
					stream.list(
						stream.countInteger(),
						stream.avgDouble(stream.field("Price").doubleValue())
						//stream.min(stream.field("Price").doubleValue()),
						//stream.max(stream.field("Price").doubleValue())
					))
			)
		).build().create();
		
			
		Date date = new Date();

		for(Integer i=1; i<=1000; i++) {
			executor.execute(sampleDataFactory.makeRandomTuple());
		}

		// 3,3M EPS (without standard deviation)
		System.out.println(new Date().getTime() - date.getTime());
		/*
		 * Sample output : 
		 * [10000000, 50.012890240373466, 1.8183743200061997E-5, 99.99999377681694, 81, [Hatay, Sivas, Erzurum, Sakarya, Trabzon, Giresun, Bolu, Konya, Bursa, Aydýn, Ýstanbul, Bartýn, Balýkesir, Gaziantep, Sinop, Kütahya, Edirne, Ardahan, Artvin, Ordu, Burdur, Samsun, Çorum, Nevþehir, Malatya, Kýrklareli, Bayburt, Ýzmir, Diyarbakýr, Aðrý, Uþak, Düzce, Kilis, Çankýrý, Erzincan, Bingöl, Iðdýr, Karaman, Tekirdað, Van, Aksaray, Karabük, Tokat, Bilecik, Bitlis, Adana, Yalova, Antalya, Kahramanmaraþ, Þýrnak, Muþ, Rize, Hakkâri, Afyonkarahisar, Kars, Osmaniye, Gümüþhane, Muðla, Kýrþehir, Manisa, Mardin, Kýrýkkale, Mersin, Zonguldak, Kocaeli, Isparta, Elazýð, Batman, Denizli, Kayseri, Eskiþehir, Tunceli, Niðde, Adýyaman, Amasya, Þanlýurfa, Siirt, Çanakkale, Kastamonu, Yozgat, Ankara]]
		 */
		System.out.println(executor.getValue());
		//System.out.println(executor.getState());

	}


	@SuppressWarnings("unchecked")
	@Test
	public void test_group_truncate_date() throws Exception {
		ListStream stream = new ListStream("City", "Member", "Price", "Date");
		IAggregateExpression<List<Object>, ?> expression = stream.group(
			stream.field("Date").dateValue().truncateToWeek(),
			stream.list(
				stream.countInteger(),
				stream.avgDouble(stream.field("Price").doubleValue()),
				stream.min(stream.field("Price").doubleValue()),
				stream.max(stream.field("Price").doubleValue()),
				stream.stdDevDouble(stream.field("Price").doubleValue())
			)
		);
		System.out.println(expression);
		IAggregateExecutor<List<Object>, ?> executor = expression.build().create();
		
			
		Date date = new Date();

		for(Integer i=1; i<=1000; i++) {
			executor.execute(sampleDataFactory.makeRandomTuple());
		}

		// 3,3M EPS (without standard deviation)
		System.out.println(new Date().getTime() - date.getTime());

		
		System.out.println(executor.getValue());
		//System.out.println(executor.getState());

	}

}

package org.bosphorus.test.expression.scalar.list;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bosphorus.builder.ListExpressionBuilder;
import org.bosphorus.expression.aggregate.executor.math.AvgDoubleExecutor;
import org.bosphorus.expression.aggregate.executor.scalar.ExpressionExecutor;
import org.bosphorus.expression.aggregate.factory.IAggregateExecutorFactory;
import org.bosphorus.expression.scalar.executor.tuple.ConstListElementExecutor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ListExpressionTest {
	private Random random = new Random();
	private String[] cities = new String[] {
		"Adana",
		"Ad�yaman",
		"Afyonkarahisar",
		"A�r�",
		"Amasya",
		"Ankara",
		"Antalya",
		"Artvin",
		"Ayd�n",
		"Bal�kesir",
		"Bilecik",
		"Bing�l",
		"Bitlis",
		"Bolu",
		"Burdur",
		"Bursa",
		"�anakkale",
		"�ank�r�",
		"�orum",
		"Denizli",
		"Diyarbak�r",
		"Edirne",
		"Elaz��",
		"Erzincan",
		"Erzurum",
		"Eski�ehir",
		"Gaziantep",
		"Giresun",
		"G�m��hane",
		"Hakk�ri",
		"Hatay",
		"Isparta",
		"Mersin",
		"�stanbul",
		"�zmir",
		"Kars",
		"Kastamonu",
		"Kayseri",
		"K�rklareli",
		"K�r�ehir",
		"Kocaeli",
		"Konya",
		"K�tahya",
		"Malatya",
		"Manisa",
		"Kahramanmara�",
		"Mardin",
		"Mu�la",
		"Mu�",
		"Nev�ehir",
		"Ni�de",
		"Ordu",
		"Rize",
		"Sakarya",
		"Samsun",
		"Siirt",
		"Sinop",
		"Sivas",
		"Tekirda�",
		"Tokat",
		"Trabzon",
		"Tunceli",
		"�anl�urfa",
		"U�ak",
		"Van",
		"Yozgat",
		"Zonguldak",
		"Aksaray",
		"Bayburt",
		"Karaman",
		"K�r�kkale",
		"Batman",
		"��rnak",
		"Bart�n",
		"Ardahan",
		"I�d�r",
		"Yalova",
		"Karab�k",
		"Kilis",
		"Osmaniye",
		"D�zce"
	};
	
	private ListExpressionBuilder builder = new ListExpressionBuilder();
	
	//private IAggregateExecutorFactory<List<Object>, Double> expression = builder.sumDouble(builder.convert(//builder))
	private <T> List<T> makeTuple(T... values) {
		ArrayList<T> result = new ArrayList<T>();
		for(T item: values) {
			result.add(item);
		}
		return result;
	}
	
	private List<Object> makeRandomTuple() {
		return makeTuple(cities[random.nextInt(cities.length)], random.nextDouble() * 100);
	}

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
		fail("Not yet implemented");
	}

}

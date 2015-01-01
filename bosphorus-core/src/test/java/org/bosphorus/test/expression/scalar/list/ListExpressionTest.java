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
		"Adýyaman",
		"Afyonkarahisar",
		"Aðrý",
		"Amasya",
		"Ankara",
		"Antalya",
		"Artvin",
		"Aydýn",
		"Balýkesir",
		"Bilecik",
		"Bingöl",
		"Bitlis",
		"Bolu",
		"Burdur",
		"Bursa",
		"Çanakkale",
		"Çankýrý",
		"Çorum",
		"Denizli",
		"Diyarbakýr",
		"Edirne",
		"Elazýð",
		"Erzincan",
		"Erzurum",
		"Eskiþehir",
		"Gaziantep",
		"Giresun",
		"Gümüþhane",
		"Hakkâri",
		"Hatay",
		"Isparta",
		"Mersin",
		"Ýstanbul",
		"Ýzmir",
		"Kars",
		"Kastamonu",
		"Kayseri",
		"Kýrklareli",
		"Kýrþehir",
		"Kocaeli",
		"Konya",
		"Kütahya",
		"Malatya",
		"Manisa",
		"Kahramanmaraþ",
		"Mardin",
		"Muðla",
		"Muþ",
		"Nevþehir",
		"Niðde",
		"Ordu",
		"Rize",
		"Sakarya",
		"Samsun",
		"Siirt",
		"Sinop",
		"Sivas",
		"Tekirdað",
		"Tokat",
		"Trabzon",
		"Tunceli",
		"Þanlýurfa",
		"Uþak",
		"Van",
		"Yozgat",
		"Zonguldak",
		"Aksaray",
		"Bayburt",
		"Karaman",
		"Kýrýkkale",
		"Batman",
		"Þýrnak",
		"Bartýn",
		"Ardahan",
		"Iðdýr",
		"Yalova",
		"Karabük",
		"Kilis",
		"Osmaniye",
		"Düzce"
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

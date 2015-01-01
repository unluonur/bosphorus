package org.bosphorus.test.api.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class SampleTupleFactory {


	private Random random = new Random();
	private String[] cities = new String[] {
			"Ýstanbul",
			"Ankara",
			"Ýzmir"
			/*
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
		*/
	};
	private String[] members = new String[]{
			"member 1",
			"member 2",
			"member 3",
			"member 4",
			"member 5",
			"member 6",
			"member 7",
			"member 8",
			"member 9",
			"member 10"
	};
	public <T> List<T> makeTuple(T... values) {
		ArrayList<T> result = new ArrayList<T>();
		for(T item: values) {
			result.add(item);
		}
		return result;
	}
	
	public List<Object> makeRandomTuple() {
		return makeTuple(cities[random.nextInt(cities.length)], members[random.nextInt(members.length)], random.nextDouble() * 100, new Date(2014, 11, random.nextInt(30) + 1, random.nextInt(23), random.nextInt(60), random.nextInt(60)));
	}
}

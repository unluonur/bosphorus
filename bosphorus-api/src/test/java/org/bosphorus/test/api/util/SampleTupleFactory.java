package org.bosphorus.test.api.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class SampleTupleFactory {


	private Random random = new Random();
	private String[] cities = new String[] {
			"�stanbul",
			"Ankara",
			"�zmir"
			/*
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

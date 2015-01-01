bosphorus
====

An experimental distributed Java CEP engine.

##### Example 1

```java
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

		for(Integer i=1; i<=10000000; i++) {
			executor.execute(sampleDataFactory.makeRandomTuple());
		}
		System.out.println(executor.getValue());
```

#####  Sample Output 1
```
[10000000, 49.998068143760705, 5.887227660927863E-6, 99.99999969558941, 3, 91298.95383854832, [Ankara, İstanbul, İzmir]]
```


##### Example 2

```java
		ListStream stream = new ListStream("City", "Member", "Price", "Date");
		IAggregateExecutor<List<Object>, ?> executor = stream.group(
			stream.list(stream.field("Member").stringValue(), stream.field("City").stringValue()), /* Key Expression */
			stream.list(
				stream.countInteger(),
				stream.avgDouble(stream.field("Price").doubleValue())
			)
		).build().create();

		for(Integer i=1; i<=1000; i++) {
			executor.execute(sampleDataFactory.makeRandomTuple());
		}
		System.out.println(executor.getValue());
```

#####  Sample Output 2
```
{[member 4, İstanbul]=[34, 55.53799873935709], [member 6, İstanbul]=[35, 47.73475993516251], [member 8, İstanbul]=[41, 43.81313045571378], [member 7, İzmir]=[40, 52.95837767210759], [member 6, Ankara]=[29, 54.526494643860794], [member 5, İzmir]=[33, 48.814080341969486], [member 8, Ankara]=[29, 48.177464314304494], [member 2, Ankara]=[45, 56.521954944082275], [member 9, İzmir]=[30, 57.963962875802046], [member 4, Ankara]=[30, 44.404534780360876], [member 2, İzmir]=[34, 46.3114774821422], [member 2, İstanbul]=[26, 49.006412673283464], [member 3, İstanbul]=[31, 54.89157668387987], [member 1, Ankara]=[24, 46.096830169560434], [member 10, İzmir]=[38, 51.6824402055779], [member 5, İstanbul]=[37, 54.96397099077815], [member 7, İstanbul]=[34, 56.452225626044964], [member 9, İstanbul]=[38, 50.44624700705005], [member 7, Ankara]=[31, 49.81843511667224], [member 6, İzmir]=[28, 56.23507326856585], [member 9, Ankara]=[44, 62.77638748768841], [member 4, İzmir]=[26, 40.742978245774346], [member 3, Ankara]=[39, 53.172520861361086], [member 10, Ankara]=[34, 47.65331396039829], [member 5, Ankara]=[40, 52.16138142886625], [member 8, İzmir]=[34, 50.16240608843274], [member 10, İstanbul]=[29, 48.70688732949671], [member 3, İzmir]=[27, 54.99341230072761], [member 1, İzmir]=[27, 54.10095065233266], [member 1, İstanbul]=[33, 52.854391568945516]}
```


##### Example 3

```java
		ListStream stream = new ListStream("City", "Member", "Price", "Date");
		IAggregateExecutor<List<Object>, ?> executor = stream.group(
			stream.field("City").stringValue(), /* Key expression for parent aggregation */
			stream.list(
				stream.countInteger(),
				stream.avgDouble(stream.field("Price").doubleValue()),
				stream.group(
					stream.field("Member").stringValue(), /* Key expression for child aggregation */
					stream.list(
						stream.countAllInteger(),
						stream.avgDouble(stream.field("Price").doubleValue())
					))
			)
		).build().create();
		
		for(Integer i=1; i<=1000; i++) {
			executor.execute(sampleDataFactory.makeRandomTuple());
		}
		System.out.println(executor.getValue());
```

#####  Sample Output 3
```
{member 1=[91, 47.302507917409464, {İstanbul=[27, 45.74792545237466], Ankara=[36, 51.110272596228555], İzmir=[28, 43.905872135925634]}], member 4=[101, 48.70998073116574, {İstanbul=[35, 54.954345808699024], Ankara=[29, 40.05005334065988], İzmir=[37, 49.590659558490124]}], member 5=[92, 47.08230881726597, {İstanbul=[29, 56.1647019378131], Ankara=[40, 42.26195538830037], İzmir=[23, 44.01381910695105]}], member 2=[82, 54.595791966469854, {İstanbul=[36, 57.47613594575003], Ankara=[31, 52.057382719993996], İzmir=[15, 52.929012192247484]}], member 3=[109, 50.23695001072399, {İstanbul=[44, 45.39498181626693], Ankara=[33, 59.18439258596966], İzmir=[32, 47.66760612238026]}], member 8=[102, 47.64010766714483, {İstanbul=[34, 43.16858869184017], Ankara=[37, 54.7903819917268], İzmir=[31, 44.01015589781657]}], member 9=[103, 45.63063589752289, {İstanbul=[26, 49.49894553246937], Ankara=[36, 39.91160091037369], İzmir=[41, 48.19915319090737]}], member 6=[104, 48.72219647194067, {İstanbul=[37, 53.58135272453103], Ankara=[28, 48.30990458614144], İzmir=[39, 44.40823215031332]}], member 10=[116, 49.81466849916223, {İstanbul=[42, 46.49856337648167], İzmir=[36, 47.772584501527355], Ankara=[38, 55.41444321146325]}], member 7=[100, 48.1332188808438, {İstanbul=[30, 44.84273836371414], İzmir=[42, 53.86914062842256], Ankara=[28, 43.054851099257334]}]}
```

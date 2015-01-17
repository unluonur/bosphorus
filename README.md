bosphorus
====

An experimental distributed Java complex event processor.


##### Projection Example

```java
	ListStreamBuilder ss = new ListStreamBuilder("Name", "BirthDate");
	
	IPipeExecutor<List<Object>> executor =
			ss.projection(ss.list(
					ss.stringField("Name"),
					ss.subtractInteger(ss.year(ss.now()), ss.year(ss.dateField("BirthDate")))))
			.then(ss.consoleLog())
			.build();
	
	executor.writeOne(Arrays.asList("Onur Ünlü", new Date(83, 7, 29)));

```

#####  Output
```
[Onur Ünlü, 32]

```


##### Filter Example

```java
	ListStreamBuilder ss = new ListStreamBuilder("Id", "City", "Value");
	
	IPipeExecutor<List<Object>> executor = 
			ss.filter(ss.equals(ss.stringField("City"), "İstanbul"))
			.then(ss.consoleLog())
			.build();
	
	executor.writeOne(Arrays.asList(1, "İstanbul", 100));
	executor.writeOne(Arrays.asList(1, "İstanbul", 110));
	executor.writeOne(Arrays.asList(2, "Ankara", 95));
	executor.writeOne(Arrays.asList(1, "İstanbul", 125));
	executor.writeOne(Arrays.asList(2, "Ankara", 120));

```

#####  Output
```
[1, İstanbul, 100]
[1, İstanbul, 110]
[1, İstanbul, 125]
```

##### Partition Example

```java
	ListStreamBuilder ss = new ListStreamBuilder("SensorId", "Value", "Date");

	IStreamInput<List<Object>> pipe = ss.projection(
		ss.partition(
			ss.integerField("SensorId"), // Partition key
			ss.list(
				ss.identityInteger(),
				ss.integerField("SensorId"),
				ss.previous(ss.doubleField("Value")), // previous value
				ss.doubleField("Value"), // current value
				ss.previous(ss.dateField("Date")), // previous date
				ss.doubleField("Date") // current date
			)
		)
	).then(ss.consoleLog());
	
	IPipeExecutor<List<Object>> executor = pipe.build();
	
	executor.writeOne(Arrays.asList(1, 100, new Date(115, 0, 15, 21, 00, 00)));
	executor.writeOne(Arrays.asList(1, 110, new Date(115, 0, 15, 21, 01, 00)));
	executor.writeOne(Arrays.asList(2, 95, new Date(115, 0, 15, 21, 02, 00)));
	executor.writeOne(Arrays.asList(1, 125, new Date(115, 0, 15, 21, 03, 00)));
	executor.writeOne(Arrays.asList(2, 120, new Date(115, 0, 15, 21, 04, 00)));

```

#####  Output
```
[1, 1, null, 100, null, Thu Jan 15 21:00:00 EET 2015]
[2, 1, 100, 110, Thu Jan 15 21:00:00 EET 2015, Thu Jan 15 21:01:00 EET 2015]
[1, 2, null, 95, null, Thu Jan 15 21:02:00 EET 2015]
[3, 1, 110, 125, Thu Jan 15 21:01:00 EET 2015, Thu Jan 15 21:03:00 EET 2015]
[2, 2, 95, 120, Thu Jan 15 21:02:00 EET 2015, Thu Jan 15 21:04:00 EET 2015]

```


##### Aggregation Example

```java
	ListStreamBuilder ss = new ListStreamBuilder("Id", "Value");

	IStreamInput<List<Object>> pipe = ss.aggregate(
		ss.list(
			ss.sumDouble(ss.doubleField("Value")),
			ss.avgDouble(ss.doubleField("Value")),
			ss.stdDevDouble(ss.doubleField("Value"))
		), 1000 // window interval (ms)
	).then(ss.consoleLog());
	
	IPipeExecutor<List<Object>> executor = pipe.build();
	
	executor.writeOne(Arrays.asList(1, 100));
	executor.writeOne(Arrays.asList(1, 110));
	executor.writeOne(Arrays.asList(2, 95));
	executor.writeOne(Arrays.asList(1, 125));
	executor.writeOne(Arrays.asList(2, 120));

```

#####  Output
```
[550.0, 110.0, 25.495097567963924]

```


#####  Scalar Functions
######  Date Functions
* year
* month
* dateDiff
* dayOfMonth
* dayOfWeek
* hour
* minute
* second
* truncateToYear
* truncateToMonth
* truncateToDay
* truncateToHour
* truncateToMinute
* truncateToSecond
* now

######  Logical Operations
* and
* or
* equals
* notEquals
* isNull
* isNotNull
* lessThan
* lessThanOrEqual
* greaterThan
* greaterThanOrEqual
* in
* notIn
* not

######  Mathematical Functions
* add
* subtract
* multiply
* divide
* mod

######  String Functions
* parseDate
* parseInteger
* parseLong
* parseFloat
* parseDouble
* regexMatch
* strConcat
* strContains
* strIndexOf
* strJoin
* strLength
* strSplit
* subString

######  Other Functions
* partition
* identity
* previous
* convert
* guid
* iif
* ifnull
* random

#####  Aggregate Functions
* group
* count
* countDistinct
* sum
* selectDistinct
* first
* last
* min
* max
* avg
* stdDev
* median

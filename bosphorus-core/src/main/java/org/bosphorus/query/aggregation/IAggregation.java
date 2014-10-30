package org.bosphorus.query.aggregation;

import java.util.List;

public interface IAggregation {
	
	void put(List<Object> input) throws Exception;
	List<List<Object>> get(Boolean reset) throws Exception;
	
}

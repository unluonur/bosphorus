package org.bosphorus.query.join;

import java.util.ArrayList;
import java.util.List;

public class Join {
	private List<IJoin> joins;
	
	public Join(List<IJoin> joins) {
		this.joins = joins;
	}
	
	public List<List<List<Object>>> execute(List<List<List<Object>>> input) throws Exception {
		List<List<List<Object>>> result = new ArrayList<List<List<Object>>>();
		result.add(input.get(0));
		for(Integer i=0; i<joins.size(); i++) {
			result = joins.get(i).execute(result, input.get(i+1));
		}
		return result;
	}
}

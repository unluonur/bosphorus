package org.bosphorus.query.join;

import java.util.List;

public interface IJoin {
	
	List<List<List<Object>>> execute(List<List<List<Object>>> left, List<List<Object>> right) throws Exception;
	
}

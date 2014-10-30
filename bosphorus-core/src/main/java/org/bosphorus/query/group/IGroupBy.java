package org.bosphorus.query.group;

import java.util.List;

public interface IGroupBy<TInput> {
	
	void reset();
	void execute(TInput input);
	List<List<Object>> getValues();
	
}

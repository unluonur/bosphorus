package org.bosphorus.query.group;

public interface IGroupBy<TInput> {
	
	void init();
	void group(TInput input);
	
}

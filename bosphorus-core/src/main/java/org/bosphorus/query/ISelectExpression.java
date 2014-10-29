package org.bosphorus.query;

import org.bosphorus.core.ITuple;

public interface ISelectExpression<TInput, TOutput> {
	
	void init();
	void execute(ITuple input);
	TOutput getValue();
	void clear();
	
}

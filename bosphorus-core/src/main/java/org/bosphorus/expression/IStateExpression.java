package org.bosphorus.expression;

public interface IStateExpression {

	void reset();
	Object getState();
	void setState(Object state) throws Exception;
	
}

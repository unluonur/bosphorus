package org.bosphorus.query.filter;

public interface IFilter<TInput> {
	
	Boolean isMatch(TInput input) throws Exception;
	
}

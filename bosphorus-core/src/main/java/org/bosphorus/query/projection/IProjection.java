package org.bosphorus.query.projection;

import java.util.List;

public interface IProjection<TInput> {
	
	List<Object> execute(TInput input) throws Exception;
	
}

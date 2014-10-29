package org.bosphorus.stream;

import java.util.List;
import org.bosphorus.core.ITuple;

public interface IStreamDefinition {
	
	@SuppressWarnings("rawtypes")
	List<IFieldDefinition> getFields();
	
	Integer getFieldIndex(String fieldName);
	
	ITuple createTuple(List<Object> values);
	
}

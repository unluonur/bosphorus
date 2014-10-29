package org.bosphorus.stream;

import org.bosphorus.core.type.IType;

public interface IFieldDefinition<T> {
	
	String getName();
	
	IType<T> getType();
	
}

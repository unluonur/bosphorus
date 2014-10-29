package org.bosphorus.core.type;

public interface IType<T> {
	
	T convert(Object obj);
	String getName();
	
}

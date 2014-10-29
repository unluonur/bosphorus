package org.bosphorus.core.type;

public abstract class BaseType<T> implements IType<T> {
	
	@SuppressWarnings("unchecked")
	public T convert(Object obj) {
		return (T)obj;
	}
}

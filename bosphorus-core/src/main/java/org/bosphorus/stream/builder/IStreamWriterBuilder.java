package org.bosphorus.stream.builder;

import java.util.List;

import org.bosphorus.core.type.IType;
import org.bosphorus.stream.IStreamWriter;

public interface IStreamWriterBuilder<TInput> {
	
	IStreamWriter<TInput> build();
	
	@SuppressWarnings("rawtypes")
	List<IType> getInputFields();
	
}

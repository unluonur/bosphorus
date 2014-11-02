package org.bosphorus.stream.builder;

import java.util.List;
import org.bosphorus.core.type.IType;
import org.bosphorus.stream.IStreamReader;

public interface IStreamReaderBuilder<TOutput> {
	
	IStreamReader<TOutput> build();
	
	@SuppressWarnings("rawtypes")
	List<IType> getOutputFields();
	
}

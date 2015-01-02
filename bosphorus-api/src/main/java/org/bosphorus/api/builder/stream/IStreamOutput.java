package org.bosphorus.api.builder.stream;

import java.io.Serializable;
import java.util.List;

import org.bosphorus.api.builder.node.INodeContext;
import org.bosphorus.stream.IPipeExecutor;

public interface IStreamOutput<TType> extends Serializable {

	List<IStreamInput<TType>> getDestinations();

	void setDestinations(List<IStreamInput<TType>> destinations);

	IPipeExecutor<TType> build(INodeContext context) throws Exception;

}
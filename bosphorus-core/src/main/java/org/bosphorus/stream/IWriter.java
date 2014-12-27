package org.bosphorus.stream;

import java.util.List;

public interface IWriter<TInput> {

	void writeOne(TInput input) throws Exception;

	void writeMulti(List<? extends TInput> input) throws Exception;

}

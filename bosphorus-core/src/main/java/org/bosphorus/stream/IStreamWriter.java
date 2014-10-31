package org.bosphorus.stream;

import java.util.List;

public interface IStreamWriter<TInput> {
	void writeSingle(TInput input) throws Exception;
	void writeMulti(List<TInput> input) throws Exception;
}

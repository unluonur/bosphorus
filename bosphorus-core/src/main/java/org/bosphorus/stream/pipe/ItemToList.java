package org.bosphorus.stream.pipe;

import java.util.List;

import org.bosphorus.stream.IWriter;

public class ItemToList<TType> implements IWriter<List<? extends TType>> {
	private IWriter<? super TType> output;

	@Override
	public void writeOne(List<? extends TType> input) throws Exception {
		output.writeMulti(input);
	}

	@Override
	public void writeMulti(List<? extends List<? extends TType>> input) throws Exception {
		for(List<? extends TType> list: input) {
			output.writeMulti(list);
		}
	}

}

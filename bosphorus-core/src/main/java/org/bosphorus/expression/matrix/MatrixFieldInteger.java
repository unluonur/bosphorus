package org.bosphorus.expression.matrix;

import java.util.List;

public class MatrixFieldInteger<TInput extends List<List<Object>>> extends BaseMatrixField<List<List<Object>>, Integer> {

	public MatrixFieldInteger(Integer index1, Integer index2) {
		super(index1, index2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer execute(List<List<Object>> input) throws Exception {
		return (Integer)(input.get(this.getIndex1()).get(this.getIndex2()));
	}

}

package org.bosphorus.expression.matrix;

import java.util.List;

public class MatrixFieldBoolean<TInput extends List<List<Object>>> extends BaseMatrixField<List<List<Object>>, Boolean> {

	public MatrixFieldBoolean(Integer index1, Integer index2) {
		super(index1, index2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean execute(List<List<Object>> input) throws Exception {
		return (Boolean)(input.get(this.getIndex1()).get(this.getIndex2()));
	}

}

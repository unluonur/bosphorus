package org.bosphorus.expression.matrix;

import java.util.List;

public class MatrixFieldFloat<TInput extends List<List<Object>>> extends BaseMatrixField<List<List<Object>>, Float> {

	public MatrixFieldFloat(Integer index1, Integer index2) {
		super(index1, index2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Float execute(List<List<Object>> input) throws Exception {
		return (Float)(input.get(this.getIndex1()).get(this.getIndex2()));
	}

}

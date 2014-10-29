package org.bosphorus.expression.matrix;

import java.util.List;

public class MatrixFieldDouble<TInput extends List<List<Object>>> extends BaseMatrixField<List<List<Object>>, Double> {

	public MatrixFieldDouble(Integer index1, Integer index2) {
		super(index1, index2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double execute(List<List<Object>> input) throws Exception {
		return (Double)(input.get(this.getIndex1()).get(this.getIndex2()));
	}

}

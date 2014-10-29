package org.bosphorus.expression.matrix;

import java.util.List;

public class MatrixFieldLong<TInput extends List<List<Object>>> extends BaseMatrixField<List<List<Object>>, Long> {

	public MatrixFieldLong(Integer index1, Integer index2) {
		super(index1, index2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Long execute(List<List<Object>> input) throws Exception {
		return (Long)(input.get(this.getIndex1()).get(this.getIndex2()));
	}

}

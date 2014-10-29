package org.bosphorus.expression.matrix;

import java.util.List;

public class MatrixFieldString<TInput extends List<List<Object>>> extends BaseMatrixField<List<List<Object>>, String> {

	public MatrixFieldString(Integer index1, Integer index2) {
		super(index1, index2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String execute(List<List<Object>> input) throws Exception {
		return (String)(input.get(this.getIndex1()).get(this.getIndex2()));
	}

}

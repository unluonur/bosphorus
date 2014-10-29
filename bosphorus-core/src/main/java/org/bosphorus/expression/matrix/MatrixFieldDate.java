package org.bosphorus.expression.matrix;

import java.util.Date;
import java.util.List;

public class MatrixFieldDate<TInput extends List<List<Object>>> extends BaseMatrixField<List<List<Object>>, Date> {

	public MatrixFieldDate(Integer index1, Integer index2) {
		super(index1, index2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Date execute(List<List<Object>> input) throws Exception {
		return (Date)(input.get(this.getIndex1()).get(this.getIndex2()));
	}

}

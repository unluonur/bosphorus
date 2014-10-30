package org.bosphorus.expression.join;

import java.util.Date;
import java.util.List;

public class JoinFieldDouble<TInput extends List<List<Object>>> extends BaseJoinField<List<List<Object>>, Double> {

	public JoinFieldDouble(Integer streamIndex, Integer fieldIndex) {
		super(streamIndex, fieldIndex);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double execute(List<List<Object>> input) throws Exception {
		List<Object> streamRow = input.get(this.getStreamIndex());
		if(streamRow != null) {
			
			return (Double)(streamRow.get(this.getFieldIndex()));	
		}
		return null;
	}

}

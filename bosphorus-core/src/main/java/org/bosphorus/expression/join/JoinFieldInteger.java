package org.bosphorus.expression.join;

import java.util.List;

public class JoinFieldInteger<TInput extends List<List<Object>>> extends BaseJoinField<List<List<Object>>, Integer> {

	public JoinFieldInteger(Integer streamIndex, Integer fieldIndex) {
		super(streamIndex, fieldIndex);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer execute(List<List<Object>> input) throws Exception {
		List<Object> streamRow = input.get(this.getStreamIndex());
		if(streamRow != null) {
			
			return (Integer)(streamRow.get(this.getFieldIndex()));	
		}
		return null;
	}

}

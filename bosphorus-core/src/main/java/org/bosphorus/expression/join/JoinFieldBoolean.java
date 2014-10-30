package org.bosphorus.expression.join;

import java.util.List;

public class JoinFieldBoolean<TInput extends List<List<Object>>> extends BaseJoinField<List<List<Object>>, Boolean> {

	public JoinFieldBoolean(Integer streamIndex, Integer fieldIndex) {
		super(streamIndex, fieldIndex);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean execute(List<List<Object>> input) throws Exception {
		List<Object> streamRow = input.get(this.getStreamIndex());
		if(streamRow != null) {
			
			return (Boolean)(streamRow.get(this.getFieldIndex()));	
		}
		return null;
	}

}

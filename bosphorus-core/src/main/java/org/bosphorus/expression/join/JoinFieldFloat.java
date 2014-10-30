package org.bosphorus.expression.join;

import java.util.List;

public class JoinFieldFloat<TInput extends List<List<Object>>> extends BaseJoinField<List<List<Object>>, Float> {

	public JoinFieldFloat(Integer streamIndex, Integer fieldIndex) {
		super(streamIndex, fieldIndex);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Float execute(List<List<Object>> input) throws Exception {
		List<Object> streamRow = input.get(this.getStreamIndex());
		if(streamRow != null) {
			
			return (Float)(streamRow.get(this.getFieldIndex()));	
		}
		return null;
	}

}

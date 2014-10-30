package org.bosphorus.expression.join;

import java.util.List;

public class JoinFieldLong<TInput extends List<List<Object>>> extends BaseJoinField<List<List<Object>>, Long> {

	public JoinFieldLong(Integer streamIndex, Integer fieldIndex) {
		super(streamIndex, fieldIndex);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Long execute(List<List<Object>> input) throws Exception {
		List<Object> streamRow = input.get(this.getStreamIndex());
		if(streamRow != null) {
			
			return (Long)(streamRow.get(this.getFieldIndex()));	
		}
		return null;
	}

}

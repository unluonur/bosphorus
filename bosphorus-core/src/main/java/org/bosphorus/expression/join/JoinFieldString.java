package org.bosphorus.expression.join;

import java.util.List;

public class JoinFieldString<TInput extends List<List<Object>>> extends BaseJoinField<List<List<Object>>, String> {

	public JoinFieldString(Integer streamIndex, Integer fieldIndex) {
		super(streamIndex, fieldIndex);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String execute(List<List<Object>> input) throws Exception {
		List<Object> streamRow = input.get(this.getStreamIndex());
		if(streamRow != null) {
			return (String)(streamRow.get(this.getFieldIndex()));	
		}
		return null;
	}

}

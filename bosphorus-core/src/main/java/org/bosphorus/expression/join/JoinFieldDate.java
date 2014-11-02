package org.bosphorus.expression.join;

import java.util.Date;
import java.util.List;

public class JoinFieldDate<TInput extends List<List<Object>>> extends BaseJoinField<List<List<Object>>, Date> {

	public JoinFieldDate(Integer streamIndex, Integer fieldIndex) {
		super(streamIndex, fieldIndex);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Date execute(List<List<Object>> input) throws Exception {
		List<Object> streamRow = input.get(this.getStreamIndex());
		if(streamRow != null) {
			return (Date)(streamRow.get(this.getFieldIndex()));	
		}
		return null;
	}

}

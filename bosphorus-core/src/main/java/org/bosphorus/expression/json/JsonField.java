package org.bosphorus.expression.json;

import org.bosphorus.expression.IExpression;
import org.json.JSONObject;

public class JsonField<TOutput> implements IExpression<JSONObject, TOutput> {
	private String field;

	@SuppressWarnings("unchecked")
	@Override
	public TOutput execute(JSONObject input) throws Exception {
		// TODO
		return (TOutput)input.get(this.field);
	}

}

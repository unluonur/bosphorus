package org.bosphorus.query.join;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.expression.IExpression;

public class LeftOuterJoin extends BaseJoin {

	public LeftOuterJoin(IExpression<List<List<Object>>, Boolean> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<List<List<Object>>> execute(List<List<List<Object>>> left,
			List<List<Object>> right) throws Exception {
		ArrayList<List<List<Object>>> result = new ArrayList<List<List<Object>>>();
		for(List<List<Object>> leftRow: left) {
			Boolean found = false;
			for(List<Object> rightRow: right) {
				ArrayList<List<Object>> row = new ArrayList<List<Object>>(leftRow);
				row.add(rightRow);
				if(this.getExpression().execute(row)) {
					result.add(row);
					found = true;
				}
			}
			if(!found) {
				ArrayList<List<Object>> row = new ArrayList<List<Object>>(leftRow);
				row.add(null);
				result.add(row);
			}
		}
		return result;
	}

}

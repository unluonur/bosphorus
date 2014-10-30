package org.bosphorus.query.join;

import java.util.List;
import org.bosphorus.expression.IExpression;

public abstract class BaseJoin implements IJoin {
	
	private IExpression<List<List<Object>>, Boolean> expression;
	
	public BaseJoin(IExpression<List<List<Object>>, Boolean> expression) {
		
	}

	public IExpression<List<List<Object>>, Boolean> getExpression() {
		return expression;
	}

	public void setExpression(IExpression<List<List<Object>>, Boolean> expression) {
		this.expression = expression;
	}

}

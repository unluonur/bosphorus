package org.bosphorus.statement;

import org.bosphorus.core.ITuple;
import org.bosphorus.expression.IExpression;

public class If implements IStatement {
	
	private IExpression<Boolean> condition;
	private IStatement trueStatement;
	private IStatement falseStatement;
	
	public If(IExpression<Boolean> condition, IStatement trueStatement, IStatement falseStatement) {
		this.condition = condition;
		this.trueStatement = trueStatement;
		this.falseStatement = falseStatement;
	}

	@Override
	public void execute(ITuple input) throws Exception {
		if(condition.execute(input)) {
			trueStatement.execute(input);
		}
		else {
			if(falseStatement != null) {
				falseStatement.execute(input);
			}
		}
	}
}

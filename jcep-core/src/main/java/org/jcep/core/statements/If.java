package org.jcep.core.statements;

import org.jcep.core.expressions.IExpression;

public class If<TInput> implements IStatement<TInput> {
	
	private IExpression<TInput, Boolean> condition;
	private IStatement<TInput> trueStatement;
	private IStatement<TInput> falseStatement;
	
	public If(IExpression<TInput, Boolean> condition, IStatement<TInput> trueStatement, IStatement<TInput> falseStatement) {
		this.condition = condition;
		this.trueStatement = trueStatement;
		this.falseStatement = falseStatement;
	}

	@Override
	public void execute(TInput input) throws Exception {
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

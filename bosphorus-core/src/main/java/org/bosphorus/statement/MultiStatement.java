package org.bosphorus.statement;

import java.util.ArrayList;

import org.bosphorus.core.ITuple;

public class MultiStatement implements IStatement {
	private ArrayList<IStatement> statements;
	
	public MultiStatement(IStatement... statements) {
		this.statements = new ArrayList<IStatement>();
		for(IStatement statement: statements) {
			this.statements.add(statement);
		}
	}
	
	@Override
	public void execute(ITuple input) throws Exception {
		for(IStatement stat: statements) {
			stat.execute(input);
		}
	}
}

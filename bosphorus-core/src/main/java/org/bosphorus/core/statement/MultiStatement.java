package org.bosphorus.core.statement;

import java.util.ArrayList;

public class MultiStatement<TInput> implements IStatement<TInput> {
	private ArrayList<IStatement<TInput>> statements;
	
	public MultiStatement(IStatement<TInput>... statements) {
		this.statements = new ArrayList<IStatement<TInput>>();
		for(IStatement<TInput> statement: statements) {
			this.statements.add(statement);
		}
	}
	
	@Override
	public void execute(TInput input) throws Exception {
		for(IStatement<TInput> stat: statements) {
			stat.execute(input);
		}
	}
}

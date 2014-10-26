package org.bosphorus.core.statements;

import java.util.ArrayList;

public class MultiStatement<TInput> implements IStatement<TInput> {
	private ArrayList<IStatement<TInput>> statements;
	
	public MultiStatement(IStatement<TInput>... statements) {
		this.statements = new ArrayList<IStatement<TInput>>();
		for(IStatement<TInput> stat: statements) {
			this.statements.add(stat);
		}
	}
	
	@Override
	public void execute(TInput input) throws Exception {
		for(IStatement<TInput> stat: statements) {
			stat.execute(input);
		}
	}
}

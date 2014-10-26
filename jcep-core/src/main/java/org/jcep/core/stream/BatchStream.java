package org.jcep.core.stream;

import java.util.List;

import org.jcep.core.statements.IStatement;

public class BatchStream<TType> implements IStatement<TType> {
	
	private IStatement<List<TType>> collector;

	@Override
	public void execute(TType input) {
		// TODO Auto-generated method stub
		
	}

}

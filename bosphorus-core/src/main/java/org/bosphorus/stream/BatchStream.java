package org.bosphorus.stream;

import java.util.List;

import org.bosphorus.statement.IStatement;

public class BatchStream<TType> implements IStatement<TType> {
	
	private IStatement<List<TType>> collector;

	@Override
	public void execute(TType input) {
		// TODO Auto-generated method stub
		
	}

}

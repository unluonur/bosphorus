package org.bosphorus.statement;

public interface IStatement<TInput> {
	void execute(TInput input) throws Exception;
}

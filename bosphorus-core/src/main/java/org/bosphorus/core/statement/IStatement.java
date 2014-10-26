package org.bosphorus.core.statement;

public interface IStatement<TInput> {
	void execute(TInput input) throws Exception;
}

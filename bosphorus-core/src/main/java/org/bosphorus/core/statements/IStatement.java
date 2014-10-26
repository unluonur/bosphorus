package org.bosphorus.core.statements;

public interface IStatement<TInput> {
	void execute(TInput input) throws Exception;
}

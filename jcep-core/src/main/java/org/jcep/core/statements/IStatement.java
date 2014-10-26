package org.jcep.core.statements;

public interface IStatement<TInput> {
	void execute(TInput input) throws Exception;
}

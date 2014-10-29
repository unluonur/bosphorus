package org.bosphorus.statement;

import org.bosphorus.core.ITuple;

public interface IStatement<TInput> {
	void execute(TInput input) throws Exception;
}

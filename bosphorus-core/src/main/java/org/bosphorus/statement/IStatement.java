package org.bosphorus.statement;

import org.bosphorus.core.ITuple;

public interface IStatement {
	void execute(ITuple input) throws Exception;
}

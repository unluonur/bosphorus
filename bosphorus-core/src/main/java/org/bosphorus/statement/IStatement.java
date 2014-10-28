package org.bosphorus.statement;

import org.bosphorus.stream.ITuple;

public interface IStatement {
	void execute(ITuple input) throws Exception;
}

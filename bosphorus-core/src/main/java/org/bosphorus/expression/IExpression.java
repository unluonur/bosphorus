package org.bosphorus.expression;

import java.io.Serializable;

import org.bosphorus.stream.ITuple;

public interface IExpression <TOutput> extends Serializable {
	TOutput execute(ITuple input) throws Exception;
}

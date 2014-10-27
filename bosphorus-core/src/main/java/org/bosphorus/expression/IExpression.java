package org.bosphorus.expression;

import java.io.Serializable;

public interface IExpression <TInput, TOutput> extends Serializable {
	TOutput execute(TInput input) throws Exception;
}

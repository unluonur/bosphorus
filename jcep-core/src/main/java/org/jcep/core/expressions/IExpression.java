package org.jcep.core.expressions;

import java.io.Serializable;

public interface IExpression <TOutput, TInput> extends Serializable {
	TOutput execute(TInput context);
}

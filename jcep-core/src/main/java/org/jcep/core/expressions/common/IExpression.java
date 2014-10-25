package org.jcep.core.expressions.common;

import java.io.Serializable;

public interface IExpression <TType, TContext> extends Serializable {
	TType execute(TContext context);
}

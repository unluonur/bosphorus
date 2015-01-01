/**
 * Copyright (c) Onur Ünlü
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * The latest version of this file can be found at https://github.com/unluonur/bosphorus
 */

package org.bosphorus.builder;

import org.bosphorus.expression.aggregate.factory.common.CountIntegerFactory;
import org.bosphorus.expression.aggregate.factory.common.CountLongFactory;
import org.bosphorus.expression.aggregate.factory.math.SumDoubleFactory;
import org.bosphorus.expression.aggregate.factory.math.SumFloatFactory;
import org.bosphorus.expression.aggregate.factory.math.SumIntegerFactory;
import org.bosphorus.expression.aggregate.factory.math.SumLongFactory;
import org.bosphorus.expression.aggregate.factory.scalar.ExpressionFactory;
import org.bosphorus.expression.scalar.executor.IScalarExecutor;
import org.bosphorus.expression.scalar.executor.common.ConstantExecutor;
import org.bosphorus.expression.scalar.executor.common.ConvertExecutor;

public class ExpressionBuilder<TInput> {
	
	public <TType> ConstantExecutor<TInput, TType> constant(TType value) {
		return new ConstantExecutor<TInput, TType>(value);
	}
	
	public <TOutput, TSource> ConvertExecutor<TInput, TOutput, TSource> convert(IScalarExecutor<TInput, TSource> expression) {
		return new ConvertExecutor<TInput, TOutput, TSource>(expression);
	}
	
	public ExpressionFactory<TInput, Object, Integer> countInteger(IScalarExecutor<TInput, ?> expression) {
		return new ExpressionFactory<TInput, Object, Integer>(expression, new CountIntegerFactory());
	}
	
	public ExpressionFactory<TInput, Object, Long> countLong(IScalarExecutor<TInput, ?> expression) {
		return new ExpressionFactory<TInput, Object, Long>(expression, new CountLongFactory());
	}
	
	public ExpressionFactory<TInput, Number, Integer> sumInteger(IScalarExecutor<TInput, ? extends Number> expression) {
		return new ExpressionFactory<TInput, Number, Integer>(expression, new SumIntegerFactory());
	}
	
	public ExpressionFactory<TInput, Number, Long> sumLong(IScalarExecutor<TInput, ? extends Number> expression) {
		return new ExpressionFactory<TInput, Number, Long>(expression, new SumLongFactory());
	}
	
	public ExpressionFactory<TInput, Number, Float> sumFloat(IScalarExecutor<TInput, ? extends Number> expression) {
		return new ExpressionFactory<TInput, Number, Float>(expression, new SumFloatFactory());
	}
	
	public ExpressionFactory<TInput, Number, Double> sumDouble(IScalarExecutor<TInput, ? extends Number> expression) {
		return new ExpressionFactory<TInput, Number, Double>(expression, new SumDoubleFactory());
	}
	
	
	
}

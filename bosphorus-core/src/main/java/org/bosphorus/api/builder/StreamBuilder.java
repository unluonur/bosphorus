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


package org.bosphorus.api.builder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.bosphorus.api.builder.expression.aggregate.IAggregateExpression;
import org.bosphorus.api.builder.expression.aggregate.common.AggregateListExpression;
import org.bosphorus.api.builder.expression.aggregate.common.CountDistinctExpression;
import org.bosphorus.api.builder.expression.aggregate.common.CountIntegerExpression;
import org.bosphorus.api.builder.expression.aggregate.common.CountLongExpression;
import org.bosphorus.api.builder.expression.aggregate.common.FirstExpression;
import org.bosphorus.api.builder.expression.aggregate.common.GroupToMapExpression;
import org.bosphorus.api.builder.expression.aggregate.common.GroupToValuesExpression;
import org.bosphorus.api.builder.expression.aggregate.common.MaxExpression;
import org.bosphorus.api.builder.expression.aggregate.common.MinExpression;
import org.bosphorus.api.builder.expression.aggregate.event.ScalarToAggregateExpression;
import org.bosphorus.api.builder.expression.aggregate.list.SelectDistinctExpression;
import org.bosphorus.api.builder.expression.aggregate.math.AvgDoubleExpression;
import org.bosphorus.api.builder.expression.aggregate.math.AvgFloatExpression;
import org.bosphorus.api.builder.expression.aggregate.math.AvgIntegerExpression;
import org.bosphorus.api.builder.expression.aggregate.math.AvgLongExpression;
import org.bosphorus.api.builder.expression.aggregate.math.StdDevDoubleExpression;
import org.bosphorus.api.builder.expression.aggregate.math.SumDoubleExpression;
import org.bosphorus.api.builder.expression.aggregate.math.SumFloatExpression;
import org.bosphorus.api.builder.expression.aggregate.math.SumIntegerExpression;
import org.bosphorus.api.builder.expression.aggregate.math.SumLongExpression;
import org.bosphorus.api.builder.expression.scalar.IScalarExpression1;
import org.bosphorus.api.builder.expression.scalar.common.ConstantExpression;
import org.bosphorus.api.builder.expression.scalar.common.ConvertExpression;
import org.bosphorus.api.builder.expression.scalar.common.GuidExpression;
import org.bosphorus.api.builder.expression.scalar.common.IIfExpression;
import org.bosphorus.api.builder.expression.scalar.common.IdentityIntegerExpression;
import org.bosphorus.api.builder.expression.scalar.common.IdentityLongExpression;
import org.bosphorus.api.builder.expression.scalar.common.IfNullExpression;
import org.bosphorus.api.builder.expression.scalar.common.InputExpression;
import org.bosphorus.api.builder.expression.scalar.common.PartitionExpression;
import org.bosphorus.api.builder.expression.scalar.common.PreviousExpression;
import org.bosphorus.api.builder.expression.scalar.common.RandomExpression;
import org.bosphorus.api.builder.expression.scalar.common.RandomSeedExpression;
import org.bosphorus.api.builder.expression.scalar.date.DateDiffExpression;
import org.bosphorus.api.builder.expression.scalar.date.DayOfMonthExpression;
import org.bosphorus.api.builder.expression.scalar.date.DayOfWeekExpression;
import org.bosphorus.api.builder.expression.scalar.date.HourExpression;
import org.bosphorus.api.builder.expression.scalar.date.MinuteExpression;
import org.bosphorus.api.builder.expression.scalar.date.MonthExpression;
import org.bosphorus.api.builder.expression.scalar.date.NowExpression;
import org.bosphorus.api.builder.expression.scalar.date.SecondExpression;
import org.bosphorus.api.builder.expression.scalar.date.TruncateToDayExpression;
import org.bosphorus.api.builder.expression.scalar.date.TruncateToHourExpression;
import org.bosphorus.api.builder.expression.scalar.date.TruncateToMinuteExpression;
import org.bosphorus.api.builder.expression.scalar.date.TruncateToMonthExpression;
import org.bosphorus.api.builder.expression.scalar.date.TruncateToSecondExpression;
import org.bosphorus.api.builder.expression.scalar.date.TruncateToWeekExpression;
import org.bosphorus.api.builder.expression.scalar.date.TruncateToYearExpression;
import org.bosphorus.api.builder.expression.scalar.date.YearExpression;
import org.bosphorus.api.builder.expression.scalar.event.ExpressionList;
import org.bosphorus.api.builder.expression.scalar.event.ScalarExpression0;
import org.bosphorus.api.builder.expression.scalar.event.ScalarExpression1;
import org.bosphorus.api.builder.expression.scalar.event.ScalarExpression2;
import org.bosphorus.api.builder.expression.scalar.event.ScalarExpression3;
import org.bosphorus.api.builder.expression.scalar.logical.AndExpression;
import org.bosphorus.api.builder.expression.scalar.logical.EqualsExpression;
import org.bosphorus.api.builder.expression.scalar.logical.GreaterThanExpression;
import org.bosphorus.api.builder.expression.scalar.logical.GreaterThanOrEqualExpression;
import org.bosphorus.api.builder.expression.scalar.logical.InExpression;
import org.bosphorus.api.builder.expression.scalar.logical.IsNotNullExpression;
import org.bosphorus.api.builder.expression.scalar.logical.IsNullExpression;
import org.bosphorus.api.builder.expression.scalar.logical.LessThanExpression;
import org.bosphorus.api.builder.expression.scalar.logical.LessThanOrEqualExpression;
import org.bosphorus.api.builder.expression.scalar.logical.NotEqualsExpression;
import org.bosphorus.api.builder.expression.scalar.logical.NotExpression;
import org.bosphorus.api.builder.expression.scalar.logical.NotInExpression;
import org.bosphorus.api.builder.expression.scalar.logical.OrExpression;
import org.bosphorus.api.builder.expression.scalar.math.AddDoubleExpression;
import org.bosphorus.api.builder.expression.scalar.math.AddFloatExpression;
import org.bosphorus.api.builder.expression.scalar.math.AddIntegerExpression;
import org.bosphorus.api.builder.expression.scalar.math.AddLongExpression;
import org.bosphorus.api.builder.expression.scalar.math.DivideDoubleExpression;
import org.bosphorus.api.builder.expression.scalar.math.DivideFloatExpression;
import org.bosphorus.api.builder.expression.scalar.math.DivideIntegerExpression;
import org.bosphorus.api.builder.expression.scalar.math.DivideLongExpression;
import org.bosphorus.api.builder.expression.scalar.math.ModIntegerExpression;
import org.bosphorus.api.builder.expression.scalar.math.ModLongExpression;
import org.bosphorus.api.builder.expression.scalar.math.MultiplyDoubleExpression;
import org.bosphorus.api.builder.expression.scalar.math.MultiplyFloatExpression;
import org.bosphorus.api.builder.expression.scalar.math.MultiplyIntegerExpression;
import org.bosphorus.api.builder.expression.scalar.math.MultiplyLongExpression;
import org.bosphorus.api.builder.expression.scalar.math.SubtractDoubleExpression;
import org.bosphorus.api.builder.expression.scalar.math.SubtractFloatExpression;
import org.bosphorus.api.builder.expression.scalar.math.SubtractIntegerExpression;
import org.bosphorus.api.builder.expression.scalar.math.SubtractLongExpression;
import org.bosphorus.api.builder.expression.scalar.string.ParseDateConstExpression;
import org.bosphorus.api.builder.expression.scalar.string.ParseDateExpression;
import org.bosphorus.api.builder.expression.scalar.string.ParseDoubleExpression;
import org.bosphorus.api.builder.expression.scalar.string.ParseFloatExpression;
import org.bosphorus.api.builder.expression.scalar.string.ParseIntegerExpression;
import org.bosphorus.api.builder.expression.scalar.string.ParseLongExpression;
import org.bosphorus.api.builder.expression.scalar.string.RegexMatchConstExpression;
import org.bosphorus.api.builder.expression.scalar.string.RegexMatchExpression;
import org.bosphorus.api.builder.expression.scalar.string.StrConcatExpression;
import org.bosphorus.api.builder.expression.scalar.string.StrContainsExpression;
import org.bosphorus.api.builder.expression.scalar.string.StrIndexOfExpression;
import org.bosphorus.api.builder.expression.scalar.string.StrJoinExpression;
import org.bosphorus.api.builder.expression.scalar.string.StrLengthExpression;
import org.bosphorus.api.builder.expression.scalar.string.StrSplitExpression;
import org.bosphorus.api.builder.expression.scalar.string.SubStringExpression;
import org.bosphorus.api.builder.stream.ConsoleLogPipe;
import org.bosphorus.api.builder.stream.FilterPipe;
import org.bosphorus.api.builder.stream.OneToManyPipe;
import org.bosphorus.api.builder.stream.ProjectionPipe;
import org.bosphorus.api.builder.stream.TimeIntervalAggregateStream;

public class StreamBuilder<TInput> {
	
	public <TType> IScalarExpression1<TInput, TType> constant(TType value) {
		return new ScalarExpression0<TInput, TType>(new ConstantExpression<TType>(value));
	}
	
	public IScalarExpression1<TInput, TInput> input() {
		return new InputExpression<TInput>();
	}
	
	public IScalarExpression1<TInput, String> guid() {
		return new ScalarExpression0<TInput, String>(new GuidExpression());
	}
	
	public IScalarExpression1<TInput, Double> random() {
		return new ScalarExpression0<TInput, Double>(new RandomExpression());
	}
	
	public IScalarExpression1<TInput, Double> random(Long seed) {
		return new ScalarExpression0<TInput, Double>(new RandomSeedExpression(seed));
	}
	
	public IScalarExpression1<TInput, Integer> identityInteger() {
		return new ScalarExpression0<TInput, Integer>(new IdentityIntegerExpression());
	}
	
	public IScalarExpression1<TInput, Long> identityLong() {
		return new ScalarExpression0<TInput, Long>(new IdentityLongExpression());
	}
	
	public <TOutput> IScalarExpression1<TInput, TOutput> iif(IScalarExpression1<TInput, Boolean> condition, IScalarExpression1<TInput, TOutput> trueExpression, IScalarExpression1<TInput, TOutput> falseExpression) {
		return new IIfExpression<TInput, TOutput>(condition, trueExpression, falseExpression);
	}
	
	public <TOutput> IScalarExpression1<TInput, TOutput> iif(IScalarExpression1<TInput, Boolean> condition, IScalarExpression1<TInput, TOutput> trueExpression, TOutput falseValue) {
		return new IIfExpression<TInput, TOutput>(condition, trueExpression, constant(falseValue));
	}
	
	public <TOutput> IScalarExpression1<TInput, TOutput> ifNull(IScalarExpression1<TInput, TOutput> expression, IScalarExpression1<TInput, TOutput> defaultExpression) {
		return new IfNullExpression<TInput, TOutput>(expression, defaultExpression);
	}
	
	public <TOutput> IScalarExpression1<TInput, TOutput> ifNull(IScalarExpression1<TInput, TOutput> expression, TOutput defaultExpression) {
		return ifNull(expression, constant(defaultExpression));
	}
	
	public <TOutput> IScalarExpression1<TInput, TOutput> previous(IScalarExpression1<TInput, TOutput> expression) {
		return new ScalarExpression1<TInput, TOutput, TOutput>(new PreviousExpression<TOutput>(), expression);
	}
	
	public <TPartitionKey, TOutput> IScalarExpression1<TInput, TOutput> partition(IScalarExpression1<TInput, TPartitionKey> keyExpression, IScalarExpression1<TInput, TOutput> executorExpression) {
		return new PartitionExpression<TInput, TOutput, TPartitionKey>(keyExpression, executorExpression);
	}
	
	@SuppressWarnings("unchecked")
	public IScalarExpression1<TInput, List<Object>> list(IScalarExpression1<TInput, ?>... expressions) {
		ArrayList<IScalarExpression1<TInput, ?>> list = new ArrayList<IScalarExpression1<TInput,?>>();
		for(IScalarExpression1<TInput, ?> expr: expressions) {
			list.add(expr);
		}
		return new ExpressionList<TInput, Object>(list);
	}
	
	public <TType, TOutput> IScalarExpression1<TInput, TOutput> convert(IScalarExpression1<TInput, TType> expression) {
		return new ScalarExpression1<TInput, TOutput, TType>(new ConvertExpression<TType, TOutput>(), expression);
	}
	
	public <TType> IScalarExpression1<TInput, Integer> convertToInteger(IScalarExpression1<TInput, TType> expression) {
		return this.<TType, Integer>convert(expression);
	}
	
	public <TType> IScalarExpression1<TInput, Long> convertToLong(IScalarExpression1<TInput, TType> expression) {
		return this.<TType, Long>convert(expression);
	}
	
	public <TType> IScalarExpression1<TInput, Float> convertToFloat(IScalarExpression1<TInput, TType> expression) {
		return this.<TType, Float>convert(expression);
	}
	
	public <TType> IScalarExpression1<TInput, Double> convertToDouble(IScalarExpression1<TInput, TType> expression) {
		return this.<TType, Double>convert(expression);
	}
	
	public <TType> IScalarExpression1<TInput, String> convertToString(IScalarExpression1<TInput, TType> expression) {
		return this.<TType, String>convert(expression);
	}
	
	public <TType> IScalarExpression1<TInput, Boolean> convertToBoolean(IScalarExpression1<TInput, TType> expression) {
		return this.<TType, Boolean>convert(expression);
	}
	
	public <TType> IScalarExpression1<TInput, Date> convertToDate(IScalarExpression1<TInput, TType> expression) {
		return this.<TType, Date>convert(expression);
	}
	
	public <TType> IScalarExpression1<TInput, List<Object>> convertToList(IScalarExpression1<TInput, TType> expression) {
		return this.<TType, List<Object>>convert(expression);
	}

	/*
	 * Logical Operations
	 */

	public <TType extends Comparable<TType>> IScalarExpression1<TInput, Boolean> equals(IScalarExpression1<TInput, TType> left, IScalarExpression1<TInput, TType> right) {
		return new ScalarExpression2<TInput, Boolean, TType, TType>(new EqualsExpression<TType>(), left, right);
	}

	public <TType extends Comparable<TType>> IScalarExpression1<TInput, Boolean> equals(IScalarExpression1<TInput, TType> left, TType right) {
		return equals(left, constant(right));
	}
	
	public <TType extends Comparable<TType>> IScalarExpression1<TInput, Boolean> notEquals(IScalarExpression1<TInput, TType> left, IScalarExpression1<TInput, TType> right) {
		return new ScalarExpression2<TInput, Boolean, TType, TType>(new NotEqualsExpression<TType>(), left, right);
	}

	public <TType extends Comparable<TType>> IScalarExpression1<TInput, Boolean> notEquals(IScalarExpression1<TInput, TType> left, TType right) {
		return notEquals(left, constant(right));
	}
	
	public IScalarExpression1<TInput, Boolean> isNull(IScalarExpression1<TInput, ?> expression) {
		return new ScalarExpression1<TInput, Boolean, Object>(new IsNullExpression(), expression);
	}
	
	public IScalarExpression1<TInput, Boolean> isNotNull(IScalarExpression1<TInput, ?> expression) {
		return new ScalarExpression1<TInput, Boolean, Object>(new IsNotNullExpression(), expression);
	}
	
	public IScalarExpression1<TInput, Boolean> and(IScalarExpression1<TInput, Boolean> left, IScalarExpression1<TInput, Boolean> right) {
		return new ScalarExpression2<TInput, Boolean, Boolean, Boolean>(new AndExpression(), left, right);
	}
	
	public IScalarExpression1<TInput, Boolean> or(IScalarExpression1<TInput, Boolean> left, IScalarExpression1<TInput, Boolean> right) {
		return new ScalarExpression2<TInput, Boolean, Boolean, Boolean>(new OrExpression(), left, right);
	}

	public <TType extends Comparable<TType>> IScalarExpression1<TInput, Boolean> lessThan(IScalarExpression1<TInput, TType> left, IScalarExpression1<TInput, TType> right) {
		return new ScalarExpression2<TInput, Boolean, TType, TType>(new LessThanExpression<TType>(), left, right);
	}
	
	public <TType extends Comparable<TType>> IScalarExpression1<TInput, Boolean> lessThan(IScalarExpression1<TInput, TType> left, TType right) {
		return lessThan(left, constant(right));
	}
	
	public <TType extends Comparable<TType>> IScalarExpression1<TInput, Boolean> lessThanOrEauals(IScalarExpression1<TInput, TType> left, IScalarExpression1<TInput, TType> right) {
		return new ScalarExpression2<TInput, Boolean, TType, TType>(new LessThanOrEqualExpression<TType>(), left, right);
	}
	
	public <TType extends Comparable<TType>> IScalarExpression1<TInput, Boolean> lessThanOrEauals(IScalarExpression1<TInput, TType> left, TType right) {
		return lessThanOrEauals(left, constant(right));
	}
	
	public <TType extends Comparable<TType>> IScalarExpression1<TInput, Boolean> greaterThan(IScalarExpression1<TInput, TType> left, IScalarExpression1<TInput, TType> right) {
		return new ScalarExpression2<TInput, Boolean, TType, TType>(new GreaterThanExpression<TType>(), left, right);
	}
	
	public <TType extends Comparable<TType>> IScalarExpression1<TInput, Boolean> greaterThan(IScalarExpression1<TInput, TType> left, TType right) {
		return greaterThan(left, constant(right));
	}
	
	public <TType extends Comparable<TType>> IScalarExpression1<TInput, Boolean> greaterThanOrEauals(IScalarExpression1<TInput, TType> left, IScalarExpression1<TInput, TType> right) {
		return new ScalarExpression2<TInput, Boolean, TType, TType>(new GreaterThanOrEqualExpression<TType>(), left, right);
	}
	
	public <TType extends Comparable<TType>> IScalarExpression1<TInput, Boolean> greaterThanOrEauals(IScalarExpression1<TInput, TType> left, TType right) {
		return greaterThanOrEauals(left, constant(right));
	}
	
	public <TType extends Comparable<TType>> IScalarExpression1<TInput, Boolean> in(IScalarExpression1<TInput, TType> valueExpression, IScalarExpression1<TInput, List<TType>> listExpression) {
		return new ScalarExpression2<TInput, Boolean, TType, List<TType>>(new InExpression<TInput, TType>(), valueExpression, listExpression);
	}
	
	public <TType extends Comparable<TType>> IScalarExpression1<TInput, Boolean> in(IScalarExpression1<TInput, TType> valueExpression, List<TType> listExpression) {
		return in(valueExpression, constant(listExpression));
	}
	
	public <TType extends Comparable<TType>> IScalarExpression1<TInput, Boolean> notIn(IScalarExpression1<TInput, TType> valueExpression, IScalarExpression1<TInput, List<TType>> listExpression) {
		return new ScalarExpression2<TInput, Boolean, TType, List<TType>>(new NotInExpression<TInput, TType>(), valueExpression, listExpression);
	}
	
	public <TType extends Comparable<TType>> IScalarExpression1<TInput, Boolean> notIn(IScalarExpression1<TInput, TType> valueExpression, List<TType> listExpression) {
		return notIn(valueExpression, constant(listExpression));
	}
	
	public IScalarExpression1<TInput, Boolean> not(IScalarExpression1<TInput, Boolean> expression) {
		return new ScalarExpression1<TInput, Boolean, Boolean>(new NotExpression(), expression);
	}
	
	/*
	 * Mathematical operations
	 */
	
	public IScalarExpression1<TInput, Integer> addInteger(IScalarExpression1<TInput, ? extends Number> left, IScalarExpression1<TInput, ? extends Number> right) {
		return new ScalarExpression2<TInput, Integer, Number, Number>(new AddIntegerExpression(), left, right);
	}
	
	public IScalarExpression1<TInput, Integer> addInteger(IScalarExpression1<TInput, ? extends Number> left, Number right) {
		return addInteger(left, constant(right));
	}
	
	public IScalarExpression1<TInput, Long> addLong(IScalarExpression1<TInput, ? extends Number> left, IScalarExpression1<TInput, ? extends Number> right) {
		return new ScalarExpression2<TInput, Long, Number, Number>(new AddLongExpression(), left, right);
	}
	
	public IScalarExpression1<TInput, Long> addLong(IScalarExpression1<TInput, ? extends Number> left, Number right) {
		return addLong(left, constant(right));
	}
	
	public IScalarExpression1<TInput, Float> addFloat(IScalarExpression1<TInput, ? extends Number> left, IScalarExpression1<TInput, ? extends Number> right) {
		return new ScalarExpression2<TInput, Float, Number, Number>(new AddFloatExpression(), left, right);
	}
	
	public IScalarExpression1<TInput, Float> addFloat(IScalarExpression1<TInput, ? extends Number> left, Number right) {
		return addFloat(left, constant(right));
	}
	
	public IScalarExpression1<TInput, Double> addDouble(IScalarExpression1<TInput, ? extends Number> left, IScalarExpression1<TInput, ? extends Number> right) {
		return new ScalarExpression2<TInput, Double, Number, Number>(new AddDoubleExpression(), left, right);
	}
	
	public IScalarExpression1<TInput, Double> addDouble(IScalarExpression1<TInput, ? extends Number> left, Number right) {
		return addDouble(left, constant(right));
	}

	public IScalarExpression1<TInput, Integer> subtractInteger(IScalarExpression1<TInput, ? extends Number> left, IScalarExpression1<TInput, ? extends Number> right) {
		return new ScalarExpression2<TInput, Integer, Number, Number>(new SubtractIntegerExpression(), left, right);
	}
	
	public IScalarExpression1<TInput, Integer> subtractInteger(IScalarExpression1<TInput, ? extends Number> left, Number right) {
		return subtractInteger(left, constant(right));
	}
	
	// TODO : add for others
	public IScalarExpression1<TInput, Integer> subtractInteger(Number left, IScalarExpression1<TInput, ? extends Number> right) {
		return subtractInteger(constant(left), right);
	}
	
	public IScalarExpression1<TInput, Long> subtractLong(IScalarExpression1<TInput, ? extends Number> left, IScalarExpression1<TInput, ? extends Number> right) {
		return new ScalarExpression2<TInput, Long, Number, Number>(new SubtractLongExpression(), left, right);
	}
	
	public IScalarExpression1<TInput, Long> subtractLong(IScalarExpression1<TInput, ? extends Number> left, Number right) {
		return subtractLong(left, constant(right));
	}
	
	public IScalarExpression1<TInput, Float> subtractFloat(IScalarExpression1<TInput, ? extends Number> left, IScalarExpression1<TInput, ? extends Number> right) {
		return new ScalarExpression2<TInput, Float, Number, Number>(new SubtractFloatExpression(), left, right);
	}
	
	public IScalarExpression1<TInput, Float> subtractFloat(IScalarExpression1<TInput, ? extends Number> left, Number right) {
		return subtractFloat(left, constant(right));
	}
	
	public IScalarExpression1<TInput, Double> subtractDouble(IScalarExpression1<TInput, ? extends Number> left, IScalarExpression1<TInput, ? extends Number> right) {
		return new ScalarExpression2<TInput, Double, Number, Number>(new SubtractDoubleExpression(), left, right);
	}
	
	public IScalarExpression1<TInput, Double> subtractDouble(IScalarExpression1<TInput, ? extends Number> left, Number right) {
		return subtractDouble(left, constant(right));
	}

	public IScalarExpression1<TInput, Integer> multiplyInteger(IScalarExpression1<TInput, ? extends Number> left, IScalarExpression1<TInput, ? extends Number> right) {
		return new ScalarExpression2<TInput, Integer, Number, Number>(new MultiplyIntegerExpression(), left, right);
	}
	
	public IScalarExpression1<TInput, Integer> multiplyInteger(IScalarExpression1<TInput, ? extends Number> left, Number right) {
		return multiplyInteger(left, constant(right));
	}
	
	public IScalarExpression1<TInput, Long> multiplyLong(IScalarExpression1<TInput, ? extends Number> left, IScalarExpression1<TInput, ? extends Number> right) {
		return new ScalarExpression2<TInput, Long, Number, Number>(new MultiplyLongExpression(), left, right);
	}
	
	public IScalarExpression1<TInput, Long> multiplyLong(IScalarExpression1<TInput, ? extends Number> left, Number right) {
		return multiplyLong(left, constant(right));
	}
	
	public IScalarExpression1<TInput, Float> multiplyFloat(IScalarExpression1<TInput, ? extends Number> left, IScalarExpression1<TInput, ? extends Number> right) {
		return new ScalarExpression2<TInput, Float, Number, Number>(new MultiplyFloatExpression(), left, right);
	}
	
	public IScalarExpression1<TInput, Float> multiplyFloat(IScalarExpression1<TInput, ? extends Number> left, Number right) {
		return multiplyFloat(left, constant(right));
	}
	
	public IScalarExpression1<TInput, Double> multiplyDouble(IScalarExpression1<TInput, ? extends Number> left, IScalarExpression1<TInput, ? extends Number> right) {
		return new ScalarExpression2<TInput, Double, Number, Number>(new MultiplyDoubleExpression(), left, right);
	}
	
	public IScalarExpression1<TInput, Double> multiplyDouble(IScalarExpression1<TInput, ? extends Number> left, Number right) {
		return multiplyDouble(left, constant(right));
	}

	public IScalarExpression1<TInput, Integer> divideInteger(IScalarExpression1<TInput, ? extends Number> left, IScalarExpression1<TInput, ? extends Number> right) {
		return new ScalarExpression2<TInput, Integer, Number, Number>(new DivideIntegerExpression(), left, right);
	}
	
	public IScalarExpression1<TInput, Integer> divideInteger(IScalarExpression1<TInput, ? extends Number> left, Number right) {
		return divideInteger(left, constant(right));
	}
	
	public IScalarExpression1<TInput, Long> divideLong(IScalarExpression1<TInput, ? extends Number> left, IScalarExpression1<TInput, ? extends Number> right) {
		return new ScalarExpression2<TInput, Long, Number, Number>(new DivideLongExpression(), left, right);
	}
	
	public IScalarExpression1<TInput, Long> divideLong(IScalarExpression1<TInput, ? extends Number> left, Number right) {
		return divideLong(left, constant(right));
	}
	
	public IScalarExpression1<TInput, Float> divideFloat(IScalarExpression1<TInput, ? extends Number> left, IScalarExpression1<TInput, ? extends Number> right) {
		return new ScalarExpression2<TInput, Float, Number, Number>(new DivideFloatExpression(), left, right);
	}
	
	public IScalarExpression1<TInput, Float> divideFloat(IScalarExpression1<TInput, ? extends Number> left, Number right) {
		return divideFloat(left, constant(right));
	}
	
	public IScalarExpression1<TInput, Double> divideDouble(IScalarExpression1<TInput, ? extends Number> left, IScalarExpression1<TInput, ? extends Number> right) {
		return new ScalarExpression2<TInput, Double, Number, Number>(new DivideDoubleExpression(), left, right);
	}
	
	public IScalarExpression1<TInput, Double> divideDouble(IScalarExpression1<TInput, ? extends Number> left, Number right) {
		return divideDouble(left, constant(right));
	}

	public IScalarExpression1<TInput, Integer> modInteger(IScalarExpression1<TInput, ? extends Number> left, IScalarExpression1<TInput, ? extends Number> right) {
		return new ScalarExpression2<TInput, Integer, Number, Number>(new ModIntegerExpression(), left, right);
	}
	
	public IScalarExpression1<TInput, Integer> modInteger(IScalarExpression1<TInput, ? extends Number> left, Number right) {
		return modInteger(left, constant(right));
	}
	
	public IScalarExpression1<TInput, Integer> modInteger(Number left, IScalarExpression1<TInput, ? extends Number> right) {
		return modInteger(constant(left), right);
	}
	
	public IScalarExpression1<TInput, Long> modLong(IScalarExpression1<TInput, ? extends Number> left, IScalarExpression1<TInput, ? extends Number> right) {
		return new ScalarExpression2<TInput, Long, Number, Number>(new ModLongExpression(), left, right);
	}
	
	public IScalarExpression1<TInput, Long> modLong(IScalarExpression1<TInput, ? extends Number> left, Number right) {
		return modLong(left, constant(right));
	}
	
	public IScalarExpression1<TInput, Long> modLong(Number left, IScalarExpression1<TInput, ? extends Number> right) {
		return modLong(constant(left), right);
	}
	
	/*
	 * Date Functions
	 */
	public IScalarExpression1<TInput, Date> now() {
		return new ScalarExpression0<TInput, Date>(new NowExpression());
	}
	
	public IScalarExpression1<TInput, Long> dateDiff(IScalarExpression1<TInput, Date> left, IScalarExpression1<TInput, Date> right) {
		return new ScalarExpression2<TInput, Long, Date, Date>(new DateDiffExpression(), left, right);
	}
	
	public IScalarExpression1<TInput, Long> dateDiff(IScalarExpression1<TInput, Date> left, Date right) {
		return this.dateDiff(left, constant(right));
	}
	
	public IScalarExpression1<TInput, Long> dateDiff(Date left, IScalarExpression1<TInput, Date> right) {
		return this.dateDiff(constant(left), right);
	}
	
	public IScalarExpression1<TInput, Date> truncateToSecond(IScalarExpression1<TInput, Date> expression) {
		return new ScalarExpression1<TInput, Date, Date>(new TruncateToSecondExpression(), expression);
	}
	
	public IScalarExpression1<TInput, Date> truncateToMinute(IScalarExpression1<TInput, Date> expression) {
		return new ScalarExpression1<TInput, Date, Date>(new TruncateToMinuteExpression(), expression);
	}
	
	public IScalarExpression1<TInput, Date> truncateToHour(IScalarExpression1<TInput, Date> expression) {
		return new ScalarExpression1<TInput, Date, Date>(new TruncateToHourExpression(), expression);
	}
	
	public IScalarExpression1<TInput, Date> truncateToDay(IScalarExpression1<TInput, Date> expression) {
		return new ScalarExpression1<TInput, Date, Date>(new TruncateToDayExpression(), expression);
	}
	
	public IScalarExpression1<TInput, Date> truncateToWeek(IScalarExpression1<TInput, Date> expression) {
		return new ScalarExpression1<TInput, Date, Date>(new TruncateToWeekExpression(), expression);
	}
	
	public IScalarExpression1<TInput, Date> truncateToMonth(IScalarExpression1<TInput, Date> expression) {
		return new ScalarExpression1<TInput, Date, Date>(new TruncateToMonthExpression(), expression);
	}
	
	public IScalarExpression1<TInput, Date> truncateToYear(IScalarExpression1<TInput, Date> expression) {
		return new ScalarExpression1<TInput, Date, Date>(new TruncateToYearExpression(), expression);
	}
	
	public IScalarExpression1<TInput, Integer> dayOfMonth(IScalarExpression1<TInput, Date> expression) {
		return new ScalarExpression1<TInput, Integer, Date>(new DayOfMonthExpression(), expression);
	}
	
	public IScalarExpression1<TInput, Integer> dayOfWeek(IScalarExpression1<TInput, Date> expression) {
		return new ScalarExpression1<TInput, Integer, Date>(new DayOfWeekExpression(), expression);
	}
	
	public IScalarExpression1<TInput, Integer> second(IScalarExpression1<TInput, Date> expression) {
		return new ScalarExpression1<TInput, Integer, Date>(new SecondExpression(), expression);
	}
	
	public IScalarExpression1<TInput, Integer> minute(IScalarExpression1<TInput, Date> expression) {
		return new ScalarExpression1<TInput, Integer, Date>(new MinuteExpression(), expression);
	}
	
	public IScalarExpression1<TInput, Integer> hour(IScalarExpression1<TInput, Date> expression) {
		return new ScalarExpression1<TInput, Integer, Date>(new HourExpression(), expression);
	}
	
	public IScalarExpression1<TInput, Integer> month(IScalarExpression1<TInput, Date> expression) {
		return new ScalarExpression1<TInput, Integer, Date>(new MonthExpression(), expression);
	}
	
	public IScalarExpression1<TInput, Integer> year(IScalarExpression1<TInput, Date> expression) {
		return new ScalarExpression1<TInput, Integer, Date>(new YearExpression(), expression);
	}
	
	/*
	 * String operations
	 */
	public IScalarExpression1<TInput, Boolean> regexMatch(IScalarExpression1<TInput, String> text, IScalarExpression1<TInput, String> pattern) {
		return new ScalarExpression2<TInput, Boolean, String, String>(new RegexMatchExpression(), text, pattern);
	}
	
	public IScalarExpression1<TInput, Boolean> regexMatch(IScalarExpression1<TInput, String> text, String pattern) {
		return new ScalarExpression1<TInput, Boolean, String>(new RegexMatchConstExpression(pattern), text);
	}
	
	public IScalarExpression1<TInput, Boolean> strContains(IScalarExpression1<TInput, String> text, IScalarExpression1<TInput, String> searchString) {
		return new ScalarExpression2<TInput, Boolean, String, String>(new StrContainsExpression(), text, searchString);
	}
	
	public IScalarExpression1<TInput, Integer> strIndexOf(IScalarExpression1<TInput, String> text, IScalarExpression1<TInput, String> searchString) {
		return new ScalarExpression2<TInput, Integer, String, String>(new StrIndexOfExpression(), text, searchString);
	}
	
	public IScalarExpression1<TInput, String> strJoin(IScalarExpression1<TInput, List<String>> list, IScalarExpression1<TInput, String> delimeter) {
		return new ScalarExpression2<TInput, String, List<String>, String>(new StrJoinExpression(), list, delimeter);
	}

	public IScalarExpression1<TInput, Integer> strLength(IScalarExpression1<TInput, String> expression) {
		return new ScalarExpression1<TInput, Integer, String>(new StrLengthExpression(), expression);
	}
	
	public IScalarExpression1<TInput, List<String>> strSplit(IScalarExpression1<TInput, String> text, IScalarExpression1<TInput, String> delimeter) {
		return new ScalarExpression2<TInput, List<String>, String, String>(new StrSplitExpression(), text, delimeter);
	}
	
	public IScalarExpression1<TInput, String> subString(IScalarExpression1<TInput, String> text, IScalarExpression1<TInput, Integer> startIndex, IScalarExpression1<TInput, Integer> endIndex) {
		return new ScalarExpression3<TInput, String, String, Integer, Integer>(new SubStringExpression(), text, startIndex, endIndex);
	}
	
	public IScalarExpression1<TInput, Integer> parseInteger(IScalarExpression1<TInput, String> expression) {
		return new ScalarExpression1<TInput, Integer, String>(new ParseIntegerExpression(), expression);
	}
	
	public IScalarExpression1<TInput, Long> parseLong(IScalarExpression1<TInput, String> expression) {
		return new ScalarExpression1<TInput, Long, String>(new ParseLongExpression(), expression);
	}
	
	public IScalarExpression1<TInput, Float> parseFloat(IScalarExpression1<TInput, String> expression) {
		return new ScalarExpression1<TInput, Float, String>(new ParseFloatExpression(), expression);
	}
	
	public IScalarExpression1<TInput, Double> parseDouble(IScalarExpression1<TInput, String> expression) {
		return new ScalarExpression1<TInput, Double, String>(new ParseDoubleExpression(), expression);
	}
	
	public IScalarExpression1<TInput, Date> parseDate(IScalarExpression1<TInput, String> expression, IScalarExpression1<TInput, String> format) {
		return new ScalarExpression2<TInput, Date, String, String>(new ParseDateExpression(), expression, format);
	}

	public IScalarExpression1<TInput, Date> parseDate(IScalarExpression1<TInput, String> expression, String format) {
		return new ScalarExpression1<TInput, Date, String>(new ParseDateConstExpression(format), expression);
	}

	public IScalarExpression1<TInput, String> strConcat(IScalarExpression1<TInput, String> left, IScalarExpression1<TInput, String> right) {
		return new ScalarExpression2<TInput, String, String, String>(new StrConcatExpression(), left, right);
	}

	public IScalarExpression1<TInput, String> strConcat(IScalarExpression1<TInput, String> left, String right) {
		return strConcat(left, constant(right));
	}

	public IScalarExpression1<TInput, String> strConcat(String left, IScalarExpression1<TInput, String> right) {
		return strConcat(constant(left), right);
	}

	/*
	 * Aggregate Functions
	 */
	
	public <TType> IAggregateExpression<TInput, TType> first(IScalarExpression1<TInput, ? extends TType> expression) {
		return new ScalarToAggregateExpression<TInput, TType, TType>(expression, new FirstExpression<TType>());
	}
	
	public <TType extends Comparable<TType>> IAggregateExpression<TInput, TType> min(IScalarExpression1<TInput, ? extends TType> expression) {
		return new ScalarToAggregateExpression<TInput, TType, TType>(expression, new MinExpression<TType>());
	}
	
	public <TType extends Comparable<TType>> IAggregateExpression<TInput, TType> max(IScalarExpression1<TInput, ? extends TType> expression) {
		return new ScalarToAggregateExpression<TInput, TType, TType>(expression, new MaxExpression<TType>());
	}
	
	public IAggregateExpression<TInput, Integer> countInteger(IScalarExpression1<TInput, ?> expression) {
		return new ScalarToAggregateExpression<TInput, Object, Integer>(expression, new CountIntegerExpression()); 
	}
	
	public IAggregateExpression<TInput, Integer> countInteger() {
		return this.countInteger(this.input());
	}
	
	public IAggregateExpression<TInput, Long> countLong(IScalarExpression1<TInput, ?> expression) {
		return new ScalarToAggregateExpression<TInput, Object, Long>(expression, new CountLongExpression()); 
	}
	
	public IAggregateExpression<TInput, Long> countLong() {
		return this.countLong(this.input());
	}
	
	public IAggregateExpression<TInput, Integer> sumInteger(IScalarExpression1<TInput, ? extends Number> expression) {
		return new ScalarToAggregateExpression<TInput, Number, Integer>(expression, new SumIntegerExpression());
	}
	
	public IAggregateExpression<TInput, Long> sumLong(IScalarExpression1<TInput, ? extends Number> expression) {
		return new ScalarToAggregateExpression<TInput, Number, Long>(expression, new SumLongExpression());
	}
	
	public IAggregateExpression<TInput, Float> sumFloat(IScalarExpression1<TInput, ? extends Number> expression) {
		return new ScalarToAggregateExpression<TInput, Number, Float>(expression, new SumFloatExpression());
	}
	
	public IAggregateExpression<TInput, Double> sumDouble(IScalarExpression1<TInput, ? extends Number> expression) {
		return new ScalarToAggregateExpression<TInput, Number, Double>(expression, new SumDoubleExpression());
	}
	
	public IAggregateExpression<TInput, Integer> avgInteger(IScalarExpression1<TInput, ? extends Number> expression) {
		return new ScalarToAggregateExpression<TInput, Number, Integer>(expression, new AvgIntegerExpression());
	}
	
	public IAggregateExpression<TInput, Long> avgLong(IScalarExpression1<TInput, ? extends Number> expression) {
		return new ScalarToAggregateExpression<TInput, Number, Long>(expression, new AvgLongExpression());
	}
	
	public IAggregateExpression<TInput, Float> avgFloat(IScalarExpression1<TInput, ? extends Number> expression) {
		return new ScalarToAggregateExpression<TInput, Number, Float>(expression, new AvgFloatExpression());
	}
	
	public IAggregateExpression<TInput, Double> avgDouble(IScalarExpression1<TInput, ? extends Number> expression) {
		return new ScalarToAggregateExpression<TInput, Number, Double>(expression, new AvgDoubleExpression());
	}
	
	public <TKey, TValue> IAggregateExpression<TInput, Map<TKey, TValue>> groupToMap(IScalarExpression1<TInput, ? extends TKey> keyExpression, IAggregateExpression<TInput, ? extends TValue> valueExpression) {
		return new GroupToMapExpression<TInput, TKey, TValue>(keyExpression, valueExpression);
	}
	
	public <TKey, TValue> IAggregateExpression<TInput, List<TValue>> groupToList(IScalarExpression1<TInput, ? extends TKey> keyExpression, IAggregateExpression<TInput, ? extends TValue> valueExpression) {
		return new GroupToValuesExpression<TInput, TKey, TValue>(keyExpression, valueExpression);
	}
	
	public IAggregateExpression<TInput, Double> stdDevDouble(IScalarExpression1<TInput, ? extends Number> expression) {
		return new ScalarToAggregateExpression<TInput, Number, Double>(expression, new StdDevDoubleExpression());
	}
	
	public <TType extends Comparable<TType>> IAggregateExpression<TInput, Integer> countDistinct(IScalarExpression1<TInput, ? extends TType> expression) {
		return new ScalarToAggregateExpression<TInput, TType, Integer>(expression, new CountDistinctExpression<TType>());
	}
	
	public <TType extends Comparable<TType>> IAggregateExpression<TInput, List<TType>> distinct(IScalarExpression1<TInput, ? extends TType> expression) {
		return new ScalarToAggregateExpression<TInput, TType, List<TType>>(expression, new SelectDistinctExpression<TType>());
	}
	
	@SuppressWarnings("unchecked")
	public IAggregateExpression<TInput, List<Object>> list(IAggregateExpression<TInput, ?>... expressions) {
		ArrayList<IAggregateExpression<TInput, ?>> list = new ArrayList<IAggregateExpression<TInput,?>>();
		for(IAggregateExpression<TInput, ?> expr: expressions) {
			list.add(expr);
		}
		return new AggregateListExpression<TInput>(list);
	}
	
	public FilterPipe<TInput> filter(IScalarExpression1<TInput, Boolean> filter) {
		return new FilterPipe<TInput>(filter);
	}
	
	public <TOutput> ProjectionPipe<TInput, TOutput> projection(IScalarExpression1<TInput, TOutput> expression) {
		return new ProjectionPipe<TInput, TOutput>(expression);
	}
	
	public ConsoleLogPipe<TInput> consoleLog() {
		return new ConsoleLogPipe<TInput>();
	}
	
	public OneToManyPipe<TInput> oneToMany() {
		return new OneToManyPipe<TInput>();
	}
	
	public <TOutput> TimeIntervalAggregateStream<TInput, TOutput> aggregate(IAggregateExpression<TInput, TOutput> expression, int interval) {
		return new TimeIntervalAggregateStream<TInput, TOutput>(expression, interval);
	}

}

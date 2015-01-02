package org.bosphorus.api.fluent.stream;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bosphorus.api.builder.expression.aggregate.IAggregateExpression;
import org.bosphorus.api.builder.expression.aggregate.common.AggregateListExpression;
import org.bosphorus.api.builder.expression.aggregate.common.CountDistinctExpression;
import org.bosphorus.api.builder.expression.aggregate.common.CountIntegerExpression;
import org.bosphorus.api.builder.expression.aggregate.common.CountLongExpression;
import org.bosphorus.api.builder.expression.aggregate.common.GroupAggregationExpression;
import org.bosphorus.api.builder.expression.aggregate.common.MaxExpression;
import org.bosphorus.api.builder.expression.aggregate.common.MinExpression;
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
import org.bosphorus.api.builder.expression.aggregate.scalar.ScalarToAggregateExpression;
import org.bosphorus.api.builder.expression.scalar.IScalarExpression;
import org.bosphorus.api.builder.expression.scalar.common.ConstantExpression;
import org.bosphorus.api.builder.expression.scalar.common.InputExpression;
import org.bosphorus.api.builder.expression.scalar.list.ExpressionList;
import org.bosphorus.api.builder.expression.scalar.logical.AndExpression;
import org.bosphorus.api.builder.expression.scalar.logical.EqualsExpression;
import org.bosphorus.api.builder.expression.scalar.logical.OrExpression;
import org.bosphorus.api.fluent.expression.scalar.list.ObjectListExpression;
import org.bosphorus.api.fluent.expression.scalar.primitive.BooleanExpression;
import org.bosphorus.api.fluent.expression.scalar.primitive.DateExpression;
import org.bosphorus.api.fluent.expression.scalar.primitive.DoubleExpression;
import org.bosphorus.api.fluent.expression.scalar.primitive.FloatExpression;
import org.bosphorus.api.fluent.expression.scalar.primitive.IntegerExpression;
import org.bosphorus.api.fluent.expression.scalar.primitive.LongExpression;
import org.bosphorus.api.fluent.expression.scalar.primitive.ObjectExpression;
import org.bosphorus.api.fluent.expression.scalar.primitive.StringExpression;

public class Stream<TInput> {

	public ObjectExpression<TInput> objectExpression(IScalarExpression<TInput, Object> expression) {
		return new ObjectExpression<TInput>(expression);
	}
	
	public IntegerExpression<TInput> integerExpression(IScalarExpression<TInput, Integer> expression) {
		return new IntegerExpression<TInput>(expression);
	}
	
	public LongExpression<TInput> longExpression(IScalarExpression<TInput, Long> expression) {
		return new LongExpression<TInput>(expression);
	}
	
	public FloatExpression<TInput> floatExpression(IScalarExpression<TInput, Float> expression) {
		return new FloatExpression<TInput>(expression);
	}
	
	public DoubleExpression<TInput> doubleExpression(IScalarExpression<TInput, Double> expression) {
		return new DoubleExpression<TInput>(expression);
	}
	
	public BooleanExpression<TInput> booleanExpression(IScalarExpression<TInput, Boolean> expression) {
		return new BooleanExpression<TInput>(expression);
	}
	
	public StringExpression<TInput> stringExpression(IScalarExpression<TInput, String> expression) {
		return new StringExpression<TInput>(expression);
	}
	
	public DateExpression<TInput> dateExpression(IScalarExpression<TInput, Date> expression) {
		return new DateExpression<TInput>(expression);
	}

	public <TType> ConstantExpression<TInput, TType> constant(TType value) {
		return new ConstantExpression<TInput, TType>(value);
	}
	
	public ObjectExpression<TInput> constObject(Object value) {
		return objectExpression(constant(value));
	}
	
	public IntegerExpression<TInput> constInteger(Integer value) {
		return integerExpression(constant(value));
	}
	
	public LongExpression<TInput> constLong(Long value) {
		return longExpression(constant(value));
	}
	
	public FloatExpression<TInput> constFloat(Float value) {
		return floatExpression(constant(value));
	}
	
	public DoubleExpression<TInput> constDouble(Double value) {
		return doubleExpression(constant(value));
	}
	
	public BooleanExpression<TInput> constBoolean(Boolean value) {
		return booleanExpression(constant(value));
	}
	
	public StringExpression<TInput> constString(String value) {
		return stringExpression(constant(value));
	}
	
	public DateExpression<TInput> constDate(Date value) {
		return dateExpression(constant(value));
	}
	
	public BooleanExpression<TInput> and(IScalarExpression<TInput, Boolean> left, IScalarExpression<TInput, Boolean> right) {
		return new BooleanExpression<TInput>(new AndExpression<TInput>(left, right));
	}
	
	public BooleanExpression<TInput> or(IScalarExpression<TInput, Boolean> left, IScalarExpression<TInput, Boolean> right) {
		return new BooleanExpression<TInput>(new OrExpression<TInput>(left, right));
	}
	
	@SuppressWarnings("unchecked")
	public <TType> ObjectListExpression<TInput> list(IScalarExpression<TInput, ? extends TType>... expressions) {
		ArrayList<IScalarExpression<TInput, ? extends TType>> list = new ArrayList<IScalarExpression<TInput,? extends TType>>();
		for(IScalarExpression<TInput, ? extends TType> expression: expressions) {
			list.add(expression);
		}
		return new ObjectListExpression<TInput>(new ExpressionList<TInput, TType>(list));
		
	}
	
	public ScalarToAggregateExpression<TInput, Object, Integer> countInteger(IScalarExpression<TInput, ?> expression) {
		return new ScalarToAggregateExpression<TInput, Object, Integer>(expression, new CountIntegerExpression());
	}
	
	public ScalarToAggregateExpression<TInput, Object, Long> countLong(IScalarExpression<TInput, ?> expression) {
		return new ScalarToAggregateExpression<TInput, Object, Long>(expression, new CountLongExpression());
	}
	
	public ScalarToAggregateExpression<TInput, Object, Integer> countInteger() {
		return new ScalarToAggregateExpression<TInput, Object, Integer>(new InputExpression<TInput>(), new CountIntegerExpression());
	}
	
	public ScalarToAggregateExpression<TInput, Object, Long> countLong() {
		return new ScalarToAggregateExpression<TInput, Object, Long>(new InputExpression<TInput>(), new CountLongExpression());
	}
	
	
	public ScalarToAggregateExpression<TInput, Number, Integer> sumInteger(IScalarExpression<TInput, ? extends Number> expression) {
		return new ScalarToAggregateExpression<TInput, Number, Integer>(expression, new SumIntegerExpression());
	}
	
	public ScalarToAggregateExpression<TInput, Number, Long> sumLong(IScalarExpression<TInput, ? extends Number> expression) {
		return new ScalarToAggregateExpression<TInput, Number, Long>(expression, new SumLongExpression());
	}
	
	public ScalarToAggregateExpression<TInput, Number, Float> sumFloat(IScalarExpression<TInput, ? extends Number> expression) {
		return new ScalarToAggregateExpression<TInput, Number, Float>(expression, new SumFloatExpression());
	}
	
	public ScalarToAggregateExpression<TInput, Number, Double> sumDouble(IScalarExpression<TInput, ? extends Number> expression) {
		return new ScalarToAggregateExpression<TInput, Number, Double>(expression, new SumDoubleExpression());
	}
	
	public ScalarToAggregateExpression<TInput, Number, Integer> avgInteger(IScalarExpression<TInput, ? extends Number> expression) {
		return new ScalarToAggregateExpression<TInput, Number, Integer>(expression, new AvgIntegerExpression());
	}
	
	public ScalarToAggregateExpression<TInput, Number, Long> avgLong(IScalarExpression<TInput, ? extends Number> expression) {
		return new ScalarToAggregateExpression<TInput, Number, Long>(expression, new AvgLongExpression());
	}
	
	public ScalarToAggregateExpression<TInput, Number, Float> avgFloat(IScalarExpression<TInput, ? extends Number> expression) {
		return new ScalarToAggregateExpression<TInput, Number, Float>(expression, new AvgFloatExpression());
	}
	
	public ScalarToAggregateExpression<TInput, Number, Double> avgDouble(IScalarExpression<TInput, ? extends Number> expression) {
		return new ScalarToAggregateExpression<TInput, Number, Double>(expression, new AvgDoubleExpression());
	}
	
	public ScalarToAggregateExpression<TInput, Number, Double> stdDevDouble(IScalarExpression<TInput, ? extends Number> expression) {
		return new ScalarToAggregateExpression<TInput, Number, Double>(expression, new StdDevDoubleExpression());
	}
	
	public <TType extends Comparable<TType>> ScalarToAggregateExpression<TInput, TType, List<TType>> distinct(IScalarExpression<TInput, TType> expression) {
		return new ScalarToAggregateExpression<TInput, TType, List<TType>>(expression, new SelectDistinctExpression<TType>());
	}
	
	public <TType extends Comparable<TType>> ScalarToAggregateExpression<TInput, TType, Integer> countDistinct(IScalarExpression<TInput, TType> expression) {
		return new ScalarToAggregateExpression<TInput, TType, Integer>(expression, new CountDistinctExpression<TType>());
	}
	
	public <TType extends Comparable<TType>> ScalarToAggregateExpression<TInput, TType, TType> min(IScalarExpression<TInput, TType> expression) {
		return new ScalarToAggregateExpression<TInput, TType, TType>(expression, new MinExpression<TType>());
	}
	
	public <TType extends Comparable<TType>> ScalarToAggregateExpression<TInput, TType, TType> max(IScalarExpression<TInput, TType> expression) {
		return new ScalarToAggregateExpression<TInput, TType, TType>(expression, new MaxExpression<TType>());
	}

	public AggregateListExpression<TInput> list(IAggregateExpression<TInput, ?>... expressions) {
		ArrayList<IAggregateExpression<TInput, ?>> list = new ArrayList<IAggregateExpression<TInput,?>>();
		for(IAggregateExpression<TInput, ?> expression: expressions) {
			list.add(expression);
		}
		return new AggregateListExpression<TInput>(list);
		
	}
	
	public <TKey, TValue> GroupAggregationExpression<TInput, TKey, TValue> group(
			IScalarExpression<? super TInput, ? extends TKey> keyExpression, 
			IAggregateExpression<? super TInput, ? extends TValue> valueExpression) {
		return new GroupAggregationExpression<TInput, TKey, TValue>(keyExpression, valueExpression);
	}
	
	
}

package org.bosphorus.api.stream;

import java.util.Date;
import java.util.List;

import org.bosphorus.api.expression.scalar.list.ListElementExpression;
import org.bosphorus.api.expression.scalar.type.list.BooleanListExpression;
import org.bosphorus.api.expression.scalar.type.list.DateListExpression;
import org.bosphorus.api.expression.scalar.type.list.DoubleListExpression;
import org.bosphorus.api.expression.scalar.type.list.FloatListExpression;
import org.bosphorus.api.expression.scalar.type.list.IntegerListExpression;
import org.bosphorus.api.expression.scalar.type.list.LongListExpression;
import org.bosphorus.api.expression.scalar.type.list.StringListExpression;
import org.bosphorus.api.expression.scalar.type.primitive.BooleanExpression;
import org.bosphorus.api.expression.scalar.type.primitive.DateExpression;
import org.bosphorus.api.expression.scalar.type.primitive.DoubleExpression;
import org.bosphorus.api.expression.scalar.type.primitive.FloatExpression;
import org.bosphorus.api.expression.scalar.type.primitive.IntegerExpression;
import org.bosphorus.api.expression.scalar.type.primitive.LongExpression;
import org.bosphorus.api.expression.scalar.type.primitive.StringExpression;

public class ListStream<TType> implements ISourceStream<List<TType>> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<SourceField> fields;

	public List<SourceField> getFields() {
		return fields;
	}

	public void setFields(List<SourceField> fields) {
		this.fields = fields;
	}
	
	private Integer getFieldIndex(String name, String type) throws Exception {
		for(Integer i=0; i < this.getFields().size(); i++) {
			SourceField field = this.getFields().get(i);
			if(field.getName().equals(name)) {
				if(!field.getType().equals(type)) {
					throw new Exception("Invalid field type");
				}
				return i;
			}
		}
		throw new Exception("Field " + name + " does not exists");
	}

	@Override
	public IntegerExpression<List<TType>> integerField(String name)
			throws Exception {
		return new IntegerExpression<List<TType>>(new ListElementExpression<List<TType>, Integer>(this.getFieldIndex(name, "Integer")));
	}

	@Override
	public LongExpression<List<TType>> longField(String name) throws Exception {
		return new LongExpression<List<TType>>(new ListElementExpression<List<TType>, Long>(this.getFieldIndex(name, "Long")));
	}

	@Override
	public FloatExpression<List<TType>> floatField(String name)
			throws Exception {
		return new FloatExpression<List<TType>>(new ListElementExpression<List<TType>, Float>(this.getFieldIndex(name, "Float")));
	}

	@Override
	public DoubleExpression<List<TType>> doubleField(String name)
			throws Exception {
		return new DoubleExpression<List<TType>>(new ListElementExpression<List<TType>, Double>(this.getFieldIndex(name, "Double")));
	}

	@Override
	public BooleanExpression<List<TType>> booleanField(String name)
			throws Exception {
		return new BooleanExpression<List<TType>>(new ListElementExpression<List<TType>, Boolean>(this.getFieldIndex(name, "Boolean")));
	}

	@Override
	public StringExpression<List<TType>> stringField(String name)
			throws Exception {
		return new StringExpression<List<TType>>(new ListElementExpression<List<TType>, String>(this.getFieldIndex(name, "String")));
	}

	@Override
	public DateExpression<List<TType>> dateField(String name) throws Exception {
		return new DateExpression<List<TType>>(new ListElementExpression<List<TType>, Date>(this.getFieldIndex(name, "Date")));
	}

	@Override
	public IntegerListExpression<List<TType>> integerList(String name)
			throws Exception {
		return new IntegerListExpression<List<TType>>(new ListElementExpression<List<TType>, List<Integer>>(this.getFieldIndex(name, "IntegerList")));
	}

	@Override
	public LongListExpression<List<TType>> longList(String name)
			throws Exception {
		return new LongListExpression<List<TType>>(new ListElementExpression<List<TType>, List<Long>>(this.getFieldIndex(name, "LongList")));
	}

	@Override
	public FloatListExpression<List<TType>> floatList(String name)
			throws Exception {
		return new FloatListExpression<List<TType>>(new ListElementExpression<List<TType>, List<Float>>(this.getFieldIndex(name, "FloatList")));
	}

	@Override
	public DoubleListExpression<List<TType>> doubleList(String name)
			throws Exception {
		return new DoubleListExpression<List<TType>>(new ListElementExpression<List<TType>, List<Double>>(this.getFieldIndex(name, "DoubleList")));
	}

	@Override
	public BooleanListExpression<List<TType>> booleanList(String name)
			throws Exception {
		return new BooleanListExpression<List<TType>>(new ListElementExpression<List<TType>, List<Boolean>>(this.getFieldIndex(name, "BooleanList")));
	}

	@Override
	public StringListExpression<List<TType>> stringList(String name)
			throws Exception {
		return new StringListExpression<List<TType>>(new ListElementExpression<List<TType>, List<String>>(this.getFieldIndex(name, "StringList")));
	}

	@Override
	public DateListExpression<List<TType>> dateList(String name)
			throws Exception {
		return new DateListExpression<List<TType>>(new ListElementExpression<List<TType>, List<Date>>(this.getFieldIndex(name, "DateList")));
	}

}

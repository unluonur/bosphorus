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

import org.bosphorus.api.builder.expression.scalar.IScalarExpression1;
import org.bosphorus.api.builder.expression.scalar.common.InputExpression;
import org.bosphorus.api.builder.expression.scalar.event.ScalarExpression1;
import org.bosphorus.api.builder.expression.scalar.list.ConstListElementExpression;

public class ListStreamBuilder extends StreamBuilder<List<Object>> {
	private List<String> fieldNames;
	
	public ListStreamBuilder() {
		this.fieldNames = new ArrayList<String>();
	}
	
	public ListStreamBuilder(List<String> fieldNames) {
		this.fieldNames = fieldNames;
	}
	
	public ListStreamBuilder(String... fieldNames) {
		this.fieldNames = new ArrayList<String>();
		for(String field: fieldNames) {
			this.fieldNames.add(field);
		}
	}
	
	public IScalarExpression1<List<Object>, Object> field(Integer fieldIndex) {
		return new ScalarExpression1<List<Object>, Object, List<Object>>(new ConstListElementExpression<Object>(fieldIndex), new InputExpression<List<Object>>());
	}

	public IScalarExpression1<List<Object>, Object> field(String fieldName) {
		return field(this.fieldNames.indexOf(fieldName));
	}
	
	public IScalarExpression1<List<Object>, Integer> integerField(String fieldName) {
		return convertToInteger(field(fieldName));
	}
	
	public IScalarExpression1<List<Object>, Long> longField(String fieldName) {
		return convertToLong(field(fieldName));
	}
	
	public IScalarExpression1<List<Object>, Float> floatField(String fieldName) {
		return convertToFloat(field(fieldName));
	}
	
	public IScalarExpression1<List<Object>, Double> doubleField(String fieldName) {
		return convertToDouble(field(fieldName));
	}
	
	public IScalarExpression1<List<Object>, String> stringField(String fieldName) {
		return convertToString(field(fieldName));
	}
	
	public IScalarExpression1<List<Object>, Date> dateField(String fieldName) {
		return convertToDate(field(fieldName));
	}
}

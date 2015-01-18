package org.bosphorus.api.builder.expression.aggregate.common;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.api.builder.expression.aggregate.IAggregateExpression;
import org.bosphorus.core.expression.aggregate.factory.IAggregateExecutorFactory;
import org.bosphorus.core.expression.aggregate.factory.event.AggregationListFactory;

public class AggregateListExpression<TInput> implements IAggregateExpression<TInput, List<Object>> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<? extends IAggregateExpression<? super TInput, ?>> list;
	
	public AggregateListExpression(List<? extends IAggregateExpression<? super TInput, ?>> list) {
		this.setList(list);
	}
	
	@Override
	public IAggregateExecutorFactory<TInput, List<Object>> build() {
		ArrayList<IAggregateExecutorFactory<? super TInput, ?>> expressions = new ArrayList<IAggregateExecutorFactory<? super TInput,?>>();
		for(IAggregateExpression<? super TInput, ?> expression: this.getList()) {
			expressions.add(expression.build());
		}
		return new AggregationListFactory<TInput, Object>(expressions);
	}
	
	public List<? extends IAggregateExpression<? super TInput, ?>> getList() {
		return list;
	}
	
	public void setList(List<? extends IAggregateExpression<? super TInput, ?>> list) {
		this.list = list;
	}

}

package org.bosphorus.core.aggregation;

import org.bosphorus.core.aggregation.bag.IAggregationBag;
import org.bosphorus.core.aggregation.bag.SumBagInteger;

public class Count<TInput> implements IAggregation<TInput, Integer, Integer> {

	@Override
	public IAggregationBag<Integer, Integer> newBag() {
		return new SumBagInteger();
	}

	@Override
	public void execute(TInput input, IAggregationBag<Integer, Integer> bag)
			throws Exception {
		bag.execute(1);
	}
	
}

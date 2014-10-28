package org.bosphorus.aggregation;

import org.bosphorus.aggregation.bag.IAggregationBag;
import org.bosphorus.aggregation.bag.SumBagInteger;
import org.bosphorus.stream.ITuple;

public class Count implements IAggregation<Integer, Integer> {

	@Override
	public IAggregationBag<Integer, Integer> newBag() {
		return new SumBagInteger();
	}

	@Override
	public void execute(ITuple input, IAggregationBag<Integer, Integer> bag)
			throws Exception {
		bag.execute(1);
	}
	
}

package org.bosphorus.stream.batch.join;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.expression.IExpression;
import org.bosphorus.stream.batch.IReader;

public class InnerJoin<TInput> extends BaseJoin<TInput> {

	public InnerJoin(IReader<List<TInput>> left,
			IReader<TInput> right,
			IExpression<List<TInput>, Boolean> expression) {
		super(left, right, expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<List<TInput>> read() throws Exception {
		List<List<TInput>> left = this.getLeft().read();
		List<TInput> right = this.getRight().read();
		ArrayList<List<TInput>> result = new ArrayList<List<TInput>>();
		for(List<TInput> leftRow: left) {
			for(TInput rightRow: right) {
				ArrayList<TInput> row = new ArrayList<TInput>(leftRow);
				row.add(rightRow);
				if(this.getExpression().execute(row)) {
					result.add(row);
				}
			}
		}
		return result;
	}

}

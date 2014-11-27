package org.bosphorus.stream.batch.join;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;
import org.bosphorus.stream.batch.IReader;

public class RightJoin<TInput> extends BaseJoin<TInput> {

	public RightJoin(IReader<List<List<TInput>>> left,
			IReader<List<TInput>> right,
			IScalarExecutor<List<TInput>, Boolean> expression) {
		super(left, right, expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<List<TInput>> read() throws Exception {
		List<List<TInput>> left = this.getLeft().read();
		List<TInput> right = this.getRight().read();
		ArrayList<List<TInput>> result = new ArrayList<List<TInput>>();
		for(TInput rightRow: right) {
			Boolean found = false;
			for(List<TInput> leftRow: left) {
				ArrayList<TInput> row = new ArrayList<TInput>(leftRow);
				row.add(rightRow);
				if(this.getExpression().execute(row)) {
					result.add(row);
					found = true;
				}
			}
			if(!found) {
				ArrayList<TInput> row = new ArrayList<TInput>();
				for(List<TInput> leftRow: left) {
					leftRow.add(null);
				}
				row.add(rightRow);
				result.add(row);
			}
		}
		return result;
	}

}

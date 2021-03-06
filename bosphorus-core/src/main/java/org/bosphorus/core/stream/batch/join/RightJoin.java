/**
 * Copyright (c) Onur �nl�
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

package org.bosphorus.core.stream.batch.join;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.core.expression.scalar.executor.IScalarExecutor1;
import org.bosphorus.core.stream.IReader;

public class RightJoin<TInput> extends BaseJoin<TInput> {

	public RightJoin(IReader<List<List<TInput>>> left,
			IReader<List<TInput>> right,
			IScalarExecutor1<List<TInput>, Boolean> expression) {
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

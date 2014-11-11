package org.bosphorus.builder.old;

import java.util.List;

public class TupleEndpoint implements IEndPoint {

	public List<StreamField> getFields() {
		return null;
	}
	
	@Override
	public Boolean isMatch(IEndPoint endpoint) {
		if(!(endpoint instanceof TupleEndpoint)) {
			return false;
		}
		TupleEndpoint tupleEndpoint = (TupleEndpoint)endpoint;

		if(this.getFields().size() != tupleEndpoint.getFields().size()) {
			return false;
		}
		for(Integer i=0; i<this.getFields().size(); i++) {
			if(this.getFields().get(i).getType().getName() != tupleEndpoint.getFields().get(i).getType().getName()) {
				return false;
			}
		}
		return true;
	}

}

package org.bosphorus.api.builder.stream;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.api.builder.node.INodeContext;
import org.bosphorus.stream.IPipeExecutor;
import org.bosphorus.stream.pipe.OneToManyExecutor;

public class StreamOutput<TType> implements IStreamOutput<TType> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<IStreamInput<TType>> destinations;
	
	public StreamOutput() {
		this.destinations = new ArrayList<IStreamInput<TType>>();
	}

	@Override
	public List<IStreamInput<TType>> getDestinations() {
		return destinations;
	}

	@Override
	public void setDestinations(List<IStreamInput<TType>> destinations) {
		this.destinations = destinations;
	}

	@Override
	public IPipeExecutor<TType> build(INodeContext context) throws Exception {
		if(this.getDestinations().size() == 1) {
			return this.getDestinations().get(0).build(context);
		}
		else if(this.getDestinations().size() > 1) {
			ArrayList<IPipeExecutor<TType>> outputStreams = new ArrayList<IPipeExecutor<TType>>();
			for(IStreamInput<TType> pipe: this.getDestinations()) {
				outputStreams.add(pipe.build(context));
			}
			return new OneToManyExecutor<TType>(outputStreams);
		}
		else {
			return new IPipeExecutor<TType>() {

				@Override
				public void writeOne(TType input) throws Exception {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void writeMulti(List<? extends TType> input)
						throws Exception {
					// TODO Auto-generated method stub
					
				}
			};
		}
	}
}

package org.bosphorus.api.builder.stream;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.core.stream.IPipeExecutor;
import org.bosphorus.core.stream.pipe.OneToManyExecutor;

public class Stream<TType> implements IStream<TType> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<IStreamInput<TType>> destinations;
	
	public Stream() {
		this.destinations = new ArrayList<IStreamInput<TType>>();
	}

	public List<IStreamInput<TType>> getDestinations() {
		return destinations;
	}

	public void setDestinations(List<IStreamInput<TType>> destinations) {
		this.destinations = destinations;
	}

	@Override
	public void add(IStreamInput<TType> pipe) {
		this.getDestinations().add(pipe);
	}

	@Override
	public IPipeExecutor<TType> build() throws Exception {
		if(this.getDestinations().size() == 1) {
			return this.getDestinations().get(0).build();
		}
		else if(this.getDestinations().size() > 1) {
			ArrayList<IPipeExecutor<TType>> outputStreams = new ArrayList<IPipeExecutor<TType>>();
			for(IStreamInput<TType> pipe: this.getDestinations()) {
				outputStreams.add(pipe.build());
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

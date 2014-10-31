package org.bosphorus.stream.connector;

import java.util.Timer;

import org.bosphorus.stream.IStreamReader;
import org.bosphorus.stream.IStreamWriter;

public class StreamCoordinator<TInput> {
	private IStreamReader<TInput> reader;
	private IStreamWriter<TInput> writer;
	Timer timer;
	
	public StreamCoordinator(Integer interval) {
		timer = new Timer();
	}
}

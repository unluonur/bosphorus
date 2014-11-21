package org.bosphorus.stream.connector;

import java.util.Timer;
import java.util.TimerTask;

import org.bosphorus.stream.batch.IReader;
import org.bosphorus.stream.pipe.IPipe;

public class StreamPusher<TInput> {
	private IReader<TInput> reader;
	private IPipe<TInput> writer;
	private Timer timer;
	
	public StreamPusher(Integer interval) {
		timer = new Timer();
		StreamPusher<TInput> pusher = this;
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				try {
					pusher.writer.writeMulti(pusher.reader.read());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}, interval);
	}
}

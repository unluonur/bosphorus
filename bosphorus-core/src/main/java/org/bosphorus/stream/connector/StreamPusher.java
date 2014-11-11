package org.bosphorus.stream.connector;

import java.util.Timer;
import java.util.TimerTask;

import org.bosphorus.stream.IStreamReader;
import org.bosphorus.stream.IStreamWriter;

public class StreamPusher<TInput> {
	private IStreamReader<TInput> reader;
	private IStreamWriter<TInput> writer;
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

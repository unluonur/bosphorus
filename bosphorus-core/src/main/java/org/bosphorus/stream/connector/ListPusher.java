package org.bosphorus.stream.connector;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import org.bosphorus.stream.batch.IReader;
import org.bosphorus.stream.pipe.IPipe;

public class ListPusher<TInput> {
	private IReader<List<TInput>> reader;
	private IPipe<TInput> writer;
	private Timer timer;
	
	public ListPusher(Integer interval) {
		timer = new Timer();
		ListPusher<TInput> pusher = this;
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

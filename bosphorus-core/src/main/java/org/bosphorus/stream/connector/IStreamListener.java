package org.bosphorus.stream.connector;

public interface IStreamListener {
	void tick();
	void tick(Integer count);
}

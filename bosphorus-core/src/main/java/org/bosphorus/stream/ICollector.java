package org.bosphorus.stream;

import java.util.List;

public interface ICollector {
	ITransaction beginTran();
	void commit(ITransaction tran);
	void send(List<Object> data);
}

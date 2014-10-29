package org.bosphorus.query.group;

import org.bosphorus.core.ITuple;

public interface IGroupBy {
	
	void init();
	void group(ITuple input);
	
}

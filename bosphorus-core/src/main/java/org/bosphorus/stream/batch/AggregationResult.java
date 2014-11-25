package org.bosphorus.stream.batch;

public class AggregationResult<TKey, TValue> {
	
	private TKey key;
	private TValue value;
	
	public AggregationResult(TKey key, TValue value) {
		setKey(key);
		setValue(value);
	}
	
	public TKey getKey() {
		return key;
	}
	
	public void setKey(TKey key) {
		this.key = key;
	}
	
	public TValue getValue() {
		return value;
	}
	
	public void setValue(TValue value) {
		this.value = value;
	}
	
}

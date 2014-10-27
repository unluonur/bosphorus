package org.bosphorus.stream;

import java.util.Date;

public interface ITuple {
	
	Object getObject(String fieldName);
	Object getObject(Integer fieldIndex);

	Long getLong(String fieldName);
	Long getLong(Integer fieldIndex);
	
	Float getFloat(String fieldName);
	Float getFloat(Integer fieldIndex);
	
	Double getDouble(String fieldName);
	Double getDouble(Integer fieldIndex);

	Integer getInteger(String fieldName);
	Integer getInteger(Integer fieldIndex);
	
	String getString(String fieldName);
	String getString(Integer fieldIndex);
	
	Boolean getBoolean(String fieldName);
	Boolean getBoolean(Integer fieldIndex);
	
	Date getDate(String fieldName);
	Date getDate(Integer fieldIndex);
	
}

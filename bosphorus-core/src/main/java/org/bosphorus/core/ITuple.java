/**
 * Copyright (c) Onur Ünlü
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * The latest version of this file can be found at https://github.com/unluonur/bosphorus
 */

package org.bosphorus.core;

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

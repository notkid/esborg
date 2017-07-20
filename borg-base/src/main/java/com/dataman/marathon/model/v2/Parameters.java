package com.dataman.marathon.model.v2;

public class Parameters {

	private String key;
	
	private String value;
	
	public Parameters(){
		
	}

	/**(这里用一句话描述这个构造函数的作用)
	 * @param key
	 * @param value
	 */
	public Parameters(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
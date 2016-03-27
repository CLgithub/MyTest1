package com.cl.mytest1;

public class Jang {
	private String type;
	private int value;
	private int status;

	public Jang(String type, int value, int status) {
		this.type = type;
		this.value = value;
		this.status = status;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Jang [type=" + type + ", value=" + value + ", status=" + status + "]";
	}

}

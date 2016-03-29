package com.cl.mytest1;

public class Jang {
	private String type;
	private int value;
	private int status;// init：未被摸，1、2、3、4：在谁手上

	public static final int INIT = 0;
	public static final int P1HAVE = 1;
	public static final int P2HAVE = 2;
	public static final int P3HAVE = 3;
	public static final int P4HAVE = 4;
	public static final int P1DIS = 5;
	public static final int P2DIS = 6;
	public static final int P3DIS = 7;
	public static final int P4DIS = 8;
	public static final int P1R = 9;
	public static final int P2R = 10;
	public static final int P3R = 11;
	public static final int P4R = 12;

	public Jang( int value, String type, int status) {
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
//		String str = "[" + value + type + " " + status + "]";
		String str = "[" + value + type + "]";
		return str;
		// return "Jang [type=" + type + ", value=" + value + ", status=" +
		// status + "]";
	}

}

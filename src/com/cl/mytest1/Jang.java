package com.cl.mytest1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Jang{
	private int number;
	private String type;
	private int value;
	private int status;// init：未被摸，1、2、3、4：在谁手上
	private int hu;

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

	public Jang( int value, String type, int status, int number, int hu) {
		this.type = type;
		this.value = value;
		this.status = status;
		this.number=number;
		this.hu=hu;
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
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getHu() {
		return hu;
	}

	public void setHu(int hu) {
		this.hu = hu;
	}

	@Override
	public String toString() {
//		String str = "[" + value + type + " " + status + "]";
		String str = "[" + value + type + "]";
		return str;
		// return "Jang [type=" + type + ", value=" + value + ", status=" +
		// status + "]";
	}

//	@Override
//	public String toString() {
//		String str="["+value+type+" "+status+"]";
//		return str;
//	}
//	
	
	@Override
	public boolean equals(Object obj) {
		Jang jang=(Jang) obj;
		if(this.type.equals(jang.type)&&this.value==jang.value){
			return true;
		}else {
			return false;
		}
	}
	
	
	
	

}

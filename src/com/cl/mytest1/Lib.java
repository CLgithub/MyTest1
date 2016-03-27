package com.cl.mytest1;

import java.util.Arrays;

public class Lib {

	static Jang[][] W = new Jang[9][4];
	static Jang[][] L = new Jang[9][4];
	static Jang[][] O = new Jang[9][4];

	private Lib() {
		for (int i = 0; i < W.length; i++) {
			for (int j = 0; j < W[i].length; j++) {
				W[i][j] = new Jang("W", i + 1, 0);
			}
		}
		for (int i = 0; i < L.length; i++) {
			for (int j = 0; j < L[i].length; j++) {
				L[i][j] = new Jang("L", i + 1, 0);
			}
		}
		for (int i = 0; i < O.length; i++) {
			for (int j = 0; j < O[i].length; j++) {
				O[i][j] = new Jang("O", i + 1, 0);
			}
		}
	}
	private static final Lib lib = new Lib();
	public static Lib getLib() {
		return lib;
	}

}

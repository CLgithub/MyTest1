package com.cl.mytest1;

import java.util.Arrays;

public class Play {
	private int place;
	private Jang[] myJangs;

	public int getPlace() {
		return place;
	}

	public void setPlace(int place) {
		this.place = place;
	}

	public Jang[] getMyJangs() {
		return myJangs;
	}

	public void setMyJangs(Jang[] myJangs) {
		this.myJangs = myJangs;
	}

	public Play(int place, Jang[] myJangs) {
		this.place = place;
		this.myJangs = myJangs;
	}

	@Override
	public String toString() {
		return "Play [place=" + place + ", myJangs=" + Arrays.toString(myJangs) + "]";
	}
	
	

}

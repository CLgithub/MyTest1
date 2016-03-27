package com.cl.mytest1;

import com.sun.javafx.collections.MappingChange.Map;

public class Play {
	private int place;
	private Map<Integer, Jang> myJangs;

	public int getPlace() {
		return place;
	}

	public void setPlace(int place) {
		this.place = place;
	}

	public Map<Integer, Jang> getMyJangs() {
		return myJangs;
	}

	public void setMyJangs(Map<Integer, Jang> myJangs) {
		this.myJangs = myJangs;
	}

	public Play(int place, Map<Integer, Jang> myJangs) {
		this.place = place;
		this.myJangs = myJangs;
	}
	
}

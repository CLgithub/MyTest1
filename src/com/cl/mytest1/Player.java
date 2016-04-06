package com.cl.mytest1;

import java.util.TreeSet;

public class Player {
	private int place;
	private TreeSet<Jang> myJangs;

	public int getPlace() {
		return place;
	}

	public void setPlace(int place) {
		this.place = place;
	}

	public TreeSet<Jang> getMyJangs() {
		return myJangs;
	}

	public void setMyJangs(TreeSet<Jang> myJangs) {
		this.myJangs = myJangs;
	}

	
	public Player(int place, TreeSet<Jang> myJangs) {
		this.place = place;
		this.myJangs = myJangs;
	}

	@Override
	public String toString() {
		return "Play [place=" + place + ", myJangs=" + myJangs + "]";
	}

}

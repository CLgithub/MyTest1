package com.cl.mytest1;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class Player {
	private int place;
	private LinkedList<Jang> myJangs;

	public int getPlace() {
		return place;
	}

	public void setPlace(int place) {
		this.place = place;
	}

	public LinkedList<Jang> getMyJangs() {
		return myJangs;
	}

	public void setMyJangs(LinkedList<Jang> myJangs) {
		this.myJangs = myJangs;
	}

	public Player(int place, LinkedList<Jang> myJangs) {
		this.place = place;
		this.myJangs = myJangs;
	}

	@Override
	public String toString() {
		return "Play [place=" + place + ", myJangs=" + myJangs + "]";
	}

}

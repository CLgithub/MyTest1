package com.cl.mytest1;

public interface Server {

	/**
	 * 砌---得到WLO后随机排列并存入一个list内
	 * @author L
	 * @date 2016年3月27日
	 */
	public Jang[] loadBJang();
	
	/**
	 * 摸---
	 * @author L
	 * @date 2016年3月27日
	 * @param jangs
	 */
	public void loadMyJang(Jang[] jangs, Play p1, Play p2, Play p3, Play p4);

	/**
	 * 整理
	 * @author L
	 * @date 2016年3月28日
	 * @param p1
	 */
	public void sortOutJ(Play p1);

	/**
	 * run
	 * @author L
	 * @date 2016年3月28日
	 * @param jangs
	 * @param p1
	 * @param p2
	 * @param p3
	 * @param p4
	 */
	public void runJang(Jang[] jangs, Play p1, Play p2, Play p3, Play p4);

}

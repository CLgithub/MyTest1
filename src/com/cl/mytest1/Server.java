package com.cl.mytest1;

import java.util.List;

public interface Server {
	/**
	 * 砌---得到WLO后随机排列并存入一个list内
	 * @author L
	 * @date 2016年4月6日
	 * @return
	 */
	public List<Jang> loadBJang();

	/**
	 * 摸
	 * @author L
	 * @date 2016年4月6日
	 * @param jangs	
	 * @param p1
	 * @param p2
	 * @param p3
	 * @param p4
	 */
	public void loadMyJang(List<Jang> jangs, Player p1, Player p2, Player p3, Player p4);
}

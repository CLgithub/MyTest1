package com.cl.mytest1;

import java.util.LinkedList;
import java.util.List;

public interface Server {
	/**
	 * 砌---得到WLO后随机排列并存入一个list内
	 * @author L
	 * @date 2016年4月6日
	 * @return
	 */
	public LinkedList<Jang> loadBJang();

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
	public void loadMyJang(LinkedList<Jang> jangs, Player p1, Player p2, Player p3, Player p4);
	
	/**
	 * 理
	 * @author L
	 * @date 2016年4月7日
	 * @param jangs
	 */
	public void sortJang(List<Jang> jangs);

	/**
	 * 
	 * @author L
	 * @date 2016年4月7日
	 * @param jangs
	 * @param p1
	 * @param p2
	 * @param p3
	 * @param p4
	 */
	public void runJang(LinkedList<Jang> jangs, Player p1, Player p2, Player p3, Player p4);
	
	/**
	 * 判断是否胡	(ABC)*n+(DDD)*m+EE
	 * @author L
	 * @date 2016年4月15日
	 * @param js
	 * @return
	 */
	public boolean isLicense(List<Jang> js);
}

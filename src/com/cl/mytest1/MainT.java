package com.cl.mytest1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MainT {

	public static void main(String[] args) {
		//初始化玩家
		Player p1=new Player(1, null);
		Player p2=new Player(2, null);
		Player p3=new Player(3, null);
		Player p4=new Player(4, null);
		Server server=new ServerImpl();
		//砌
		LinkedList<Jang> jangs=server.loadBJang();
		
		//摸
		server.loadMyJang(jangs,p1,p2,p3,p4);
		//理
		server.sortJang(p1.getMyJangs());
		server.sortJang(p2.getMyJangs());
		server.sortJang(p3.getMyJangs());
		server.sortJang(p4.getMyJangs());
//		System.out.println(p1.getMyJangs());
//		System.out.println(p2.getMyJangs());
//		System.out.println(p3.getMyJangs());
//		System.out.println(p4.getMyJangs());
		
//		for (int i = 0; i < jangs.size(); i++) {
//			System.out.print(jangs.get(i));
//			if((i+1)%16==0){
//				System.out.println();
//			}
//		}
//		System.out.println();
		
		//run
//		server.runJang(jangs,p1,p2,p3,p4);
		server.isLicense(p1.getMyJangs());
	}
}

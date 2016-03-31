package com.cl.mytest1;

import java.util.Arrays;

public class MainT {

	public static void main(String[] args) {
		//初始化玩家
		Play p1=new Play(1, null);
		Play p2=new Play(2, null);
		Play p3=new Play(3, null);
		Play p4=new Play(4, null);
		Server server=new ServerImpl();
		//砌
		Jang[] jangs=server.loadBJang();
		System.out.println(Arrays.toString(jangs));
		System.out.println(jangs.length);
		server.all14(jangs);
		//摸
		server.loadMyJang(jangs,p1,p2,p3,p4);
//		System.out.println(Arrays.toString(p1.getMyJangs()));
		//整理
		server.sortOutJ(p1);
		server.sortOutJ(p2);
		server.sortOutJ(p3);
		server.sortOutJ(p4);
		System.out.println(Arrays.toString(p1.getMyJangs()));
		System.out.println(Arrays.toString(p2.getMyJangs()));
		System.out.println(Arrays.toString(p3.getMyJangs()));
		System.out.println(Arrays.toString(p4.getMyJangs()));
		//run
		server.runJang(jangs,p1,p2,p3,p4);
	}
}

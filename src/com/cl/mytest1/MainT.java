package com.cl.mytest1;

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
		//摸
		server.loadMyJang(jangs,p1,p2,p3,p4);
		//整理
		server.sortOutJ(p1);
		//run
		server.runJang(jangs,p1,p2,p3,p4);
	}
}

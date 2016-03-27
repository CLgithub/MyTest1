package com.cl.mytest1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainT {

	public static void main(String[] args) {
		//初始化玩家
		Play p1=new Play(1, null);
		Play p2=new Play(2, null);
		Play p3=new Play(3, null);
		Play p4=new Play(4, null);
		//砌
		Jang[] jangs=loadBJang();
		System.out.println(Arrays.toString(jangs));
		//摸
		loadMyJang(jangs,p1,p2,p3,p4);
	}
	
	/**
	 * 砌---得到WLO后随机排列并存入一个list内
	 * @author L
	 * @date 2016年3月27日
	 */
	private static Jang[] loadBJang() {
		Jang[][] W =Lib.getLib().W;
		Jang[][] L =Lib.getLib().L;
		Jang[][] O =Lib.getLib().O;
		Jang[] jangs=new Jang[108];//最终返回
		for(int i=0;i<W.length;i++){
			for(int j=0;j<W[i].length;j++){
				jangs[i*j]=W[i][j];
			}
		}
		
		
//		Random random=new Random();
//		for(int i=0;i<jangs.length;i++){
//			int typeR=random.nextInt(3);//产生0~2之间的随机数
//			int varueR=random.nextInt(9);//产生0~8之间的随机数
//			int r=random.nextInt(4);
//			if((typeR==0)&&(W[varueR][r].getStatus()==0)){
//				jangs[i]=W[varueR][r];
//				W[varueR][r].setStatus(1);
//			}else if((typeR==1)&&(L[varueR][r].getStatus()==0)){
//				jangs[i]=L[varueR][r];
//				L[varueR][r].setStatus(1);
//			}else if((typeR==1)&&(O[varueR][r].getStatus()==0)){
//				jangs[i]=O[varueR][r];
//				O[varueR][r].setStatus(1);
//			}else {
//				continue;
//			}
//		}
		return jangs;
	}

	/**
	 * 摸---
	 * @author L
	 * @date 2016年3月27日
	 * @param jangs
	 */
	private static void loadMyJang(Jang[] jangs, Play p1, Play p2, Play p3, Play p4) {
		
	}

	
}

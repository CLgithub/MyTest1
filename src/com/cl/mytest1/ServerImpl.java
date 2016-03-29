package com.cl.mytest1;

import java.util.Arrays;
import java.util.Random;

public class ServerImpl implements Server {
	
	
	public Jang[] loadBJang() {
		Jang[][] W =Lib.getLib().W;
		Jang[][] L =Lib.getLib().L;
		Jang[][] O =Lib.getLib().O;
		Jang[] jangs=new Jang[108];//最终返回
		for(int i=0;i<W.length;i++){
			for(int j=0;j<W[i].length;j++){
				jangs[W[i].length*i+j]=W[i][j];
			}
		}
		for(int i=0;i<L.length;i++){
			for(int j=0;j<L[i].length;j++){
				jangs[36+(L[i].length*i+j)]=L[i][j];
			}
		}
		for(int i=0;i<O.length;i++){
			for(int j=0;j<O[i].length;j++){
				jangs[72+O[i].length*i+j]=O[i][j];
			}
		}
		Random random=new Random();
		int r=0;
		for(int i=0;i<100000;i++){
			r=random.nextInt(104);//产生0~9之间的随机数
			Jang tmp=jangs[r];
			jangs[r]=jangs[r+4];
			jangs[r+4]=tmp;
		}
		return jangs;
	}
	
	public void loadMyJang(Jang[] jangs, Play p1, Play p2, Play p3, Play p4) {
		p1.setMyJangs(new Jang[18]);
		p2.setMyJangs(new Jang[18]);
		p3.setMyJangs(new Jang[18]);
		p4.setMyJangs(new Jang[18]);
		int j=0;
		for(int i=0;i<52;i=i+4){
			jangs[i].setStatus(Jang.P1HAVE);
			jangs[i+1].setStatus(Jang.P2HAVE);
			jangs[i+2].setStatus(Jang.P3HAVE);
			jangs[i+3].setStatus(Jang.P4HAVE);
			
			p1.getMyJangs()[j]=jangs[i];
			p2.getMyJangs()[j]=jangs[i+1];
			p3.getMyJangs()[j]=jangs[i+2];
			p4.getMyJangs()[j]=jangs[i+3];
			j++;
		}
		//tiaopai
		jangs[52].setStatus(Jang.P1HAVE);
		p1.getMyJangs()[13]=jangs[52];
//		
//		System.out.println(p1);
//		System.out.println(p2);
//		System.out.println(p3);
//		System.out.println(p4);
//		for(int i=0;i<jangs.length;i++){
//			System.out.println(jangs[i]);
//		}
	}

	@Override
	public void sortOutJ(Play p1) {
//		Jang[] jangs=p1.getMyJangs();
//		Jang[] jangs={
//				new Jang("L", 6, 1),
//				new Jang("W", 9, 1), 
//				new Jang("O", 9, 1), 
//				new Jang("W", 7, 1), 
//				new Jang("W", 8, 1), 
//				new Jang("L", 8, 1), 
//				new Jang("W", 2, 1), 
//				new Jang("L", 2, 1), 
//				new Jang("L", 4, 1), 
//				new Jang("W", 7, 1), 
//				new Jang("L", 5, 1), 
//				new Jang("W", 1, 1), 
//				new Jang("O", 6, 1), 
//				new Jang("W", 3, 1), 
//				null, null, null, null};
		Jang[] jangs={new Jang(4,"W",1), new Jang(4,"L",1), new Jang(2,"W",1), new Jang(9,"W",1), 
				new Jang(7,"W",1), new Jang(7,"O",1), new Jang(3,"O",1), new Jang(7,"L",1), new Jang(8,"O",1),
				new Jang(8,"L",1), new Jang(5,"L",1), new Jang(9,"L",1), new Jang(4,"O",1), new Jang(5,"W",1),
				null, null, null, null};
		System.out.println(Arrays.toString(jangs));
//		[[6L], [9W], [9L], [7O], [8W], [8L], [2W], [2L], [4L], [7W], [5L], [1W], [6O], [3W], null, null, null, null]
//		[[4W], [4L], [2W], [9W], [7W], [7O], [3O], [7L], [8O], [8L], [5L], [9L], [4O], [5W], null, null, null, null]
		int last=0;
		int long_1=jangs.length-4-1;
		for (int i = 0; i < long_1-last; i++) {
			if(jangs[i].getType().equals("L")){
				if(long_1-last==i){
					long_1=i-1;
					last=0;
					break;
				}
				Jang tmp=jangs[long_1-last];
				jangs[long_1-last]=jangs[i];
				jangs[i]=tmp;
				last++;
				i--;
			}
		}
		for (int i = 0; i < long_1-last; i++) {
			if(jangs[i].getType().equals("W")){
				if(long_1-last==i){
					break;
				}
				Jang tmp=jangs[long_1-last];
				jangs[long_1-last]=jangs[i];
				jangs[i]=tmp;
				last++;
				i--;
			}
		}
		System.out.println(Arrays.toString(jangs));
	}

	@Override
	public void runJang(Jang[] jangs, Play p1, Play p2, Play p3, Play p4) {
	//	Arrays.sort(p1.getMyJangs());
//		System.out.println(Arrays.toString(p1.getMyJangs()));
	}

}

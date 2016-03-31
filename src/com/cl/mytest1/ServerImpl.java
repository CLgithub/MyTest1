package com.cl.mytest1;

import java.util.Random;

public class ServerImpl implements Server {
	
	
	public Jang[] loadBJang() {
		Jang[][] W =Lib.getLib().W;
		Jang[][] L =Lib.getLib().L;
		Jang[][] O =Lib.getLib().O;
		Jang[] jangs=new Jang[108];//最终返回
		for(int i=0;i<O.length;i++){
			for(int j=0;j<O[i].length;j++){
				jangs[O[i].length*i+j]=O[i][j];
			}
		}
		for(int i=0;i<W.length;i++){
			for(int j=0;j<W[i].length;j++){
				jangs[36+(W[i].length*i+j)]=W[i][j];
			}
		}
		for(int i=0;i<L.length;i++){
			for(int j=0;j<L[i].length;j++){
				jangs[72+L[i].length*i+j]=L[i][j];
			}
		}
		Random random=new Random();
		int r=0;
		for(int i=0;i<1000000;i++){
//			r=random.nextInt(104);//产生0~9之间的随机数
//			Jang tmp=jangs[r];
//			jangs[r]=jangs[r+4];
//			jangs[r+4]=tmp;
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
	}

	@Override
	public void sortOutJ(Play p) {
		Jang[] jangs=p.getMyJangs();
		int nullIndex=0;
		for (int i = 0; i < jangs.length; i++) {
			if(null==jangs[i]){
				nullIndex=i;
				break;
			}
		}
		int long1=nullIndex;
		int last=0;
		int j=0;
		for (j = 0; j < long1-last; j++) {
			if(jangs[j].getType().equals("L")){
				if(long1-last==j){
					break;
				}
				Jang tmp=jangs[long1-last-1];
				jangs[long1-last-1]=jangs[j];
				jangs[j]=tmp;
				last++;
				j--;
			}
		}
		long1=j;
		last=0;
		for (int i = 0; i < long1-last; i++) {
			if(jangs[i].getType().equals("W")){
				if(long1-last==i){
					break;
				}
				Jang tmp=jangs[long1-last-1];
				jangs[long1-last-1]=jangs[i];
				jangs[i]=tmp;
				last++;
				i--;
			}
		}
		long1=nullIndex;
		for (int x = 0; x < long1-1; x++) {
			for (int i = 0; i < long1-1-x; i++) {
				if(jangs[i].getType().equals(jangs[i+1].getType())){
					if(jangs[i].getValue()>jangs[i+1].getValue()){
						Jang tmp=jangs[i];
						jangs[i]=jangs[i+1];
						jangs[i+1]=tmp;
					}
				}else {
					continue;
				}
			}
		}
	}

	@Override
	public void runJang(Jang[] jangs, Play p1, Play p2, Play p3, Play p4) {
		
	}

	@Override
	public void all14(Jang[] jangs) {
		int count=0;
		Jang[] arrJang=new Jang[14];
		for (int j = 0; j < jangs.length-14+1; j++) {
			for (int k = 14; k>0; k--) {
				for (int i = 14-1; i < jangs.length; i++) {
					count++;
				}
			}
		}
		System.out.println(count);
		
	}

}

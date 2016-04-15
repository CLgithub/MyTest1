package com.cl.mytest1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ServerImpl implements Server {
	
	@Override
	public List<Jang> loadBJang() {
		List<Jang> list = new ArrayList<Jang>();
		String[] types = { "O", "W", "L" };
		Integer[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int j = 0; j < types.length; j++) {
			for (int i = 0; i < values.length; i++) {
				for (int k = 0; k < 4; k++) {
					list.add(new Jang(values[i], types[j], Jang.INIT, k+1));
				}
			}
		}
		Random random=new Random();
		for(int i=0;i<10000;i++){
			int index1=random.nextInt(list.size());
			int index2=random.nextInt(list.size());
			Jang tmp=list.get(index1);
			list.set(index1, list.get(index2));
			list.set(index2, tmp);
		}
		return list;
	}

	@Override
	public void loadMyJang(List<Jang> jangs, Player p1, Player p2, Player p3, Player p4) {
		List<Jang> jangs1=new ArrayList<Jang>();
		List<Jang> jangs2=new ArrayList<Jang>();
		List<Jang> jangs3=new ArrayList<Jang>();
		List<Jang> jangs4=new ArrayList<Jang>();
		Jang j1=null;
		Jang j2=null;
		Jang j3=null;
		Jang j4=null;
		for(int i=0;i < 3;i++){
			for (int j = 0; j < 4; j++) {
				j1=jangs.get(16*i+j);
				j2=jangs.get(16*i+j+4);
				j3=jangs.get(16*i+j+8);
				j4=jangs.get(16*i+j+12);
				jangs1.add(j1);
				j1.setStatus(Jang.P1HAVE);
				jangs2.add(j2);
				j2.setStatus(Jang.P2HAVE);
				jangs3.add(j3);
				j3.setStatus(Jang.P3HAVE);
				jangs4.add(j4);
				j4.setStatus(Jang.P4HAVE);
			}
		}
		//tiaopai
		jangs1.add(jangs.get(48));
		jangs.get(48).setStatus(Jang.P1HAVE);
		jangs2.add(jangs.get(49));
		jangs.get(49).setStatus(Jang.P2HAVE);
		jangs1.add(jangs.get(50));
		jangs.get(50).setStatus(Jang.P1HAVE);
		jangs3.add(jangs.get(51));
		jangs.get(51).setStatus(Jang.P3HAVE);
		jangs4.add(jangs.get(52));
		jangs.get(52).setStatus(Jang.P4HAVE);
		p1.setMyJangs(jangs1);
		p2.setMyJangs(jangs2);
		p3.setMyJangs(jangs3);
		p4.setMyJangs(jangs4);
	}

	@Override
	public void sortJang(List<Jang> jangs) {
		Collections.sort(jangs,new MySortJ());
	}

	@Override
	public void runJang(List<Jang> jangs, Player p1, Player p2, Player p3, Player p4) {
		test(p1.getMyJangs(),jangs,5,5,new StringBuilder(""));
	}

	private void test(List<Jang> p1Js,List<Jang> jangs,int y,int k,StringBuilder tmpj) {
		y--;
		if(y>=0){
			List<Jang> tmpP1Js=new ArrayList<>();
			for(int i=0;i<p1Js.size();i++){
				tmpP1Js.add(p1Js.get(i));
			}
			int leng=p1Js.size();
			for(int i=0;i<leng;i++){
				//进的时候都应该加上历史，过的时候不加
				tmpj.append("打"+p1Js.remove(i).toString());
				
				p1Js.add(jangs.get(56+(1-y)*4));
				this.sortJang(p1Js);
				tmpj.append("摸"+jangs.get(56+(1-y)*4));
				
				String str=tmpj.toString();
				str=str.substring(str.length()-10*(k-y));
				
//				System.out.println(p1Js+"---"+str);
				outToFile(p1Js+"---"+str);
				test(p1Js,jangs,y,k,new StringBuilder(str));
				
				p1Js.clear();
				for(int j=0;j<tmpP1Js.size();j++){
					p1Js.add(tmpP1Js.get(j));
				}
				tmpj=new StringBuilder(str.substring(0,10*(k-y-1)));
			}
		}
	}
	
	public void outToFile(String str){
		try {
			File file=new File("E:/myTest/test.txt");
			FileWriter fileWriter=new FileWriter(file,true);
			BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
			bufferedWriter.write(str);
			bufferedWriter.newLine();
			bufferedWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean isLicense(List<Jang> js) {
		System.out.println(js);
		return false;
	}
	
	
}
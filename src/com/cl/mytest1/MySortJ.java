package com.cl.mytest1;

import java.util.Comparator;

public class MySortJ implements Comparator<Jang>{

	@Override
	public int compare(Jang j1, Jang j2) {
		if(j1.getType().equals(j2.getType())){
			if(j1.getValue()==j2.getValue()){
				return j1.getNumber()-j2.getNumber();
			}else {
				return j1.getValue()-j2.getValue();
			}
		}else if(j1.getType().equals("O")){
			return -11;
		}else if(j1.getType().equals("L")){
			return 1;
		}else if(j1.getType().equals("W")){
			if(j2.getType().equals("L")){
				return -1;
			}else {
				return 1;
			}
		}else {
			return 0;
		}
	}
	

}

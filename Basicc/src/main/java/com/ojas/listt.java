package com.ojas;
import java.util.*;
public class listt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new ArrayList();
		System.out.println(l.size());
		l.add(10);
		l.add(true);
		l.add("ojas");
		l.add("c");
		l.add(10);
		System.out.println("using for loop");
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		
	}

}

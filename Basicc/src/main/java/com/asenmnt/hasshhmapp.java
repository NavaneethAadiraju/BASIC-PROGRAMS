package com.asenmnt;

import java.util.HashMap;
import java.util.Map;

public class hasshhmapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Map<Integer, String> m = new HashMap<Integer, String>();
	    addData(m);
	}

	private static void addData(Map<Integer, String> m) {
		// TODO Auto-generated method stub
	m.put(1, "ravi");
	m.put(5, "jack");
	m.put(2, "zira");
	m.put(16, "hwlo");
	m.put(23, "rai");
	m.put(25, "python");
	  for (Map.Entry<Integer, String> entry : m.entrySet()) {
	        System.out.println(entry.getKey() + " = " + entry.getValue());
	    }
	}

}

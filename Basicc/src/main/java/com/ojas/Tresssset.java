package com.ojas;

import java.util.Iterator;
import java.util.TreeSet;

public class Tresssset {
  public static void main(String[] args) {
     TreeSet<String> ts = new TreeSet<String>();
          ts.add("Ravi");
          ts.add("Adhan");
          ts.add("jack");
          ts.add("zara");
          ts.add("olive");
   System.out.println("Before Traversing" + ts);  
     Iterator it = ts.descendingIterator();
     System.out.println("Elements in Reverse Order:");
     while (it.hasNext()) {
        System.out.println(it.next());
     }
  }
}
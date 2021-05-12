package new111;

import java.util.LinkedList;

public class Linkedlistdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l = new LinkedList<String>();
		l.add("b");
		l.add("a");
		l.add("c");
		l.add("d");
		l.add("e");
		l.addLast("z");
		l.addFirst("x");
		l.add(1, "z1");
		System.out.println(l);
		l.removeFirst();
		l.remove();
		System.out.println("after removing first and last=" + l);
		l.remove("E");
		l.remove(2);
		System.out.println(l);
		String st = l.get(0);
		System.out.println(st);
		System.out.println("After changes" + l);

	}

}

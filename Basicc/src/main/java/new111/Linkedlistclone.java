package new111;

import java.util.LinkedList;

public class Linkedlistclone {

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
		System.out.println("actual linkedList" + 1);
		LinkedList<String> copy = (LinkedList<String>) l.clone();
		System.out.println("Cloned Linkedlist=" + copy);

	}

}
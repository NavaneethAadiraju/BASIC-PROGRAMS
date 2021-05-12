package new111;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator1 implements Comparator<StringBuffer> {
	@Override
	public int compare(StringBuffer s1, StringBuffer s2) {
		String m1 = s1.toString();
		String m2 = s2.toString();
		return m1.compareTo(m2);
	}

}

public class Stringbufferdemmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<StringBuffer> t = new TreeSet<StringBuffer>(new MyComparator1());
		t.add(new StringBuffer("orange"));
		t.add(new StringBuffer("apple"));
		t.add(new StringBuffer("banana"));

		t.forEach(x -> System.out.println(x));

	}

}

package new111;

import java.util.ArrayList;
import java.util.ListIterator;

public class Listiterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("prabha");
		list.add("mommy");
		ListIterator<String> listIt = list.listIterator();
		System.out.println("forward direction");
		while (listIt.hasNext()) {
			System.out.println(listIt.next());
		}
		System.out.println("backward direction");
		while (listIt.hasPrevious()) {
			System.out.println(listIt.previous());

		}
	}
}

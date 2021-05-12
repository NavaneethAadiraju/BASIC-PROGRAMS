package new111;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arraylistdemo1 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		String StrArray[] = { "ramu", "sita" };
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(StrArray));
		al.add("ram");
		al.add("sree");
		Collections.sort(al);
		al.forEach(System.out::println);

	}

}
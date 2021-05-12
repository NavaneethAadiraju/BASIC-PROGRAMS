package new111;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class TreeSetdemoo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = { "hai", "h r u" };
		List<String> list = Arrays.asList(str);
		TreeSet<String> ts = new TreeSet<String>(list);
		ts.forEach(x -> System.out.println(x));
	}

}

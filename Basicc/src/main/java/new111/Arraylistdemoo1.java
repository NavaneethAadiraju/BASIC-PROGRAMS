package new111;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Arraylistdemoo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String StrArray[]= {"ramu","sita"};
		ArrayList<String> al=new ArrayList<String>
		(Arrays.asList(StrArray));
		Object b[]=al.toArray();
		for(Object x:b) {
		System.out.println(x);
		}
}
}
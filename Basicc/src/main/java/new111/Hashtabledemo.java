package new111;

import java.util.Enumeration;
import java.util.Hashtable;

public class Hashtabledemo {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		Hashtable<String, String> hs = new Hashtable<String, String>();
		hs.put("Andhra", "Amaravathi");
		hs.put("telangana", "nagaland");
		hs.put("goa", "thailand");
		hs.put("ooty", "sikkim");
		hs.put("banglore", "chennai");

		Enumeration<String> keys = hs.keys();
		while (keys.hasMoreElements()) {
			String k = (String) keys.nextElement();
			String v = hs.get(k);
			System.out.println(k + " - " + v);
		}
	}

}
package com.asenmnt;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class DateeCompre {
	public static int compareDates(String psDate1, String psDate2) throws ParseException{
	    SimpleDateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
	    Date date1 = df.parse(psDate1);
	    Date date2 = df.parse(psDate2);
	    if (date1.after(date2)) {
	    	System.out.println("date1 is after date 2");
	        return 2;
	    }
	    if (date1.before(date2)) {
	    	System.out.println("date1 is before date 2");
	        return 1;
	    }

	    if (date1.equals(date2)) {
	    	System.out.println("date1 and  date 2 are equal");
	        return 0;
	    }
		return -1;
	}
	public static void main(String[] args) throws ParseException {
		System.out.println("enter two dates in format dd/MM/yyyy");
		Scanner s=new Scanner(System.in);
		String d1=s.next();
		String d2=s.next();
		System.out.println(compareDates(d1,d2));

	}
}
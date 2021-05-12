import java.util.Arrays;
import java.util.Scanner;

public class maarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      int arr[] = {10, 34, 56, 960, 20,100,200,02,20,520,10};
	        int max = Arrays.stream(arr).max().getAsInt();
	        System.out.println("Largest in given array is " +max);
	    }
}

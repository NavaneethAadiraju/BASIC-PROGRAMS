import java.util.Scanner;

public class Arraysumm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[10];
		int sum = 0;
		System.out.println("Enter the elements:");
		for (int i = 0; i < 10; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println("Sum of given array is " + sum(array));
	}

	private static int sum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++)
			sum += array[i];

		return sum;
	}

}

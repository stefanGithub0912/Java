
//Write a function to calculate the sum of an array.
import java.util.Scanner;

public class method7 {

	public static void main(String[] args) {
		int sum = 0;
		sum_array(sum);
	}

	static int sum_array(int sum) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nubers in array: ");
		int a = sc.nextInt();
		int[] array = new int[a];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			sum += array[i];
		}
		System.out.println("Sum of numbers in array -> " + sum);
		return sum;

	}

}
import java.util.Scanner;
//Write a program to find the sum of all elements in an array using a for loop.

public class for6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Amount of elements in array: ");
		int a = sc.nextInt();
		int[] array = new int[a];
		int sum = 0;
		for (int i = 0; i < a; i++) {
			array[i] = sc.nextInt();
			sum += array[i];
		}
		System.out.println("Sum of elements: " + sum);

	}

}

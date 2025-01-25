//Write a function to find the smallest number in an array.

import java.util.Scanner;

public class method8 {

	public static void main(String[] args) {

		min_array(1);
	}

	static int min_array(int min) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nubers in array: ");
		int a = sc.nextInt();
		int[] array = new int[a];

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("Smallest number in array -> " + min);
		return min;

	}

}

import java.util.Scanner;
//Write a program to find the largest number in an array using a for loop.

public class for10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of elements in array");
		int a = sc.nextInt();
		int[] array = new int[a];
		int max = 0;
		for (int i = 0; i < a; i++) {
			array[i] = sc.nextInt();
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("Maximum of elements: " + max);

	}

}

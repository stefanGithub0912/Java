import java.util.Scanner;
//Write a program to calculate the average of numbers in an array using a for loop.

public class for9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of elements in array");
		int a = sc.nextInt();
		int[] array = new int[a];
		int avrege = 0;
		int sum = 0;
		int i = 0;
		for (i = 0; i < a; i++) {
			array[i] = sc.nextInt();
			sum += array[i];
		}
		avrege = sum / i;
		System.out.println("Avrege of elements: " + avrege);

	}

}

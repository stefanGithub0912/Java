import java.util.Scanner;

//Write a program to print all possible pairs from two arrays using nested for loops.
public class for_in_for6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1st array(Amount of numbers): ");
		int a = sc.nextInt();
		int[] array = new int[a];
		System.out.println("2nd array(Amount of numbers): ");
		int b = sc.nextInt();
		int[] array2 = new int[b];

		System.out.println("1st array numbers: ");
		for (int i = 0; i < a; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("2nd array numbers: ");
		for (int i = 0; i < a; i++) {
			array2[i] = sc.nextInt();
		}

		for (int i = 0; i < array.length; i++) {
			for (int k = 0; k < array2.length; k++) {
				System.out.println(array[i] + " and " + array2[k]);
			}
		}
	}

}

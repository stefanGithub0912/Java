import java.util.Scanner;

//Write a program to print the Pascal's triangle up to n rows using nested for loops.
//A pascal's triangle is an arrangement of numbers in a triangular array such that the numbers at the end of each row are 1 
//and the remaining numbers are the sum of the nearest two numbers in the above row
public class for_in_for4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Number of rows: ");
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}

			int value = 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(value + " ");
				value = value * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}
}

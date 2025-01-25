import java.util.Scanner;

//Write a program to rotate a 2D array 90 degrees clockwise using nested for loops.
public class for_in_for10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Size: ");
		int n = scanner.nextInt();

		int[][] matrix = new int[n][n];
		System.out.println("Elements of matrix:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}

		int[][] rotated = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				rotated[j][n - 1 - i] = matrix[i][j];
			}
		}

		System.out.println("Rotated Matrix: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(rotated[i][j] + " ");
			}
			System.out.println();
		}
	}
}
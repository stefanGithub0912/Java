import java.util.Scanner;
//Create a program that multiplies two matrices (2D arrays) and displays the resulting matrix.

public class for_in_for3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the square matrices:");
        int size = sc.nextInt();

        // Initialize the matrices
        int[][] matrixA = new int[size][size];
        int[][] matrixB = new int[size][size];
        int[][] resultMatrix = new int[size][size];

        // Input elements of the first matrix
        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }

        // Input elements of the second matrix
        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }

        // Multiply the matrices
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                resultMatrix[i][j] = 0;
                for (int k = 0; k < size; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        // Display the resulting matrix
        System.out.println("Resulting matrix after multiplication:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

		
	}

}

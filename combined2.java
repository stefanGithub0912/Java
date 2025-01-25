//Implement a program to rotate a 2D matrix (N x N) 90 degrees clockwise.

import java.util.Scanner;

public class combined2 {
	   public static void rotateMatrix(int[][] matrix) {
	        int n = matrix.length;
	        for (int i = 0; i < n; i++) {
	            for (int j = i; j < n; j++) {
	                int temp = matrix[i][j];
	                matrix[i][j] = matrix[j][i];
	                matrix[j][i] = temp;
	            }
	        }
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n / 2; j++) {
	                int temp = matrix[i][j];
	                matrix[i][j] = matrix[i][n - 1 - j];
	                matrix[i][n - 1 - j] = temp;
	            }
	        }
	    }

	    public static void printMatrix(int[][] matrix) {
	        for (int[] row : matrix) {
	            for (int elem : row) {
	                System.out.print(elem + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	    	int[][] matrix = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };
	        System.out.println("Original Matrix:");
	        printMatrix(matrix);
	        rotateMatrix(matrix);
	        System.out.println("\nRotated Matrix (90 degrees clockwise):");
	        printMatrix(matrix);
	}}

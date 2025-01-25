import java.util.Scanner;

//Write a program to print a right-angled triangle pattern of * using nested for loops.
public class for_in_for2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 5; i++) { // Outer loop for rows
			for (int j = 1; j <= i; j++) { // Inner loop for columns
				System.out.print("*"); // Print asterisks
			}
			System.out.println(); // Move to the next line after each row
		}
	}

}

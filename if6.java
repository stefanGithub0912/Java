import java.util.Scanner;
//Write a program to categorize a number as even or odd using if statements.

public class if6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a != 0) {
			if (a % 2 == 0) {
				System.out.println("Even number");
			} else {
				System.out.println("Odd number");

			}
		} else {
			System.out.println("Invalid number");

		}
	}

}

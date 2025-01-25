import java.util.Scanner;
//Write a program to check if a year is a leap year using if statements.

public class if3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Year: ");
		int a = sc.nextInt();
		if (a % 4 == 0) {
			System.out.println("Year is leap");

		} else {
			System.out.println("Year is NOT leap");

		}

	}

}

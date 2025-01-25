import java.util.Scanner;
//Write a program to check if a number is a palindrome using a while loop.

public class while4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number:");
		int a = sc.nextInt();
		int n = a;
		int reverse = 0;
		while (a > 0) {
			reverse = (reverse * 10) + (a % 10);
			a = a / 10;
		}
		if (n == reverse) {
			System.out.println("Number is palindrome! ");

		} else {
			System.out.println("Number is NOT palindrome! ");

		}

	}

}

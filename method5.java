
//Write a function to reverse a number.
import java.util.Scanner;

public class method5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		reverse(a);
	}

	static int reverse(int a) {
		int reverse = 0;

		while (a != 0) {
			int digit = a % 10;
			reverse = reverse * 10 + digit;
			a /= 10;
		}
		System.out.println(reverse);
		return reverse;
	}
}

import java.util.Scanner;
//Write a program to calculate the power of a number using a while loop.

public class while7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number:");
		int a = sc.nextInt();
		System.out.println("Power of number:");
		int b = sc.nextInt();
		int result = 1;

		while (b != 0) {
			result *= a;
			b--;
		}
		System.out.println("Result: " + result);
	}

}

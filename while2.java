import java.util.Scanner;
//Write a program to calculate the sum of digits of a number using a while loop.

public class while2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number:");
		int a = sc.nextInt();
		int sum = 0;
		while (a > 0) {
			sum += a % 10;
			a /= 10;
		}
		System.out.println("Sum: " + sum);

	}

}

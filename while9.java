import java.util.Scanner;

//Write a program to calculate the sum of numbers until the user enters a negative number using a while loop.
public class while9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isNegative = true;
		int sum = 0;
		while (isNegative) {
			int a = sc.nextInt();
			sum += a;
			if (a < 0) {
				isNegative = false;
				sum -= a;
			}
		}
		System.out.println("Sum of numbers bigger then 0 -> " + sum);
	}

}

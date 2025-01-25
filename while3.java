import java.util.Scanner;
//Write a program to reverse a number using a while loop.

public class while3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number:");
		int a = sc.nextInt();
		int reversed = 0;
		int number = 0;
		while (a > 0) {
			number = a % 10;
			reversed = reversed * 10 + number;
			a /= 10;

		}
		System.out.println("Number reversed:" + reversed);

	}

}

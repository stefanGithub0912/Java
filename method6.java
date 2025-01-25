//Write a function to count odd digits in a number.

import java.util.Scanner;

public class method6 {

	public static void main(String[] args) {
		int odd_br = 0;
		odd_amount(odd_br);
	}

	static int odd_amount(int odd_br) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		odd_br = 0;
		int temp = 0;
		while (a != 0) {
			temp = a % 10;
			if (temp % 2 == 1) {
				odd_br++;
			}
			a /= 10;
		}
		System.out.println("Digits that are odd in number -> " + odd_br);
		return odd_br;

	}

}

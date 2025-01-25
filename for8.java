import java.util.Scanner;
//Write a program to count the number of digits in a number using a for loop.

public class for8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number to count digits: ");
		int a = sc.nextInt();
		a = Math.abs(a);
		int count = 0;
		for (int temp = a; temp > 0; temp /= 10) {
			count++;
		}
		if (a == 0) {
			count = 1;
		}
		System.out.println("Digits: " + count);
	}

}

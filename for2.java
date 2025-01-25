import java.util.Scanner;
//Write a program to calculate the sum of numbers from 1 to 100.

public class for2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum + " <-- Sum of numbers from 1 to 100");
	}

}

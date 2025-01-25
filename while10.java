import java.util.Scanner;
//Write a program to count the number of odd digits using a while loop.

public class while10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int oddDigits = 0;
		int temp;
		while (a != 0) {
			temp = a % 10;
			a /= 10;
			if (temp % 2 != 0) {
				oddDigits++;
			}
		}
		System.out.println("Odd digits count -> " + oddDigits);
	}

}

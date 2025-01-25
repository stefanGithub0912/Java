import java.util.Scanner;
//Write a program to print all prime numbers between 1 and 100 using a while loop.

public class while5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		int a = 1;
		int b = 1;
		int prime = 0;
		System.out.print(2 + " , " + 3 + " , " + 5 + " , " + 11 + " , ");
		while (a <= 32) {
			a++;
			if (a % 2 != 0) {
				prime = b * 6 + 1;
				b++;
				if (prime % 3 != 0 && prime % 5 != 0 && prime % 9 != 0) {
					System.out.print(prime + " , ");
					prime = 0;
				}

			}
		}
	}

}

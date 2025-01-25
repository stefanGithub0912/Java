import java.util.Scanner;

//Write a program to find the greatest common divisor (GCD) of two numbers using a while loop.
public class while6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number 1:");
		int a = sc.nextInt();
		System.out.println("Number 2:");
		int b = sc.nextInt();
		int GCD = 1;
		int temp;
		while (b != 0) {
			temp = b;
			b = a % b;
			a = temp;
		}
		GCD = a;
		System.out.println("GCD is " + GCD);

	}

}

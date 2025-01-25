import java.util.Scanner;
//Write a program to find the largest of three numbers using if statements.

public class if2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a > b && a > c) {
			System.out.println("A(first number) is the largest");
		}
		if (b > a && b > c) {
			System.out.println("B(second number) is the largest");
		}
		if (c > b && c > a) {
			System.out.println("C(third number) is the largest");
		}

	}

}

import java.util.Scanner;
//Write a program to implement a simple calculator using if statements.

public class if8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("First number");
		int a = sc.nextInt();

		System.out.println("Choose function: * , / , + , - ");
		char function = sc.next().charAt(0);

		System.out.println("Second number");
		int b = sc.nextInt();

		if (function == '*') {
			System.out.println(a * b);
		}
		if (function == '+') {
			System.out.println(a + b);
		}
		if (function == '-') {
			System.out.println(a - b);
		}
		if (function == '/') {
			System.out.println(a / b);
		}
	}

}

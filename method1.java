import java.util.Scanner;

//Write a function to add two numbers.
public class method1 {

	public static int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number 1: ");
		int num1 = sc.nextInt();
		System.out.println("Number 2: ");
		int num2 = sc.nextInt();
		int result = num1 + num2;
		System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
	}
}

import java.util.Scanner;

//Write a program to print the Fibonacci series up to n terms using a for loop.
//Fn = Fn-1 + Fn-2,
public class for7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Amount of numbers to scan for Fibonacci: ");
		int n = sc.nextInt();
		int first = 0;
		int second = 1;
		for (int i = 1; i <= n; i++) {
			System.out.println(first + " ");
			int formula = first + second;
			first = second;
			second = formula;
		}

	}

}

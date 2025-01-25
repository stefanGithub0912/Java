
//Write a function to check if a number is even or odd.
import java.util.Scanner;

public class method3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		odd_or_even(a);

	}

	static boolean odd_or_even(int a) {

		boolean odd;
		if (a % 2 == 0) {
			odd = false;
			System.out.println("Number is even");
		} else {
			odd = true;
			System.out.println("Number is odd");
		}
		return odd;
	}

}


//Write a function to calculate the power of a number using recursion.
import java.util.Scanner;

public class method10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number: ");
		int base = sc.nextInt();
		System.out.println("Power of number: ");
		int powerRaised = sc.nextInt();
		int result = power(base, powerRaised);
		System.out.println(base + " ^ " + powerRaised + " = " + result);
	}

	public static int power(int base, int powerRaised) {
		if (powerRaised != 0) {
			return (base * power(base, powerRaised - 1));
		} else {
			return 1;
		}
	}

}

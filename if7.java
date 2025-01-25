
//Write a program to check if a triangle is possible to exsist.
import java.util.Scanner;

public class if7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1st side in cm");
		int a = sc.nextInt();
		System.out.println("2nd side in cm");
		int b = sc.nextInt();
		System.out.println("3rd side in cm");
		int c = sc.nextInt();
		if (a < 0 || b < 0 || c < 0) {
			System.out.println("Invalid side");
		}
		if (a + b <= c || a + c <= b || b + c <= a) {
			System.out.println("The triangle is possible");
		} else {
			System.out.println("Impossible");
		}
	}

}

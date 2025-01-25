import java.util.Scanner;
//Write a program to calculate the factorial of a number using a for loop.

public class for5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number to find factoriel of : ");
		int a = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <= a; a--) {
			fact *= a;
		}
		System.out.println("Factoriel : " + fact);
	}

}

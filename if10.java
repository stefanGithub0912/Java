import java.util.Scanner;

//Write a program to find the smallest of four numbers using if statements.
public class if10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		if (a < b && a < c && a < d) {
			System.out.println("Number 1 is the smallest number of 4");
		}
		if (b < a && b < c && b < d) {
			System.out.println("Number 2 is the smallest number of 4");
		}
		if (c < b && c < a && c < d) {
			System.out.println("Number 3 is the smallest number of 4");
		}
		if (d < b && d < c && d < a) {
			System.out.println("Number 4 is the smallest number of 4");
		}
	}

}
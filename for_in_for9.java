import java.util.Scanner;

//Write a program to print a hollow square pattern of * using nested for loops.
public class for_in_for9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of square");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}

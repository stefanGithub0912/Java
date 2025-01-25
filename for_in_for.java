import java.util.Scanner;

//Write a program to print a rectangle pattern of * using nested for loops.
public class for_in_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1st side");
		int a = sc.nextInt();
		System.out.println("2nd side");
		int b = sc.nextInt();
		for (int i = 0; i < a; i++) {
			for (int k = 0; k < b; k++) {
				System.out.print("*");
			}
			System.out.println("");

		}
	}

}

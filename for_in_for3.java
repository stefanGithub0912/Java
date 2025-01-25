import java.util.Scanner;

//Write a program to print the multiplication table from 1 to 10 using nested for loops.
public class for_in_for3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {
			for (int k = 1; k <= 10; k++) {
				System.out.println(i + " x " + k + " = " + i * k);
			}
			System.out.println();

		}
	}

}

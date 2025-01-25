import java.util.Scanner;
//Write a program to print the multiplication table of a number.

public class for3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int proiz = 1;
		System.out.println("Number for multiplication table : ");
		int a = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " x " + a + " = " + i * a);

		}

	}

}

import java.util.Scanner;
//Write a program to calculate the grade of a student based on marks using if statements.

public class if4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Grade from 0 - 100");
		System.out.println("F = 0 - 20 | D = 21 - 45 | C = 46 - 65 | B = 66 - 80| A = 81 - 100");
		int a = sc.nextInt();
		if (a < 0 || a > 100) {
			System.out.println("Invalid grade");
		}
		if (a >= 0 && a <= 20) {
			System.out.println("F");
		}
		if (a > 20 && a <= 45) {
			System.out.println("D");
		}
		if (a > 45 && a <= 65) {
			System.out.println("C");
		}
		if (a >= 66 && a <= 80) {
			System.out.println("B");
		}
		if (a >= 81 && a <= 100) {
			System.out.println("A");
		}
	}

}

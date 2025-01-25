import java.util.Scanner;

//Write a program to check if a number is divisible by both 3 and 5 using if statements.
public class if9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a % 3 == 0 && a % 5 == 0) {
			System.out.println("Number is dividable by 3 and 5");
		} else {
			System.out.println("Number is NOT dividable by 3 and 5");

		}
	}

}

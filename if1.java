
//In the following projects you are gonna see exerscises that are from easy difficulty to get comfortable with the language
//Write a program to check if a number is positive, negative, or zero using if statements.
// I have studied the language in school so some stuff might be missing
import java.util.Scanner;

public class if1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a == 0) {
			System.out.println("Number is equal to 0");

		} else if (a > 0) {
			System.out.println("Number is bigger then 0");

		} else {
			System.out.println("Number is smaller then 0");
		}
	}

}

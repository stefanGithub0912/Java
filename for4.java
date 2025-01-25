import java.util.Scanner;
//Write a program to print all even numbers between 1 and 50.

public class for4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}

import java.util.Scanner;
//Write a program to print all odd numbers between 1 and 50 using a while loop.

public class while8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 1;
		while (a <= 50) {
			if (a % 2 != 0) {
				System.out.println(a);
			}
			a++;
		}
	}

}

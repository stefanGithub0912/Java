import java.util.Scanner;
//Write a function to find the maximum of two numbers.

public class method2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		System.out.println("Max is -> " + max);
	}

	public static int max(int max) {
		return max;
	}

}

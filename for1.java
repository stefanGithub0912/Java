import java.util.Scanner;
//Write a program to find the sum of the squares of all odd numbers from 1 to 100.

public class for1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i = 1;i < 100;i++) {
			if(i % 2 == 1) {
				sum += Math.sqrt(i);

			}
		}
		System.out.println(sum+" <- Sum of square root from numbers 1 to 100;");
	}

}

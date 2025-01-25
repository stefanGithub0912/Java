//Write a program to keep calculating and displaying the average of user-entered numbers until the user enters 0.
import java.util.Scanner;
public class while2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= -1;
		double avr = 0;int i = 0;
		while(a != 0) {
			a = sc.nextInt();
			avr += a;
			i++;
			System.out.println("Avrege-> "+avr/i);
		}
		
	}

}

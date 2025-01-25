import java.util.Scanner;

//Implement a program to compute the greatest common divisor (GCD) of two numbers using the Euclidean algorithm and a while loop.
public class while1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("1 number:");
        int num1 = sc.nextInt();
        System.out.println("2 number:");
        int num2 = sc.nextInt();
        int a = Math.abs(num1);
        int b = Math.abs(num2);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("The GCD of " + num1 + " and " + num2 + " is " + a);
	}

}

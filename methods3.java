import java.util.Scanner;
//Implement a recursive function to compute the power of a number (a^b).
public class methods3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number: ");
        double a = sc.nextInt();
		System.out.println("Power of number: ");
        double b = sc.nextInt();

        double numpow = powerNum(a,b);
        System.out.println("Result --> "+ numpow);
}
	static double powerNum(double a,double b) {
		double num = Math.pow(a,b);
		return num;
	}
}

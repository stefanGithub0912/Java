
//Write a function to calculate the factorial of a number.
import java.util.Scanner;

public class method4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		factoriel(a);
	}

	static int factoriel(int a) {
		int factoriel = 1;
		for (int i = 0; i < a; i++) {
			factoriel *= a - i;
		}
		System.out.println("Factoriel of number -> " + factoriel);
		return factoriel;
	}

}

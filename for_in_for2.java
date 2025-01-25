import java.util.Scanner;
//Implement a program to find all Pythagorean triples (a, b, c) where a^2 + b^2 = c^2 and a, b, c <= 20.

public class for_in_for2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        for (int a = 1; a <= 20; a++) {
            for (int b = a; b <= 20; b++) { // Start b from a to avoid duplicate pairs
                for (int c = b; c <= 20; c++) { // Start c from b to ensure c is the largest
                    if (a * a + b * b == c * c) {
                        System.out.println("(" + a + ", " + b + ", " + c + ")");
                    }
                }
            }
        }
	}

}

import java.util.Scanner;
//Print the pyramid using nested for loops
public class for_in_for1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of rows: ");
		int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
	}

}

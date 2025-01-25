import java.util.Scanner;

//Write a program to check if a character is a vowel or consonant using if statements.
public class if5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a single character: ");
		String a = sc.nextLine().toLowerCase();
		if (a.length() == 1) {
			if ("aeiou".indexOf(a) != -1) {
				System.out.println(a + " - is a vowel");
			} else {
				System.out.println(a + " - is a consonant");
			}
		} else {
			System.out.println("ONLY 1 CHARACTER");
		}

	}

}

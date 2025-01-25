import java.util.Scanner;
//Create a function isPalindrome(int n) that returns true if the given number is a palindrome (e.g., 121, 1221).
public class methods1 {
    public static boolean isPalindrome(int n) {
        if (n < 0) {
            return false;
        }
        int original = n; 
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;  
            n /= 10; 
        }
        return original == reversed;
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

}
    }

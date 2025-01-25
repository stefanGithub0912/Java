import java.util.Scanner;
//Write a function sumDigits(int n) to calculate the sum of the digits of a number. 
//Then use it in a program to check if the number is a "magic number" (where repeatedly summing its digits results in 1, e.g., 19 -> 1+9=10 -> 1+0=1).
public class methods2 {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int magicNum = Magic(number);
        
        System.out.println(magicNum);

    }
    public static int Magic(int number) {
    	int sum = 0;
    	int temp = 0;

    	while(number != 0) {
    		sum += number % 10;
    		number /= 10;
    	}
    	int magic = 0;
    	while(sum != 0) {
    		magic += sum % 10;
    		sum /= 10;
    	}
    	int magic2 = 0;
    	while(magic != 0) {
    		magic2 += magic % 10;
    		magic /= 10;
    	}
    	return magic2;
    }

}

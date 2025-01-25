package java_trudno;
import java.util.Scanner;
//Напишете програма, която проверява дали дадено число е перфектно число. 
//Перфектно число е такова, при което сумата от делителите му (без самото число) е равна на самото число. Например, 6 е перфектно число, защото 
//1+2+3=6
public class zad1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		isPerfect(n);
	}
	static boolean isPerfect(int n) {
		boolean isPrf = false;
		int sum = 0;
		for(int i = 1;i<n;i++) {
			if(n % i == 0) {
				sum += i;
			}
		}
		if(sum == n) {
			isPrf = true;
			System.out.println("Number is perfect! ");
		}else {
			System.out.println("Number is NOT perfect! ");
		}
		return isPrf;
		
	}
}

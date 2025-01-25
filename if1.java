import java.util.Scanner;
//Write a program to determine the type of a triangle (equilateral, isosceles or invalid) based on the lengths of its sides.
public class if1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1va strana");
    	int a = sc.nextInt();
		System.out.println("2ra strana");
    	int b = sc.nextInt();
		System.out.println("3ta strana");
    	int c = sc.nextInt();
    	if (a + b > c && a + c > b && b + c > a) {
    		System.out.println("Triangle is invalid");
    	}else {
    	if(a == b && a == c) {
    		System.out.println("Triangle is equilateral");
    	}
    	if(a == b || b == c || a == c) {
    		System.out.println("Triangle is isosceles");
    	}
    	}
	}

}

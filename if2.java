import java.util.Scanner;
//Create a simple calculator program that takes two numbers and an operator (+, -, *, /) as input and performs the corresponding operation.

public class if2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("First number");
		int a = sc.nextInt();
		
		System.out.println("Choose function: * , / , + , - ");
		char function = sc.next().charAt(0);
		
		System.out.println("Second number");
		int b = sc.nextInt();

		
		if(function == '*') {
			System.out.println(a * b);
		}
		if(function == '+') {
			System.out.println(a + b);	
				}
		if(function == '-') {
			System.out.println(a - b);
		}
		if(function == '/') {
			System.out.println(a / b);
		}
	}

}

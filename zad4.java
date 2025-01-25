package java_trudno;
import java.util.Scanner;
//Напишете програма, която приема числа от потребителя, 
//докато не бъде въведено отрицателно число. Програмата трябва да изчисли прогресивната сума 
//и да проверява дали сумата остава четно число след всяко добавяне.
public class zad4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int sum = 0;
		while(true) {
			a = sc.nextInt();
			if (a < 0) { 
                break; 
            }
			sum += a;
			if (isEven(sum)) {
                System.out.println("Сумата " + sum + " е четно число.");
            } else {
                System.out.println("Сумата " + sum + " е нечетно число.");
            }
		}
		System.out.println(sum);
	}
	static boolean isEven(int a) {
		return a % 2 == 0;
	}

}

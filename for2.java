import java.util.Scanner;
//Print all numbers from 1 to 100 that are divisible by 3 or 5 but not both.

public class for2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 1;i < 100;i++) {
			if(i % 3 == 0 || i % 5 == 0 && !(i % 3 == 0 && i % 5 == 0)) {
				System.out.println(i);
			}
			
		}
	}

}

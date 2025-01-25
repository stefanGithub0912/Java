package java_trudno;
import java.util.Scanner;
//Създайте програма, която генерира и отпечатва таблица на умножение в пирамидален формат.
/*
1
2 4
3 6 9
4 8 12 16
5 10 15 20 25
*/
public class zad3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a [][] = new int[5][5];
		 for (int i = 1; i <= a.length; i++) {       
	            for (int j = 1; j <= i; j++) {
	                System.out.print((i * j) + " "); 
	            }
	            System.out.println(); 
	        }
	}

}

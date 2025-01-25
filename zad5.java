package java_trudno;
import java.util.Scanner;
//Създайте програма, която валидира дали дадена матрица (двумерен масив) е правилна (всеки ред има еднакъв брой елементи). 
//Ако е валидна, изчислете сумата на всеки ред.
public class zad5 {

    public static boolean isMatrixValid(int[][] a) {
        int columnCount = a[0].length; 
        for (int i = 1; i < a.length; i++) {
            if (a[i].length != columnCount) {
                return false;
            }
        }
        return true; 
    }

    public static void printRowSums(int[][] a) {
        System.out.println("Сумите на редовете са:");
        for (int i = 0; i < a.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < a[i].length; j++) {
                rowSum += a[i][j];
            }
            System.out.println("Сума на ред " + (i + 1) + ": " + rowSum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Redove: ");
        int rows = sc.nextInt();
        System.out.print("Koloni: ");
        int cols = sc.nextInt();
        int[][] a = new int[rows][cols];
        System.out.println("Elementi:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        if (isMatrixValid(a)) {
            System.out.println("Матрицата е правилна.");
            printRowSums(a);
        } else {
            System.out.println("Матрицата не е правилна. Редовете имат различен брой елементи.");
        }
    }
}

package java_trudno;
import java.util.Scanner;
//Напишете програма, която намира най-дългата низходяща последователност в даден масив от числа.
public class zad2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Amount of numbers");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Input numbers");
		for(int i = 0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		int niz = nizhodqshta(a);
		System.out.println("Longest niz downgrading: ");
		System.out.println(niz);
	}
	static int nizhodqshta(int a[]) {
		int i = 1;int j = 1;int k = 1;
        while (i < a.length) {
            if (a[i] < a[i - 1]) { 
                j++; 
                k = Math.max(k, j); 
            } else {
                j = 1; 
            }
            i++;
        }
        return k;
	}

}

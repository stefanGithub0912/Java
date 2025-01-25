import java.util.Scanner;
import java.util.Arrays;

//Write a program to find the second largest and second smallest elements in an array.

public class array1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) array[i] = sc.nextInt();
        if (n < 2) return;
        Arrays.sort(array);
        int secondSmallest = Integer.MAX_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
        	if (array[i] != array[0]) {
        		secondSmallest = array[i]; 
        		break; 
        		}
        }
        for (int i = n - 2; i >= 0; i--) {
        	if (array[i] != array[n - 1]) {
        		secondLargest = array[i]; 
        		break; 
        		}
        }
        if (secondSmallest != Integer.MAX_VALUE && secondLargest != Integer.MIN_VALUE) {
            System.out.println("Second smallest: " + secondSmallest);
            System.out.println("Second largest: " + secondLargest);
        } else System.out.println("Not enough distinct elements.");
	}

}

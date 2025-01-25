import java.util.Scanner;
import java.util.Arrays;
//Check if two arrays are permutations of each other (contain the same elements in any order).

public class array2 {
   	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Numbers in array number 1:");
		int a = sc.nextInt();
		int arr[] = new int [a];
		System.out.println("Numbers in array number 2:");
		int b = sc.nextInt();
		int arr1[] = new int [b];
		System.out.println("Input numbers in array number 1:");
		for(int i = 0; i < arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Input numbers in array number 1:");
		for(int i = 0; i < arr1.length;i++) {
			arr1[i] = sc.nextInt();
		}
        Arrays.sort(arr1);
        Arrays.sort(arr);

        if(arr.length != arr1.length) {
    		System.out.println("Arrays are NOT permutations of each other");

        }else {
    		System.out.println("Arrays are permutations of each other");

        }
	}

}

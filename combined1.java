//Write a program that sorts an array using the Bubble Sort algorithm and implements it in a function.
import java.util.Scanner;

public class combined1 {
    static void bubbleSort(int arr[], int n){
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
    }
    static void printArray(int arr[], int size){
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Numbers in array");
    	int a = sc.nextInt();
        int arr[] = new int [a];
        for(int i = 0;i< arr.length;i++) {
        	arr[i] = sc.nextInt();
        }
        int n = arr.length;
        bubbleSort(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }
	}

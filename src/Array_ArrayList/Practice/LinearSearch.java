package Array_ArrayList.Practice;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        System.out.print("Enter the size of array: ");
        n = in.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter " + n +  " elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        int key;
        System.out.println("Enter the element you want to search: ");
        key = in.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                System.out.println("Element found at index: " + i);
                System.out.println("Element found at position: " + (i+1));
            }
        }
    }
}

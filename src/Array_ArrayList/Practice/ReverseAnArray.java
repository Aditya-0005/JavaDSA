package Array_ArrayList.Practice;

import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        System.out.println("Enter the size of array: ");
        n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = n-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }


    }
}

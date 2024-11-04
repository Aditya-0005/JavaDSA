package Array_ArrayList.Practice;

import java.util.Scanner;

public class MaximumElement {
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

        int max = 0;

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1] > arr[i])
                max = arr[i+1];
        }

        System.out.println("Maximum element in array is: " + max);
    }
}

package Array_ArrayList.Practice;

import java.util.Scanner;

public class MinimumElement {
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

        int min = arr[0];

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1] < arr[i])
                min = arr[i+1];
        }

        System.out.println("Miniumum element in array is: " + min);
    }
}

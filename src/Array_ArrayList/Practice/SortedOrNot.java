package Array_ArrayList.Practice;

import java.util.Scanner;

public class SortedOrNot {
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

        boolean isSorted = true;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1] < arr[i])
                isSorted = false;
        }

        if(isSorted)
            System.out.println("Array is sorted.");
        else
            System.out.println("Array is not sorted.");
    }
}

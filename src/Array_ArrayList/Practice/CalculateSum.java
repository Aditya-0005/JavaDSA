package Array_ArrayList.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class CalculateSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        System.out.println("Enter the size of array: ");
        n = in.nextInt();

        float sum = 0;
        float[] arr = new float[n];
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextFloat();
            sum = sum + arr[i];
        }

        System.out.println(Arrays.toString(arr) + " and sum of them is: " + sum);
    }
}

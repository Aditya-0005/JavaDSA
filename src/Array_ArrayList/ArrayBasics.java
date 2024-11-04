package Array_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr     =     new int[5]; //size is compulsary
        //declaration       //object is being created
        // of array         //in heap memory
        //in stack

        System.out.println(arr[4]);

//        String[] arr1 = new String[5];
//        System.out.println(arr1[4]);

        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));

//        for (int num : arr) {             //enhanced for loop
//            System.out.println(num + " ");
//        }                                           //both are same
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i] + " ");
//        }
    }
}

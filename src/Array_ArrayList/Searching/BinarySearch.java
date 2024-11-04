package Array_ArrayList.Searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        System.out.println("Enter the size of array: ");
        n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        int key;
        System.out.println("Enter the element you want to search: ");
        key = in.nextInt();

        System.out.println(Binarysearch(arr,n,key));
    }

    static int Binarysearch(int[] arr, int n, int key){

        int start = 0;
        int end = arr.length-1;
        while(start <= end){

            int mid = start + (end - start)/2;

            if(arr[mid] == key)
                return mid;

            else if(arr[mid] < key)
                start = mid + 1;

            else
                end = mid - 1;
        }

        return -1;
    }
}

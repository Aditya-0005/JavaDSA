package Array_ArrayList.Searching;

import java.util.Scanner;

//Don't know that the array is in ascending or decending order

public class OrderAgnosticBinarysearch {
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

        System.out.println(orderagnosticBS(arr,n,key));

    }

    static int orderagnosticBS(int[] arr, int n, int key){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){

            int mid = start + (end - start)/2;

            if(arr[mid] == key)
                return mid;

            if(isAsc){
                if(arr[mid] < key)
                    start = mid + 1;

                else
                    end = mid - 1;
            }
            else{
                if(arr[mid] > key)
                    start = mid + 1;
                else
                    end = mid - 1;
            }


        }

        return -1;
    }
}

package Array_ArrayList.Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        System.out.println("Enter the size of array: ");
        n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter "+ n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int key;
        System.out.println("Enter the number you want to search: ");
        key = in.nextInt();

//        int ans = linearsearch(arr,n,key);

        System.out.println(linearsearch1(arr,n,key));
    }

    static int linearsearch(int[] arr, int n, int key){

        if(n == 0){
            return -1;
        }
        for (int i = 0; i < n; i++) {
            if(arr[i] == key)
                return i;
        }
        return -1;
    }



    static boolean linearsearch1(int[] arr, int n,int key){
        if(n == 0){
            return false;
        }

        for (int i = 0; i < n; i++) {
            if(arr[i] == key)
                return true;
        }

        return false;
    }
}

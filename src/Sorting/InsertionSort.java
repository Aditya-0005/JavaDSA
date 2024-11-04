package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {7,3,9,2,10,1,-12,5,-4};

        Sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void Sort(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            //we can easily get best case time comp if we are going from back to front
            //if our last element in partially selected array is not less than previous
            // we can easily break loop because all the elements behind it are sorted
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1])
                    swap(arr,j,j-1);
                else
                    break;
            }
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
    }
}

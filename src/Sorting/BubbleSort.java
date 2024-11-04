package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {5,2,6,3,6,8,8,3,1};
        Sort(arr);
        System.out.println(Arrays.toString(arr));

        DecSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Sort(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j-1] > arr[j])
                    swap(arr,j-1, j);
            }
        }

    }

    static void DecSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]){
                    swap(arr,i,j);
                }
            }
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}

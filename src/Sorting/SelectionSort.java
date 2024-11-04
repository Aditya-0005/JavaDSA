package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {6,4,8,2,9,3,5};

        Sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void Sort(int[] arr){
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            max = Maxindex(arr,0,last);
            swap(arr,max,last);
        }

    }

    static int Maxindex(int[] arr,int first,int last){
        int max = 0;
        for (int i = first; i <= last; i++) {
            if(arr[max] < arr[i])
                max = i;
        }
        return max;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

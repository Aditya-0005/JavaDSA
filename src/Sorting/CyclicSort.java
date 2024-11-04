package Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};

        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Sort(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]-1;     //this is the correct index of current element
            if(arr[i] != arr[correct]){     //check until current element is at correct index
                swap(arr,i,correct);
            }
            else                        //increment only when current element is at correct index
                i++;
        }


    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}

package Leetcode;

import java.util.ArrayList;

public class Leetcode268 {

    //Missing number in an array containing [0 to N] elements
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};



        System.out.println(MissingNumber(arr));
    }

    static int MissingNumber(int[] arr){
        int i = 0;
        while(i <= arr.length-1){
            int correct = arr[i]-1;
            if(arr[i] == arr.length){
                i++;
                continue;
            }
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else
                i++;
        }

        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1)
                return j;
            if(j == arr.length-1)
                return j+1;
        }
        return -1;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

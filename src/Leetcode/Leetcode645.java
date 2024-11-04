package Leetcode;

import java.util.Arrays;

import static Leetcode.Leetcode268.swap;

public class Leetcode645 {
    public static void main(String[] args) {
        int[] arr = {4,1,4,2,3};

        System.out.println(Arrays.toString(Mismatch(arr)));
    }

    static int[] Mismatch(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else
                i++;
        }

        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1){
                return new int[]{arr[j],j+1};
            }
        }
        return new int[]{-1,-1};
    }
}

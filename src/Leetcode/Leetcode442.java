package Leetcode;

import java.util.ArrayList;
import java.util.List;

import static Leetcode.Leetcode287.swap;

public class Leetcode442 {
    public static void main(String[] args) {
        int[] arr = {1,4,3,5,2,3,1};

        System.out.println(allduplicate(arr));
    }

    static List<Integer> allduplicate(int[] arr){
        int i=0;
        List<Integer> list = new ArrayList<>();
        while(i < arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1)
                list.add(arr[j]);
        }
        return list;
    }
}

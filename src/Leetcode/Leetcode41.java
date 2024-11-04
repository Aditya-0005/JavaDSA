package Leetcode;

import static Leetcode.Leetcode268.swap;

public class Leetcode41 {
    public static void main(String[] args) {
        int[] arr = {2,1};

        System.out.println(smallestpositive(arr));
    }

    static int smallestpositive(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i]-1;

            if(arr[i] != arr[correct] && arr[i] > 0 && arr[i] < arr.length){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1)
                return j+1;
        }
        return arr.length+1;
    }
}

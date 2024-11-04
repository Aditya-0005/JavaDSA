package Leetcode;

public class Leetcode287 {
    public static void main(String[] args) {
        int[] arr = {1,5,3,4,2,3};

        int ans = Duplicate(arr);
        System.out.println(ans);
    }

    static int Duplicate(int[] arr){
        int i = 0;
        while(i < arr.length-1){
            int correct = arr[i]-1;

            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else
                i++;
        }

        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1)
                return arr[j];

        }
        return -1;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

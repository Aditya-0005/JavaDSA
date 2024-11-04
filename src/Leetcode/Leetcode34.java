package Leetcode;

import java.util.Arrays;

public class Leetcode34 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,4,4,4,4,5,8};

        int target = 9;

        int ans1 = Firstindex(arr,target);
        int ans2 = LastIndex(arr,target);

        System.out.println(Arrays.toString(new int[]{ans1, ans2}));
    }

    static int Firstindex(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                ans = mid;
                end = mid-1;
            }
            else if(arr[mid] < target){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }

        return ans;
    }

    static int LastIndex(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                ans = mid;
                start = mid+1;
            }
            else if(arr[mid] < target){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }

        return ans;
    }
}

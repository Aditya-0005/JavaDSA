package Leetcode;

public class Leetcode33 {
    public static void main(String[] args) {
        int[] arr = {1,3};

        int target = 0;

        System.out.println(search(arr,target));
    }

    static int search(int[] arr, int target){
        int start = 0;
        int end = 0;
        end = findpivot(arr);
        int newstart = end+1;
        int mid = 0;

        while(start <= end){
            mid = start + (end - start)/2;

            if(arr[mid] == target)
                return mid;
            else if(arr[mid] < target)
                start = mid+1;
            else
                end = mid - 1;
        }

        int newend = arr.length-1;

        while(newstart <= newend){
            mid = newstart + (newend - newstart)/2;

            if(arr[mid] == target)
                return mid;
            else if(arr[mid] < target)
                newstart = mid+1;
            else
                newend = mid - 1;
        }
        return -1;
    }

    static int findpivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int mid = 0;

        while(start < end){
            mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1])
                return mid;
            else if(arr[start] == arr[mid])
                start = mid+1;
            else if(arr[start] > arr[mid])
                end = mid-1;
            else
                start = mid;

        }
        return start;
    }
}

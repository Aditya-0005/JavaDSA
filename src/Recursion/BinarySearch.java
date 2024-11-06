package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,13,16};
        int target = 5;
        System.out.println(BS(arr,0,arr.length-1,target));
    }

    static int BS(int[] arr, int start, int end, int target){
        int mid = start + (end - start)/2;

        if(start > end){
            return -1;
        }
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] < target){
            return BS(arr,mid+1,end,target);
        }
        else
            return BS(arr,start,mid-1,target);

    }
}

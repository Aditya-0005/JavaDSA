package Array_ArrayList;

public class CeilingElement {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,9,12,14};

        int target = 15;

        System.out.println(ceiling(arr,target));
    }

    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int mid = 0;

        //when the target is greater than the largest number in the array.
        if(target > arr[arr.length-1])
            return -1;

        //Normal binary search and return start element
        while(start <= end){
            mid = start + (end - start)/2;

            if(arr[mid] == target){
                return arr[mid];
            }
            else if(arr[mid] < target){
                start = mid+1;
            }
            else
                end = mid - 1;
        }
        return arr[start];
    }
}

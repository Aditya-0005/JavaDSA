package Array_ArrayList;

public class FloorElement {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,9,12,14};

        int target = 1;

        System.out.println(Floor(arr,target));
    }

    static int Floor(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int mid = 0;

        if(target < arr[0])
            return -1;

        while(start <= end){
            mid = start + (end - start)/2;

            if(arr[mid] == target){
                return target;
            }
            else if(arr[mid] < target){
                start = mid+1;
            }
            else
                end = mid - 1;
        }
        return arr[end];
    }
}

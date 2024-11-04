package Array_ArrayList;

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,9,12,14};

        int target = 8;

        System.out.println(ceiling(arr,target));
    }

    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int mid = 0;

        //when the target is greater than the largest number in the array.
        while(start <= end){
            mid = start + (end - start)/2;

            if(arr[mid] < target){
                start = mid+1;
            }
            else
                end = mid - 1;
        }
        return arr[start % arr.length];
    }
}

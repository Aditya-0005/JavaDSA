package Array_ArrayList.GoodLevelQuestions;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {3,5,3,2,0};

        System.out.println(peakindexBS(arr));
    }

    //brute force approach
    static int peakindex(int[] arr){
        for(int i=1; i<arr.length-1; i++){
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                return i;
            }
        }
        return -1;
    }

    static int peakindexBS(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1])
                end = mid;
            else
                start = mid+1;
        }
        return start;
    }
}

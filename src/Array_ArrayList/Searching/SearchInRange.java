package Array_ArrayList.Searching;

import static java.lang.System.exit;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 5;
        int start = 2;
        int end = 5;

        int ans = search(arr, target, start, end);
        if(ans == Integer.MAX_VALUE) {
            System.out.println("Not Found");
            exit(1);
        }
        System.out.println(ans);
    }

    static int search(int[] arr, int target, int start, int end){
        if(arr.length == 0)
            return Integer.MAX_VALUE;

        for (int i = start; i <= end; i++) {
            if(target == arr[i]){
                return i;
            }
        }

        return Integer.MAX_VALUE;
    }

    public static class BinarySearch {
    }
}

package Array_ArrayList.MultidimensionalArray;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class FullySortedBinarySearch {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,8,9},
                {10,11,12,13},
                {14,15,16,18},
        };

        int target = 7;

        System.out.println(Arrays.toString(Search(arr,target)));
    }

    static int[] Search(int[][] arr, int target){
        int r1 = arr[0].length-1;
        int r2 = arr.length-1;
        int c1 = 0;
        int c2 = arr[0].length-1;
        int end = arr[r1][c2];

        while((r1 >= r2)  && (c1 <= c2)){
            if(target > arr[r1][c2] && target < arr[r2][c1]) {
                r1++;
                r2--;
            }

            else if(arr[r1][c2] < target) {
                if(arr[r1][c2] == end){
                    return new int[]{-1,-1};
                }
                r1++;
            }

            else if(arr[r1][c2] == target)
                return new int[]{r1,c2};
            else if(arr[r2][c1] == target)
                return new int[]{r2,c1};
            else if(arr[r2][c1] > target)
                r2--;
            else if(arr[r2][c1] < target)
                c1++;
            else if(arr[r1][c2] > target)
                c2--;
        }
        return new int[]{-1,-1};
    }
}

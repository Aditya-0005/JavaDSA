package Array_ArrayList.MultidimensionalArray;

import java.util.Arrays;

public class BinarySearch2 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
        };

        int target = 5;

        System.out.println(Arrays.toString(removerow(arr,target)));
    }

    static int[] search(int[][] arr, int row, int cstart, int cend, int target){
        while(cstart <= cend){
            int mid = cstart + (cend - cstart)/2;

            if(arr[row][mid] == target)
                return new int[]{row,mid};
            else if(arr[row][mid] < target)
                cstart = mid + 1;
            else
                cend = mid - 1;
        }
        return new int[]{-1,-1};
    }

    static int[] removerow(int[][] arr, int target){
        int rows = arr.length;
        int cols = arr[0].length;

        if(rows == 1)
            search(arr,0,0,cols,target);

        int rstart = 0;
        int rend = rows-1;
        int cMid = cols/2;

        //while this is true, it will have more than 2 rows which we are trying to eliminate
        while(rstart < (rend-1)){
            int mid = rstart + (rend - rstart)/2;

            if(arr[mid][cMid] == target)
                return new int[]{mid,cMid};
            else if(arr[mid][cMid] < target)
                rstart = mid;
            else
                rend = mid;
        }

        //Now we have two rows, so we need to apply binary search on that to find the target
        //check whether the target is in col of two rows
        if(arr[rstart][cMid] == target)
            return new int[]{rstart,cMid};
        if(arr[rstart+1][cMid] == target)
            return new int[]{rstart+1,cMid};

        //Search in 1st half
        if(target <= arr[rstart][cMid-1]){
            return search(arr, rstart,0,cMid-1,target);
        }

        //Search in 2nd half
        if(target >= arr[rstart][cMid+1] && target <= arr[rstart][cols-1]){
            return search(arr, rstart,cMid+1,cols-1,target);
        }

        //search in 3rd half
        if(target <= arr[rstart+1][cMid-1]){
            return search(arr,rstart+1,0,cMid-1,target);
        }

        //search in 4th half
        else
            return search(arr,rstart+1,cMid+1,cols-1,target);



    }
}

package Array_ArrayList.MultidimensionalArray;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50},
                {36,39,41,52},
        };

        int target = 32;


        System.out.println(Arrays.toString(BS(arr,target)));
    }

    static int[] BS(int[][] arr, int target){
        int row = 0;
        int col = arr[0].length-1;

        while(row <= arr.length-1 && col >= 0){
            if(arr[row][col] == target){
                return new int[]{row,col};
            }
            else if(arr[row][col] > target){
                col--;
            }
            else if(arr[row][col] < target){
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}

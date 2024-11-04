package Array_ArrayList.Searching;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        int target = 99;

        System.out.println(Arrays.toString(search(arr, target)));
    }

    //return type should be int[] to return an array
    static int[] search(int[][] arr, int target){
        if(arr.length == 0){
            return new int[]{Integer.MIN_VALUE};
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target) {
                    //return single array contain position of the 2d element
                    //declaration is imp
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{Integer.MIN_VALUE};

    }
}

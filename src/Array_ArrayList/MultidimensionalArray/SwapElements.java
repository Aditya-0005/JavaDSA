package Array_ArrayList.MultidimensionalArray;

import java.util.Arrays;

public class SwapElements {
    public static void main(String[] args) {
        int[] arr = {1,6,4,9,0,3};

        swap(arr, 3,5);

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

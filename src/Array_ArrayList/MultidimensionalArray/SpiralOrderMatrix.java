package Array_ArrayList.MultidimensionalArray;

public class SpiralOrderMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},


        };

        int row_start = 0;
        int row_end = arr.length-1;
        int col_start = 0;
        int col_end = arr[0].length-1;

        while(row_start <= row_end){

            for (int i = row_start; i <= col_end; i++) {
                System.out.print(arr[row_start][i] + " ");
            }
            row_start++;

            for (int i = row_start; i <= row_end; i++) {
                System.out.print(arr[i][col_end] + " ");
            }
            col_end--;

            for (int i = col_end; i >= col_start ; i--) {
                System.out.print(arr[row_end][i] + " ");
            }
            row_end--;

            for (int i = row_end; i >= row_start ; i--) {
                System.out.print(arr[i][col_start] + " ");
            }
            col_start++;
        }


    }
}

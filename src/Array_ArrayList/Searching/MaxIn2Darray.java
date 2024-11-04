package Array_ArrayList.Searching;

public class MaxIn2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        System.out.println(Max(arr));
    }

    static int Max(int[][] arr){
        if(arr.length == 0){
            return -1;
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                    if(arr[i][j] > max)
                        max = arr[i][j];
            }
        }

 //       enhanced for loop of above loops
//        for (int[] ints : arr) {
//            for (int element : ints) {
//                if (element > max)
//                    max = element;
//            }
//        }

        return max;
    }
}

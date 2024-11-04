package Leetcode;

public class Leetcode1672 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {3,2,1},
        };

        System.out.println(Maxwealth(arr));
    }

    static int Maxwealth(int[][] arr){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = 0; j < arr[i].length; j++) {
                temp = temp + arr[i][j];
                if(temp > max){
                    max = temp;
                }
            }
        }
        return max;
    }
}

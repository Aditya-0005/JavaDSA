package Leetcode;

public class Leetcode1295 {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};

        System.out.println(findnumbers2(arr));
    }

    static int findnumbers2(int[] arr){
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if(isEven(arr[i])){
                ans = ans+1;
            }
        }
        return ans;
    }

    static int findnumbers(int[] arr){
        int count = 0;
        int n = 0;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            n = arr[i];

            while(n > 0){
                n /= 10;
                count++;
            }

            if((count % 2) == 0){
                ans = ans + 1;
            }
        }

        return ans;
    }

    static boolean isEven(int num){
        if(((int)(Math.log10(num)) + 1) % 2 == 0){
            return true;
        }
        return false;
    }
}

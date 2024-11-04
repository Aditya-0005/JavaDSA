package Array_ArrayList.MultidimensionalArray;

public class PalindromicArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,3,2,1};

        System.out.println(isPalindrome(arr,0,arr.length-1));
    }

    static boolean isPalindrome(int[] arr, int start, int end){
        while(start <= end){
            if(arr[start] != arr[end])
                return false;
            start++;
            end--;
        }
        return true;
    }
}

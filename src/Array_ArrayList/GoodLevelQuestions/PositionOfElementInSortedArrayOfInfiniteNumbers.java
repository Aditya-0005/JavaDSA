package Array_ArrayList.GoodLevelQuestions;

//array contains infinite numbers so we can't use arr.length and we don't know the end index
public class PositionOfElementInSortedArrayOfInfiniteNumbers {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35};

        int target = 15;

        System.out.println(findelement(arr,target));

    }

    static int findelement(int[] arr, int target){
        int start = 0;
        int end = 1;

        //increase the end exponentially bcz in binary search everytime the array is divided by 2;
        //so we are doing just opposite by multiplying by 2

        //O(log(n))
        while(arr[end] < target){
            int newstart = end+1;
            //(end - start+1) is to find size of previous array
            //here we need to use old start value to calculate new end, so we created newstart
            end = end + (end - start + 1)*2;
            start = newstart;
        }

        //O(Log(n))
        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target)
                start = mid+1;
            else
                end = mid - 1;
        }

        return -1;

    }
}

package Array_ArrayList.Searching;

public class SearchInRangeString {
    public static void main(String[] args) {
        String str = "ArrayList";
        char target = 'r';
        int start = 3;
        int end = str.length()-1;

        System.out.println(search(str,target,start,end));
    }

    static boolean search(String str, char target, int start, int end){
        if(str.isEmpty())
            return false;

        for (int i = start; i <= end; i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }

        return false;
    }
}

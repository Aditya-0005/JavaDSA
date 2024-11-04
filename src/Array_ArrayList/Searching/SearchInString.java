package Array_ArrayList.Searching;

public class SearchInString {
    public static void main(String[] args) {
        String str = "Hi there";
        char target = 't';

        System.out.println(search2(str,target));
    }

    static boolean search2(String str, char target){
        if(str.isEmpty()){
            return false;
        }

        //tocharArray makes character array of string
        //like "hello" == ['h', 'e', 'l', 'l', 'o']
        for( char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }

        return false;
    }

    static boolean search(String str, char target){
        if(str.isEmpty()){
            return false;
        }

        for (int i = 0; i < str.length()-1; i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }

        return false;
    }
}

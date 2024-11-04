package String_StringBuilder;

public class Palindrome {
    public static void main(String[] args) {
        String str = "";
        System.out.println(palindromeornot(str));
    }

    static boolean palindromeornot(String str){
        str = str.toLowerCase();
        //here we are just using two pointer approach to check whether the string is palindrome or not
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}

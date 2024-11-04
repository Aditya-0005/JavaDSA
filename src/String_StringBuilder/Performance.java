package String_StringBuilder;

public class Performance {
    public static void main(String[] args) {
        //it will take O(N^2) time complexity,
        //so to solve this problem we use StringBuilder
        String s = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            s = s + ch;
        }
        System.out.println(s);
    }
}

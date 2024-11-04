package String_StringBuilder;

import java.util.Arrays;

public class StringBD {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            builder.append(ch);
        }
        //String builder while printing calls toString method so there's no need to call toString explicitly
        System.out.println(builder);
        builder.replace(3,7,"12345");
        System.out.println(builder);
        builder.delete(12,16);
        System.out.println(builder);
        builder.reverse();
        System.out.println(builder);


        String name = "Kunal Kushwaha";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.isEmpty());
        System.out.println(name.length());
        String name1 = "       Kunal      ";
        System.out.println(name1.strip());
        String name2 = "Kunal kushwaha hello world";
        System.out.println(Arrays.toString(name2.split(" ")));
    }
}

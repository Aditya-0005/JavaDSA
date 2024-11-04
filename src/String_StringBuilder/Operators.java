package String_StringBuilder;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 1);
        System.out.println("a" + 1);
        System.out.println("Kunal" + new ArrayList<>());
//        System.out.println("Kunal" + new Integer(54));
        //+ operator is defined only when datatype is primitive or atleast one of the value is String
//        System.out.println(new ArrayList<>() + new Integer(54));
        System.out.println(new ArrayList<>() + "" + new Integer(44));
    }
}

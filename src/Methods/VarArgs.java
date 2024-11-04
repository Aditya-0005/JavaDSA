package Methods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun("HEllo",3,4,5,6,7,8);
        change(2,3,"HEllo", "Hi");
        fun(2,3,4,5,6,7);
    }

    static void change(int a, int b, String ...v){
        System.out.println( a + " " + b + " " + Arrays.toString(v));
    }

    static void fun(String a, int ...v){
        System.out.println(a + " " + Arrays.toString(v));
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}

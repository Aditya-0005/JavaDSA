package Basics;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = (int)(65.34f);
        System.out.println(num);

        int a = 257;
        byte b = (byte)(a);     //b is doing remainder of 257 from max range 256
        System.out.println(b);      //byte range is 257


        byte c = 40;
        byte d = 50;
        byte e = 20;
        int f = a*b/c;      //jdk itself promoting the intermediate result to int
                            //so that the operation can be done smoothly
        System.out.println(f);

    }
}

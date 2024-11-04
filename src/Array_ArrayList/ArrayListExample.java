package Array_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

//        list.add(54);
//        list.add(23);
//        list.add(5124);
//        list.add(683);
//        list.add(7532);
//        list.add(7365);
//
//        System.out.println(list);       //internally, it is calling toString object itself
//        list.set(2, 0);
//        System.out.println(list);
//        System.out.println(list.contains(1));
//        System.out.println(list.indexOf(7532));

        for (int i = 0; i < 10; i++) {
            list.add(in.nextInt());
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println(list.size());
    }
}

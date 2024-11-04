package Basics;

import java.util.Scanner;

public class FirstProgram {
    public static void main(String[] args) {
        System.out.println("hello world");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter data: ");
//        System.out.print("Enter your rollno: ");
//        int rollno = input.nextInt();
//        System.out.println("Your rollno is: " + rollno);
//
//        int money = 234_000_000;
//        System.out.println(money);

//        float marks = input.nextFloat();
//        System.out.println(marks);

//        boolean b = input.nextBoolean();
//        System.out.println(b);

        long a = input.nextLong();
        System.out.println(a);
    }
}

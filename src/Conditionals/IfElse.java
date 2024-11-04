package Conditionals;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Greatest of three numbers
        System.out.println("Enter three numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if(a>b && a>c)
            System.out.println(a + " is greatest");
        else if(b>a && b>c)
            System.out.println(b + " is grestest");
        else
            System.out.println(c + " is grestest");

    }
}

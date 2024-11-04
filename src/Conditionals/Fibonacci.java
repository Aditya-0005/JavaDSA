package Conditionals;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Fibonacci number
        System.out.println("Enter how many numbers you want: ");
        int n = in.nextInt();

//        int i = 2;
//        int a = 0;
//        int b = 1;
//        int c = a + b;
//        System.out.println(a + " ");
//        System.out.println(b + " ");
//
//        while(i <= n){
//            c = a + b;
//            a = b;
//            b = c;
//            System.out.println(c + " ");
//            i++;
//        }


        //give me nth fibonacci number

        int a = 0;
        int b = 1;
        int i = 2;
        int c = 0;
        while(i <= n){
            c = a + b;
            a = b;
            b = c;
            i++;
        }
        System.out.println(n +"th fibonacci number is: " + c);
    }
}

package Conditionals;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        while(true) {
            System.out.println("Press x or X to terminate the calculator.");
            System.out.println("Enter the operation you want to perform: ");
            char op = in.next().charAt(0);

            if (op == 'x' || op == 'X'){
                break;
            }

            System.out.println("Enter the first number: ");
            int a = in.nextInt();
            System.out.println("Enter the second number: ");
            int b = in.nextInt();

            if (op == '+') {
                System.out.println("Addition: " + (a + b));
            } else if (op == '-') {
                System.out.println("Subtraction: " + (a - b));
            } else if (op == '*') {
                System.out.println("Multiplication: " + (a * b));
            } else if (op == '/') {
                System.out.println("Division: " + (a / b));
            } else if (op == '%') {
                System.out.println("Remainder: " + (a % b));
            }

            else
                System.out.println("Invalid input");
        }
    }



}

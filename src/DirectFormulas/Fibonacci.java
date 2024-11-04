package DirectFormulas;

import java.lang.Math;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println((int)fib(4));
    }

    public static double fib(int n) {
        return (double) ((Math.pow((1 + Math.sqrt(5)) / 2, n) - Math.pow((1 - Math.sqrt(5)) / 2, n)) / Math.sqrt(5));
    }
}

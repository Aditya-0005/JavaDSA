package Recursion;

public class FibonacciNumbers {
    public static void main(String[] args) {
        System.out.println(fib(8));
    }

    static int fib(int n){
        if(n < 2)
            return n;

        return fib(n-1) + fib(n-2);

    }
}
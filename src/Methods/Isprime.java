package Methods;

import java.util.Scanner;

public class Isprime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = in.nextInt();

        System.out.println(n + " is prime: " + isprime(n));
    }

    static boolean isprime(int n){
        if(n <= 1){
            return false;
        }

        int c = 2;
        while(c * c <= n){
            if((n % c) == 0){
                return false;
            }
            c++;
        }

        return (c * c) > n;
    }
}

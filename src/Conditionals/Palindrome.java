package Conditionals;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int temp = n;
        int rem = 0;
        int ans = 0;
        while(n > 0){
            rem = n%10;
            ans = ans*10 + rem;
            n /= 10;
        }

        if(ans == temp){
            System.out.println(temp + " is a palindrome.");
        }
        else{
            System.out.println(temp + " is not a pallindrome");
        }
    }
}

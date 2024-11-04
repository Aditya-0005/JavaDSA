package Conditionals;

import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = in.nextInt();
        int ans = 0;
        int rem = 0;
        while(n > 0){
            rem = n%10;
            n /= 10;
            ans = ans * 10 + rem;
        }
        System.out.println("After reverse: " + ans);
    }
}

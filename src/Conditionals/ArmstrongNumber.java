package Conditionals;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n= in.nextInt();
        int temp = n;
        int rem = 0;
        int ans = 0;
        while(n > 0){
            rem = n%10;
            ans = ans + (rem*rem*rem);
            n /= 10;
        }

        if(temp == ans){
            System.out.println(temp + " is an armstrong number.");
        }
        else{
            System.out.println(temp + " is not an armstrong number");
        }
    }
}

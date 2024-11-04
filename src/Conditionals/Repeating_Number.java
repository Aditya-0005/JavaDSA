package Conditionals;

import java.util.Scanner;

public class Repeating_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n= in.nextInt();
        System.out.println("Enter the number you want to count: ");
        int k = in.nextInt();

        int remainder = 0;
        int count = 0;
        while(n > 0){

            remainder = n%10;

            if(remainder == k) {
                count++;
            }
            n /= 10;
        }
        System.out.println(k + " appear " + count + " times");
    }
}

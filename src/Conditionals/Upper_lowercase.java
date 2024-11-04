package Conditionals;

import java.util.Scanner;

public class Upper_lowercase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char c = in.next().trim().charAt(0);
//        System.out.println(c.charAt(1));

        if(c >= 65 && c <= 90)
            System.out.println(c + " is in Uppercase");
        else if(c >= 97 && c <= 122)
            System.out.println(c + " is in Lowercase");
        else
            System.out.println("You entered wrong input");
    }
}

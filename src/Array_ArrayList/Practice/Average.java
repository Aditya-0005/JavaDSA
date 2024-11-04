package Array_ArrayList.Practice;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        System.out.println("Enter the total students: ");
        n = in.nextInt();

        float[] arr = new float[n];
        System.out.println("Enter " + n + " student physics marks: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        float average = 0;
        for (int i = 0; i < arr.length; i++) {
            average = average + arr[i];
        }

        System.out.println("Average of the physics marks of " + n + " students is: " + (average/n));
    }
}

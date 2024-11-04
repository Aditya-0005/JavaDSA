package Array_ArrayList.MultidimensionalArray;

import java.util.Scanner;

public class MartixAddition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n,m;
        System.out.println("Enter the no of rows and cols of array: ");
        n = in.nextInt();
        m = in.nextInt();

        int[][] arr1 = new int[n][m];
        System.out.println("Enter " + (n*m) + " elements of first array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr1[i][j] = in.nextInt();
            }
        }

        int[][] arr2 = new int[n][m];
        System.out.println("Enter " + (n*m) + " elements of second array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr2[i][j] = in.nextInt();
            }
        }

        System.out.println("Final matrix after addition is: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print((arr1[i][j] + arr2[i][j]) + " ");
            }
            System.out.println();
        }

    }
}

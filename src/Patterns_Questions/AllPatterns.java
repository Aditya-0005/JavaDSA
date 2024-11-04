package Patterns_Questions;

public class AllPatterns {
    public static void main(String[] args) {
        pattern12(5);
    }

    //Pattern
//    *
//    * *
//    * * *
//    * * * *
    static void pattern(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Pattern
//    * * * * *
//    * * * * *
//    * * * * *
//    * * * * *
//    * * * * *
    static void pattern1(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


//  * * * * *
//  * * * *
//  * * *
//  * *
//  *
    static void pattern2(int n){
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


//    1
//    1 2
//    1 2 3
//    1 2 3 4
//    1 2 3 4 5
    static void pattern3(int n){
        for (int row = 1; row <= n; row++) {
            int s = 1;
            for (int col = 1; col <= row; col++) {
                System.out.print(s + " ");
                s++;
            }
            System.out.println();
        }
    }


//    *
//    * *
//    * * *
//    * * * *
//    * * * * *
//    * * * *
//    * * *
//    * *
//    *
    static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = n-1; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


//            *
//          * *
//        * * *
//      * * * *
//    * * * * *
    static void pattern5(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = n-row; col >= 1; col--) {
                System.out.print("  ");
            }
            for (int col1 = 1; col1 <= row; col1++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

//    * * * * *
//      * * * *
//        * * *
//          * *
//            *
    static void pattern6(int n){
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space < row; space++) {
                System.out.print("  ");
            }
            for (int col = 0; col <= n-row; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }


//        *
//      * * *
//    * * * * *
//  * * * * * * *
//* * * * * * * * *
    static void pattern7(int n){
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n-row; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 2*row-1; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

//* * * * * * * * *
//  * * * * * * *
//    * * * * *
//      * * *
//        *
static void pattern8(int n){
    for (int row = n; row >= 1 ; row--) {
        for (int space = 1; space <= n-row; space++) {
            System.out.print("  ");
        }
        for (int col = 1; col <= 2*row-1; col++) {
            System.out.print(" *");
        }
        System.out.println();
    }
}

//        *
//       * *
//      * * *
//     * * * *
//    * * * * *
    static void pattern9(int n){
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n-row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

//   * * * * *
//    * * * *
//     * * *
//      * *
//       *
    static void pattern10(int n){
        for (int row = n; row >= 1; row--) {
            for (int space = 1; space <= n-row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

//    * * * * *
//     * * * *
//      * * *
//       * *
//        *
//        *
//       * *
//      * * *
//     * * * *
//    * * * * *
    static void pattern11(int n){
        for (int row = n; row >= 1; row--) {
            for (int space = 1; space <= n-row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n-row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }

//         *
//        * *
//       *   *
//      *     *
//     *********
    static void pattern12(int n){
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n-row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2*row-1; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

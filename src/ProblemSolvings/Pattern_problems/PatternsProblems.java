package ProblemSolvings.Pattern_problems;

import java.util.Scanner;

public class PatternsProblems {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size upto which you want to print ");
        int n = sc.nextInt();
//        butterfly_Pattern(n);
//        solid_rohmbus(n);
//        hallow_square(n);
//Triangular_number_pattern(n);
//Number_increasing_Pyramid_Pattern(n);
//NumberChangingPyramidPattern(n);
//        ZeroOneTrianngle(n);
//        pallindromTriangle(n);
        diamondStarPattern(n);
    }

    public static void butterfly_Pattern(int n) {
//           for n=4
//                *______*
//                **____**
//                ***__***
//                ********
//                ********
//                ***__***
//                **____**
//                *______*

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void solid_rohmbus(int n) {

//        for n=5
//            ____*****
//            ___*****_
//            __*****__
//            _*****___
//            *****____

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

    public static void hallow_square(int n) {
//        for n=6
//******
//*    *
//*    *
//*    *
//*    *
//******

        for (int i = 1; i <= n; i++) {

            if (i == 1) {
                for (int k = 1; k <= n; k++) {
                    System.out.print("*");
                }
            } else {
                for (int x = 1; x == 1; x++) {

                    System.out.print("*");

                }
                if (i > 1 && i < n) {
                    for (int k = 1; k <= n - 2; k++) {
                        System.out.print(" ");
                    }
                }
                for (int x = 1; x == 1; x++) {

                    System.out.print("*");

                }
                if (i == n) {
                    for (int k = 3; k <= n; k++) {
                        System.out.print("*");
                    }
                }

            }
            System.out.println();
        }
    }

    public static void Triangular_number_pattern(int n) {

//        for n = 6
//     1
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5
//6 6 6 6 6 6


        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {

                System.out.print(" ");
            }
            for (int x = 1; x <= i; x++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

    public static void Number_increasing_Pyramid_Pattern(int n) {
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
//        1 2 3 4 5 6
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void NumberChangingPyramidPattern(int n) {
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15
//        16 17 18 19 20 21
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

    }

    public static void ZeroOneTrianngle(int n) {
//        1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1
//        0 1 0 1 0 1
        int i, j;
        //outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            //inner loop to handle number of columns
            for (j = 1; j <= i; j++) {
                // if the sum of (i+j) is even then print 1
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                }
                // otherwise print 0
                else {
                    System.out.print(0 + " ");
                }
            }

            //printing new line for each row
            System.out.println();
        }
    }

    public static void pallindromTriangle(int n) {
//                 1
//               2 1 2
//             3 2 1 2 3
//           4 3 2 1 2 3 4
//          5 4 3 2 1 2 3 4 5
//        6 5 4 3 2 1 2 3 4 5 6

        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                for (int x = 0; x < 2; x++)
                    System.out.print(" ");

            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
//            for(int k=1;k<=i;k++){
//                System.out.print(k);
//            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }

    public static void diamondStarPattern(int n) {
//        for n=6
//     *
//    ***
//   *****
//  *******
// *********
//***********
// *********
//  *******
//   *****
//    ***
//     *

        for (int i = 1; i <= n; i++) {

            for (int k = n; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = n; i >= 1; i--) {

            for (int k = n; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }

}






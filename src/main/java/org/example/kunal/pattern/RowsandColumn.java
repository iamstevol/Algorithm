package org.example.kunal.pattern;

public class RowsandColumn {

    public static void main(String[] args) {
//        pattern(4);
//        pattern2(4);
//        square(4);
//        pattern2Num(4);
        increaseAndDecrease(1);
    }

    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2OrThis(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void square(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2Num(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void increaseAndDecrease(int n) {
        for (int i = 0; i <= 2 * n; i++) {
            int totalCol = i > n ? 2 * n - i : i;
            for (int j = 0; j < totalCol ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

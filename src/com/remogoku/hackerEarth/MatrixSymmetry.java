package com.remogoku.hackerEarth;

import java.util.Scanner;

/**
 * Created by Raj on 10/20/14.
 */
public class MatrixSymmetry {
    public static void main(String args[]) throws Exception {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            boolean h = true, v = true;
            char arr[][] = new char[n][n];
            for (int i = 0; i < n; i++) {
                String str = sc.next();
                for (int j = 0; j < n; j++) {
                    arr[i][j] = str.charAt(j);
                }
            }

            for (int j = 0; j < n; j++) {
                for (int i = 0; i < n / 2; i++) {
                    if (arr[i][j] != arr[n - i - 1][j]) {
                        h = false;
                        break; // not horizotal
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n / 2; j++) {
                    if (arr[i][j] != arr[i][n - j - 1]) {
                        v = false;
                        break; // not horizotal
                    }
                }
            }

            if (h && v)
                System.out.println("BOTH");
            else if (h)
                System.out.println("HORIZONTAL");
            else if (v)
                System.out.println("VERTICAL");
            else
                System.out.println("NO");

        }

    }
}

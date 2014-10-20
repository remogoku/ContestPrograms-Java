package com.remogoku.hackerEarth;

import java.util.Scanner;

/**
 * Created by Raj on 10/20/14.
 */
public class CrazyKangaroo {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long m = sc.nextLong();
            long n = sc.nextLong();
            long j = sc.nextLong();
            System.out.println((n / j) - (m - 1) / j);
        }
    }
}
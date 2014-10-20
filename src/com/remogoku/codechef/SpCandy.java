package com.remogoku.codechef;

import java.util.Scanner;

/**
 * Created by Raj on 10/19/14.
 */
public class SpCandy {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            if (n == 0 || k == 0) {
                System.out.println(0 + " " + n);
            } else {
                System.out.println(n / k + " " + n % k);
            }
        }
    }
}
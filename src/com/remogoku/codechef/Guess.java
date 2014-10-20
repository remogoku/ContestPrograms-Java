package com.remogoku.codechef;

import java.util.Scanner;

/**
 * Created by Raj on 10/19/14.
 */
public class Guess {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            long numerator = (m / 2) * (n - n / 2) + (n / 2) * (m - m / 2);
            long denominator = m * n;
            if (numerator != 0 && denominator != 0) {
                long gcd = findGCD(denominator, numerator);
                numerator /= gcd;
                denominator /= gcd;
            }
            System.out.println(numerator + "/" + denominator);
        }
    }

    private static long findGCD(long a, long b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}

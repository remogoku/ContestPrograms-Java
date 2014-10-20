package com.remogoku.hackerEarth;

import java.util.Scanner;

/**
 * Created by Raj on 10/20/14.
 */
public class InLoveWithPrimes {

    public static boolean isPrime(int n) {
        if (n == 4 || n < 2)
            return false;
        if (n < 6) {
            return true;
        } else {
            int root = (int) Math.sqrt(n);
            for (int i = 6; i <= root + 1; i += 6) {
                if (n % (i - 1) == 0 || n % (i + 1) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            String ans = "Arjit";
            if (n < 4) {
                System.out.println(ans);
                continue;
            }
            if (n == 4) {
                System.out.println("Deepa");
                continue;
            }
            for (int i = 3; i <= (n / 2) + 2; i += 2) {
                if (isPrime(i) && isPrime(n - i)) {
                    ans = "Deepa";
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
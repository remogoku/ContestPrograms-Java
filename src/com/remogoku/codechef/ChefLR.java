package com.remogoku.codechef;

import java.util.Scanner;

/**
 * Created by Raj on 10/19/14.
 */
public class ChefLR {
    public static final long MOD = 1000000007;

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long value = 1; // value of root node
            long twoPow = 1;
            long oddCount = 0;
            long evenCount = 0;
            char[] chars = sc.next().toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (i % 2 == 0) {
                    oddCount += twoPow;
                } else {
                    evenCount += twoPow;
                }

                if (chars[i] == 'l') {
                    value = (value * 2) % MOD;
                } else {
                    value = (value * 2 + 1) % MOD;
                }
                twoPow = (twoPow * 2) % MOD;
            }
            long term = value - twoPow + 1;
            if (chars.length % 2 != 0) {
                term = (evenCount + term) % MOD * 2;
            } else {
                term = ((oddCount + term) % MOD * 2) - 1;
            }
            System.out.println(term % MOD);

        }
    }

}
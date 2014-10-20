package com.remogoku.hackerEarth;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Raj on 10/20/14.
 */
public class GameOfStrengths {
    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long arr[] = new long[n];
            long max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
                if (arr[i] > max)
                    max = arr[i];
            }
            Arrays.sort(arr);
            long absSum = 0;
            for (int i = n - 1; i >= 0; i--) {
                absSum += ((arr[i] * i) - (arr[i] * (n - i - 1))) % MOD;
            }
            long ans = (absSum * max) % MOD;
            System.out.println(ans);
        }
    }
}

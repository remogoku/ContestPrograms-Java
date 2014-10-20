package com.remogoku.hackerEarth;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Raj on 10/20/14.
 */
public class ChanduAndHisToyStack {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int first[] = new int[n];
            int second[] = new int[n];

            for (int i = 0; i < n; i++) {
                first[i] = sc.nextInt();
                second[i] = sc.nextInt();
            }
            int ans = 0;
            Arrays.sort(first);
            Arrays.sort(second);
            for (int i = 0; i < n; i++) {
                if (first[i] == second[i]) {
                    continue;
                } else if (second[i] > first[i]) {
                    ans = ans + (second[i] - first[i]) * X;
                } else {
                    ans = ans + (first[i] - second[i]) * Y;
                }
            }
            System.out.println(ans);
        }
    }
}

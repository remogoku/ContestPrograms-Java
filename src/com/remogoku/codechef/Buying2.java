package com.remogoku.codechef;

import java.util.Scanner;

/**
 * Created by Raj on 10/19/14.
 */
public class Buying2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            int a[] = new int[n];
            a[0] = sc.nextInt();
            int min = a[0];
            int sum = a[0];
            for (int i = 1; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] <= min)
                    min = a[i];
                sum += a[i];
            }
            if (sum % x >= min) {
                System.out.println("-1");
            } else {
                System.out.println(sum / x);
            }
        }
    }
}
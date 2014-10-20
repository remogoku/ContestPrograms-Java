package com.remogoku.hackerEarth;

import java.util.Scanner;

/**
 * Created by Raj on 10/20/14.
 */
public class SHINCHANKAZAMAandXOR {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int X = sc.nextInt();

            int max_key = -1;
            int max_value = -1;
            int min_value = Integer.MIN_VALUE;
            for (int j = l - 1; j < r; j++) {
                int p = arr[j];
                int xor = p ^ X;

                if (xor <= min_value || min_value == Integer.MIN_VALUE) {
                    if (max_key == Integer.MIN_VALUE) {
                        max_key = p;
                        max_value = 1;
                        min_value = xor;
                    } else if (max_key == p) {
                        max_value += 1;
                    } else {
                        max_key = p;
                        max_value = 1;
                        min_value = xor;
                    }
                }
            }
            System.out.println(max_key + " " + max_value);
        }
    }
}

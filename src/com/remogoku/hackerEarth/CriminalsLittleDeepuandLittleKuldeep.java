package com.remogoku.hackerEarth;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Raj on 10/20/14.
 */
public class CriminalsLittleDeepuandLittleKuldeep {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            int max_count = 0;
            int count = 1;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] == arr[i]) {
                    count++;
                } else {
                    if (count > max_count) {
                        max_count = count;
                    }
                    count = 1;
                }
            }
            if (count > max_count) {
                max_count = count;
            }
            System.out.println(max_count);
        }
    }
}

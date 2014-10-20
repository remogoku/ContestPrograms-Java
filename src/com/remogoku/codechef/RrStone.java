package com.remogoku.codechef;

import java.util.Scanner;

/**
 * Created by Raj on 10/19/14.
 */
public class RrStone {
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long arr[] = new long[n];
        long MAX = Long.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > MAX) {
                MAX = arr[i];
            }
        }
        long tempMax = Long.MIN_VALUE;
        if (k > 0) {
            for (int i = 0; i < n; i++) {
                arr[i] = MAX - arr[i];
                if (arr[i] > tempMax) {
                    tempMax = arr[i];
                }
            }
            if (k % 2 == 0) {
                for (int i = 0; i < n; i++) {
                    arr[i] = tempMax - arr[i];
                }
            }

        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
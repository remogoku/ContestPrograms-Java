package com.remogoku.hackerEarth;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Raj on 10/20/14.
 */
public class GirlfriendsRequest {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] numbers = new long[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextLong();
        }
        int queries = sc.nextInt();
        for (int i = 0; i < queries; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            long[] temp = Arrays.copyOfRange(numbers, start - 1, end);
            Arrays.sort(temp);
            System.out.println(temp[(end - start) / 2]);
        }
    }
}

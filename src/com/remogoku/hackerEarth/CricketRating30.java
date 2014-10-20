package com.remogoku.hackerEarth;

import java.util.Scanner;

/**
 * Created by Raj on 10/20/14.
 */
public class CricketRating30 {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int ans = returnMaxSubArray(array);
        System.out.println(ans < 0 ? 0 : ans);

    }

    public static int returnMaxSubArray(int[] array) {

        int tempSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            int j = array[i];
            tempSum += j;

            if (tempSum > maxSum) {
                maxSum = tempSum;
            } else if (tempSum < 0) {
                tempSum = 0;
            }
        }
        return maxSum;
    }

}
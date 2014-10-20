package com.remogoku.hackerEarth;

import java.util.Scanner;

/**
 * Created by Raj on 10/20/14.
 */
public class RemoveFriends {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int rm = sc.nextInt();

            int arr[] = new int[n];
            int tempArr[] = new int[n];
            boolean found = false;

            for (int l = 0; l < n; l++) {
                arr[l] = sc.nextInt();
                tempArr[l] = Integer.MIN_VALUE;
            }
            int i = 0;
            int k = -1;
            while (rm > 0) {

                if (i < n && found && k > -1 && tempArr[k] < arr[i]) {
                    k--;
                    rm--;
                } else if (i + 1 < n && arr[i] < arr[i + 1]) {
                    i++;
                    rm--;
                    found = true;

                } else if (i >= n && rm > 0) {
                    k = k - rm;
                    rm = 0;
                } else {
                    tempArr[++k] = arr[i];
                    i++;
                    found = false;
                }
            }
            for (int f = 0; f <= k; f++) {
                System.out.print(tempArr[f] + " ");
            }
            for (int s = i; s < n; s++) {
                System.out.print(arr[s] + " ");
            }
            System.out.println();
        }

    }
}

package com.remogoku.hackerEarth;

import java.util.Scanner;

/**
 * Created by Raj on 10/20/14.
 */
public class FinalVoyage {
    public static int callDynamicAlgorithm(int[] ammoWeight, int[] ammoValue, int n, int w) {
        int ammoMat[][] = new int[n][w + 1];
        for (int j = 0; j <= w; j++) {
            ammoMat[0][j] = 0;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= w; j++) {
                if (ammoWeight[i] <= j && (ammoValue[i] + ammoMat[i - 1][j - ammoWeight[i]] > ammoMat[i - 1][j])) {
                    ammoMat[i][j] = ammoValue[i] + ammoMat[i - 1][j - ammoWeight[i]];
                } else {
                    ammoMat[i][j] = ammoMat[i - 1][j];
                }
            }
        }

        return ammoMat[n - 1][w];
    }

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            n = n + 1;
            int w = sc.nextInt();
            int ammoWeight[] = new int[n];
            int ammoValue[] = new int[n];
            ammoWeight[0] = 0;
            ammoValue[0] = 0;
            for (int i = 1; i < n; i++) {
                ammoWeight[i] = sc.nextInt();
            }
            for (int i = 1; i < n; i++) {
                ammoValue[i] = sc.nextInt();
            }
            int ans = callDynamicAlgorithm(ammoWeight, ammoValue, n, w);
            System.out.println(ans);
        }


    }
}


package com.remogoku.codechef;

import java.util.Scanner;

/**
 * Created by Raj on 10/19/14.
 */
public class DrgnBool {
    public static void main(String[] args) {
        // TODO Auto-generated method stub


        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int winFlag = 0;

            int total_chakra = 0;
            int sum[] = new int[101];
            int sumSoint[] = new int[101];
            int sumSofloat[] = new int[101];
            while (n-- > 0) {
                int chakra = sc.nextInt();
                int level = sc.nextInt();

                sumSoint[level] = sumSoint[level] + chakra;

            }

            while (m-- > 0) {
                int chakra = sc.nextInt();
                int level = sc.nextInt();

                sumSofloat[level] = sumSofloat[level] + chakra;
            }

            for (int i = 0; i < 101; i++) {
                sum[i] = sumSoint[i] - sumSofloat[i];

                if (sum[i] < 0) {
                    total_chakra += (-(sum[i]));
                }
            }

            System.out.println(total_chakra);
        }


    }

}


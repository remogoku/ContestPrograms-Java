package com.remogoku.codechef;

import java.util.Scanner;

/**
 * Created by Raj on 10/19/14.
 */
public class PlzLykMe {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int L = sc.nextInt();
            int D = sc.nextInt();
            long S = sc.nextLong();
            int C = sc.nextInt();
            for (int i = 1; i < D; i++) {
                S *= (C + 1);
                if (S >= L) {
                    break;
                }
            }
            if (S < L) {
                System.out.println("DEAD AND ROTTING");
            } else {
                System.out.println("ALIVE AND KICKING");
            }
        }
    }

}

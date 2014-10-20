package com.remogoku.codechef;

import java.util.Scanner;

/**
 * Created by Raj on 10/19/14.
 */
public class Hello {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            float d = sc.nextFloat();
            int u = sc.nextInt();
            float minimum = d * u;
            int ans = 0;
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int m = sc.nextInt();
                float r = sc.nextFloat();
                int c = sc.nextInt();
                if (((float) (((r * u * m) + c) / m)) <= minimum) {
                    minimum = (float) (((r * u * m) + c) / m);
                    ans = i + 1;
                }
            }
            System.out.println(ans);

        }
    }
}
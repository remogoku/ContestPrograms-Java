package com.remogoku.hackerEarth;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Raj on 10/20/14.
 */
public class MyGirlfriendAndHerLoveForCats {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] strength = new long[n];
        long[] calorie = new long[n];
        long ans = 0;
        for (int i = 0; i < n; i++) {
            strength[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++) {
            calorie[i] = sc.nextLong();
        }
        Arrays.sort(strength);
        Arrays.sort(calorie);

        for (int i = 0; i < n; i++) {
            ans += calorie[i] * strength[i];
        }

        System.out.println(ans);
    }
}

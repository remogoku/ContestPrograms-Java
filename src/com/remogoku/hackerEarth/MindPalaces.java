package com.remogoku.hackerEarth;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Raj on 10/20/14.
 */
public class MindPalaces {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<Integer, Integer> hsmap = new HashMap<Integer, Integer>();
        for (int i = 0; i < n * m; i++) {
            hsmap.put(sc.nextInt(), i);
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            if (hsmap.containsKey(x)) {
                int j = hsmap.get(x);
                System.out.println(j / m + " " + j % m);
            } else {
                System.out.println("-1 -1");
            }
        }
    }
}

package com.remogoku.hackerEarth;

import java.util.Scanner;

/**
 * Created by Raj on 10/20/14.
 */
public class MirrorOfMahatmaGandhi {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            String flag = "YES";
            for (int i = 0; i < s.length(); i++) {
                int j = Integer.parseInt(s.substring(i, i + 1));
                if (j != 1 && j != 8 && j != 0) {
                    flag = "NO";
                    break;
                }
            }
            System.out.println(flag);
        }
    }
}

package com.remogoku.hackerEarth;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Raj on 10/19/14.
 */
public class MissingAlphabets {

    static HashMap<String, Integer> alpha;

    static boolean isGreater(String s, String t) {
        if (s.charAt(0) == t.charAt(0)) {
            if (s.length() > 1 && t.length() > 1) {
                return isGreater(s.substring(1), t.substring(1));
            } else {
                return s.length() > t.length();
            }
        } else {
            if (alpha.get("" + s.charAt(0)) > alpha.get("" + t.charAt(0))) {
                return true;
            } else {
                return false;
            }
        }
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            String str = sc.next();
            alpha = new HashMap<String, Integer>();
            for (int i = 0; i < str.length(); i++) {
                alpha.put("" + str.charAt(i), i + 1);
            }

            int m = sc.nextInt();
            String al[] = new String[m];
            for (int i = 0; i < m; i++) {
                al[i] = sc.next();
            }

            for (int i = 0; i < m - 1; i++) {

                for (int j = i + 1; j < m; j++) {
                    if (isGreater(al[i], al[j])) {
                        String temp = al[j];
                        al[j] = al[i];
                        al[i] = temp;
                    }
                }
            }

            for (int i = 0; i < m; i++) {
                System.out.println(al[i]);
            }
        }
    }

}


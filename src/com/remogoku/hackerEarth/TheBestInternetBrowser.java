package com.remogoku.hackerEarth;

import java.util.Scanner;

/**
 * Created by Raj on 10/20/14.
 */
public class TheBestInternetBrowser {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String vowel = "aeiou";
            String s = sc.next();
            int tot_count = s.length();
            int count = tot_count;
            if (s.contains("www.")) {
                s = s.replaceFirst("www.", "");
                count -= 4;
            }
            if (s.contains(".com")) {
                s = s.replace(".com", "");
            }
            int upper = 0;
            for (int i = 0; i < s.length(); i++) {
                if (vowel.contains(s.charAt(i) + "")) {
                    upper++;
                }
            }
            System.out.println(count - upper + "/" + tot_count);
        }
    }
}

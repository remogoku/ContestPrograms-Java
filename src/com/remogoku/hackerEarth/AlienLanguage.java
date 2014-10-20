package com.remogoku.hackerEarth;

import java.util.Scanner;

/**
 * Created by Raj on 10/20/14.
 */
public class AlienLanguage {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int arr[] = new int[26];
            String s = sc.next();
            String st = sc.next();
            String ans = "NO";
            for (int i = 0; i < s.length(); i++) {
                arr[s.charAt(i) - 'a'] = 1;
            }
            for (int i = 0; i < st.length(); i++) {
                if (arr[st.charAt(i) - 'a'] == 1) {
                    ans = "YES";
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}

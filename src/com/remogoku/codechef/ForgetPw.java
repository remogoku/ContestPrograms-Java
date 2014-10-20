package com.remogoku.codechef;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Raj on 10/19/14.
 */
public class ForgetPw {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            HashMap<Character, Character> hashMap = new HashMap<Character, Character>();
            int rules = sc.nextInt();
            for (int i = 0; i < rules; i++) {
                String s = sc.next();
                String p = sc.next();
                hashMap.put(s.charAt(0), p.charAt(0));
            }
            String password = sc.next();
            StringBuffer sb = new StringBuffer();

            for (int i = 0; i < password.length(); i++) {
                if (hashMap.containsKey(password.charAt(i))) {
                    sb.append(hashMap.get(password.charAt(i)));
                } else {
                    sb.append(password.charAt(i));
                }
            }
            String ans = sb.toString();
            int index = 0;
            int maxIndex = ans.length();
            while (index < maxIndex && ans.charAt(index) == '0') {
                index++;
            }
            int startIndex = index;
            index = maxIndex - 1;
            int endIndex = index;
            if (startIndex > endIndex) {
                System.out.println(0);
            } else if (startIndex != endIndex) {
                if (ans.contains(".")) {
                    while (ans.charAt(index) == '0') {
                        index--;
                    }
                }
                endIndex = index;
                if (startIndex == endIndex) {
                    System.out.println(0);
                } else {
                    if (ans.charAt(endIndex) == '.') {
                        endIndex--;
                    }
                    System.out.println(ans.substring(startIndex, endIndex + 1));
                }
            } else {
                System.out.println(ans.substring(startIndex, endIndex + 1));
            }
        }
    }
}
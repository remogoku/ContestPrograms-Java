package com.remogoku.codechef;

import java.util.Scanner;

/**
 * Created by Raj on 10/19/14.
 */
public class Compiler {
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            int max = 0;
            int start = 0;
            int end = 0;
            String str = sc.next();
            if (str.charAt(0) == '>') {
                System.out.println(max);
                continue;
            }
            int prevMax = max;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);

                if ('<' == c) {
                    if (start >= end)
                        start++;
                } else {
                    if (end < start)
                        end++;
                    else {
                        break;
                    }
                }
                if (end == start) {
                    prevMax += end;
                    start = 0;
                    end = 0;
                }

            }
            System.out.println(prevMax * 2);
        }
    }
}
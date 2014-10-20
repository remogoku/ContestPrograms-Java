package com.remogoku.codechef;

import java.util.Scanner;

/**
 * Created by Raj on 10/19/14.
 */
public class ChefZot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int curr = 0;
        while (n-- > 0) {
            if (sc.nextInt() == 0) {
                if (curr > max) {
                    max = curr;
                }
                curr = 0;
            } else {
                curr++;
            }
        }
        if (curr > max) {
            max = curr;
        }
        System.out.println(max);
    }
}
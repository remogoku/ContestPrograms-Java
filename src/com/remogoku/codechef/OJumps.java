package com.remogoku.codechef;

import java.util.Scanner;

/**
 * Created by Raj on 10/19/14.
 */
public class OJumps {
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if ((n % 6 == 0) || ((n - 1) % 6 == 0) || ((n - 3) % 6 == 0)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
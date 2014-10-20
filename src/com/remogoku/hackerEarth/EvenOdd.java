package com.remogoku.hackerEarth;

import java.util.Scanner;

/**
 * Created by Raj on 10/20/14.
 */
public class EvenOdd {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            int even = 0;
            int odd = 0;
            if (r <= c) {
                if (r % 2 == 0) {
                    int n = r / 2;
                    odd = n * n;
                    even = n * (n + 1);
                } else {
                    int n = (r / 2);
                    even = n * (n + 1);
                    n++;
                    odd = n * n;
                }
            } else {
                if (c % 2 == 0) {
                    int n = c / 2;
                    odd = n * n;
                    even = n * (n + 1);
                    // add extra rows for both.
                    int diff = r - c;
                    if (diff % 2 == 0) {
                        diff = diff / 2;
                        diff = diff * c;
                        odd += diff;
                        even += diff;
                    } else {
                        diff = diff / 2;
                        even += diff * c;
                        diff++;
                        odd += diff * c;
                    }
                } else {
                    int n = (c / 2);
                    even = n * (n + 1);
                    n++;
                    odd = n * n;
                    // add extra rows for both
                    int diff = r - c;
                    if (diff % 2 == 0) {
                        diff = diff / 2;
                        diff = diff * c;
                        odd += diff;
                        even += diff;
                    } else {
                        diff = diff / 2;
                        odd += diff * c;
                        diff++;
                        even += diff * c;
                    }
                }
            }
            System.out.println(even + " " + odd);
        }
    }
}


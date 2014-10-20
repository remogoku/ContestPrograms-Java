package com.remogoku.codechef;

import java.util.Scanner;

/**
 * Created by Raj on 10/19/14.
 */
public class T05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        if (t >= 1 || t <= 10000) {
            String str[] = new String[t];
            int p = 0;

            while (p < t) {
                int n = sc.nextInt();
                if (n <= 0 || n > 30)
                    System.exit(0);
                int k = sc.nextInt();

                if (k >= 0 || k <= 100000000) {


                    if (k > 0) {
                        if (k < n) {
                            str[p] = "OFF";
                        } else {
                            String b = Integer.toBinaryString(k);
                            if (b.length() < n) {
                                while (true) {
                                    if (b.length() == n)
                                        break;
                                    else
                                        b = "0" + b;
                                }
                            }
                            int count = 0;
                            for (int i = 1; i <= n; i++) {
                                if (b.charAt(b.length() - i) == '1') {
                                    count++;
                                } else
                                    break;
                            }
                            if (count == n) {
                                str[p] = "ON";
                            } else {
                                str[p] = "OFF";
                            }
                        }
                    } else {
                        str[p] = "OFF";
                    }
                } else {
                    System.exit(0);
                }

                p++;
            }// end of while

            for (int i = 0; i < t; i++) {
                System.out.println(str[i]);
            }
        } else {
            System.exit(0);
        }
    }


}
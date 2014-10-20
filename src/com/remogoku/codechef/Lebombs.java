package com.remogoku.codechef;

import java.util.Scanner;

/**
 * Created by Raj on 10/19/14.
 */
public class Lebombs {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int ans[] = new int[100];
        int k = 0;

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if (t >= 1 && t <= 100) {
            while (k < t) {
                int n = sc.nextInt();
                if (n >= 0 && n <= 1000) {
                    String s = sc.next();
                    if (s.length() == n) {
                        int count;
                        if (n == 1 || n == 2) {
                            int h = Integer.parseInt(s);
                            if (h == 0)
                                count = n;
                            else
                                count = 0;
                        } else {
                            StringBuffer sbuf = new StringBuffer(s);
                            for (int i = 1; i < n - 1; i++) {
                                if (sbuf.charAt(i) == '1') {
                                    sbuf.deleteCharAt(i - 1);
                                    sbuf.insert(i - 1, 'X');
                                    sbuf.deleteCharAt(i);
                                    sbuf.insert(i, 'X');
                                    if (sbuf.charAt(i + 1) != '1') {
                                        sbuf.deleteCharAt(i + 1);
                                        sbuf.insert(i + 1, 'X');
                                        i++;
                                    }
                                }
                            }

                            if ((sbuf.charAt(n - 1)) == '1') {
                                sbuf.deleteCharAt(n - 2);
                                sbuf.insert(n - 2, 'X');
                                sbuf.deleteCharAt(n - 1);
                                sbuf.insert(n - 1, 'X');
                            }

                            if ((sbuf.charAt(0)) == '1') {
                                sbuf.deleteCharAt(0);
                                sbuf.insert(0, 'X');
                                sbuf.deleteCharAt(1);
                                sbuf.insert(1, 'X');
                            }

                            count = 0;
                            for (int i = 0; i < n; i++)
                                if (sbuf.charAt(i) == '0')
                                    count++;
                        }
                        ans[k] = count;
                    } else {
                        System.exit(0);
                    }
                } else {
                    System.exit(0);
                }
                k++;

            }// end of while loop.. test case..
            for (int i = 0; i < t; i++)
                System.out.println(ans[i]);
            System.exit(0);

        } else {
            System.exit(0);
        }

    }

}

package com.remogoku.codechef;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Raj on 10/19/14.
 */
public class Lelemon {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int p[] = new int[m];
            for (int i = 0; i < m; i++)
                p[i] = sc.nextInt();

            ArrayList<ArrayList> al = new ArrayList<ArrayList>();
            for (int i = 0; i < n; i++) {
                int c = sc.nextInt();
                ArrayList<Integer> a = new ArrayList<Integer>();
                for (int j = 0; j < c; j++) {
                    a.add(sc.nextInt());
                }
                al.add(a);
            }

            int sum = 0;
            for (int i = 0; i < m; i++) {
                ArrayList<Integer> b = al.get(p[i]);
                if (b.size() > 0) {
                    int max = b.get(0);
                    int max_j = 0;
                    for (int j = 1; j < b.size(); j++) {
                        if (b.get(j) > max) {
                            max = b.get(j);
                            max_j = j;
                        }
                    }
                    b.remove(max_j);
                    sum += max;
                }
            }
            System.out.println(sum);
        }
    }
}
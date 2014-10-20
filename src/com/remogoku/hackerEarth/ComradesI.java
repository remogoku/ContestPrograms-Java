package com.remogoku.hackerEarth;

import java.util.Scanner;

/**
 * Created by Raj on 10/20/14.
 */
public class ComradesI {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt() - 1;
            }
            int q = sc.nextInt();
            for (int i = 0; i < q; i++) {
                int x = sc.nextInt() - 1;
                int y = sc.nextInt() - 1;
                int count = 0;
                if (x != y) {
                    while (x != -1) {
                        x = arr[x];
                        if (x == y)
                            break;
                        count++;
                    }
                }
                if (x != -1)
                    System.out.println(count);
                else
                    System.out.println("-1");

            }
        }
    }

}

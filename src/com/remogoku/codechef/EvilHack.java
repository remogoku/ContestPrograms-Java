package com.remogoku.codechef;

import java.util.Scanner;

/**
 * Created by Raj on 10/19/14.
 */
public class EvilHack {
    public static void main(String[] args) {
        // TODO Auto-generated method stub


        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        if (a < 1 || a > 1000)
            System.exit(0);

        while (a > 0) {
            int x = sc.nextInt();
            if (x < 0 || x > 1000000)
                System.exit(0);
            int y = sc.nextInt();
            if (y < 0 || y > 1000000)
                System.exit(0);

            if (x == 0 || y == 0)
                System.out.println(0);
            else if (x == 1 && y == 1)
                System.out.println(1);
            else {
                int midx;
                int midy;
                int step = 1;
                if (x % 2 == 0) {
                    midx = x / 2;
                } else {
                    midx = (x / 2) + 1;
                }

                if (y % 2 == 0) {
                    midy = y / 2;
                } else {
                    midy = (y / 2) + 1;
                }
                if (y == 1 || x == 1)
                    step--;
                //else if(y%2==0 && x%2==0)
                //	step--;
                step = step + (x - midx) + (y - midy);

                System.out.println(step);
            }
            a--;
        }
    }


}
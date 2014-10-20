package com.remogoku.codechef;

import java.util.Scanner;

/**
 * Created by Raj on 10/19/14.
 */
public class T02 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if (t > 1000)
            System.exit(0);
        while (t > 0) {
            long n = sc.nextLong();
            if (n < 1 || n > 9)
                System.exit(0);
            long k = sc.nextLong();
            if (k > 0) {
                long ans = k - 1;
                long palind = 0;
                if (n % 2 == 0) {
                    if (n > 2) {
                        long add;
                        String st = String.valueOf(ans);
                        long m = n / 2;
                        //if(m>st.length())
                        add = (long) Math.pow(10, m - 1) + ans;
                        //else
                        //	 add = ans;
                        palind = Long.parseLong(new StringBuffer(String.valueOf(add)).append(new StringBuffer(String.valueOf(add)).reverse().toString()).toString());
                    } else {
                        palind = 11 * k;
                    }

                } else {
                    long m = n / 2;

                    long middle = ans % 10;
                    ans = ans / 10;
                    long add;
                    String st = String.valueOf(ans);
                    //if(m>st.length())
                    add = (long) Math.pow(10, m - 1) + ans;
                    //else
                    //	add= ans;
                    palind = Long.parseLong(new StringBuffer(String.valueOf(add)).append(middle).append(new StringBuffer(String.valueOf(add)).reverse().toString()).toString());

                }
                System.out.println(palind);
            } else
                System.exit(0);
            t--;
        }


    }

}

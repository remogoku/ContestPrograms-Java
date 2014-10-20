package com.remogoku.codechef;

import java.util.Scanner;

/**
 * Created by Raj on 10/19/14.
 */
public class CKissHug {

    static final long MOD = 1000000007;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        long array[] = new long[30];

        array[0] = 2;
        array[1] = 4;
        array[2] = 16;
        array[3] = 256;
        array[4] = 65536;
        array[5] = 294967268;
        array[6] = 582344008;
        array[7] = 279632277;
        array[8] = 792845266;
        array[9] = 418385479;
        array[10] = 812734592;
        array[11] = 409643880;
        array[12] = 246797651;
        array[13] = 112754241;
        array[14] = 774491455;
        array[15] = 669157962;
        array[16] = 973586826;
        array[17] = 125655169;
        array[18] = 385894014;
        array[19] = 998632880;
        array[20] = 36221046;
        array[21] = 164150368;
        array[22] = 125918023;
        array[23] = 405241093;
        array[24] = 306292255;
        array[25] = 816280417;
        array[26] = 513497891;
        array[27] = 215687307;
        array[28] = 75265151;
        array[29] = 915398907;

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        if (t < 1 || t > 1000)
            System.exit(0);
        while (t-- > 0) {
            long pow = 1;
            long n = sc.nextLong();
            if (n < 1 || n > 1000000000L) {
                System.exit(0);
            }

            long m;

            if (n % 2 == 0) {
                m = n / 2;
            } else {
                m = (n + 1) / 2;
            }

            String str = Long.toBinaryString(m);
            //System.out.println(str);
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '1') {
                    pow = (pow * array[(str.length() - 1 - i)]) % MOD;

                }

            }
            long ans = 0;
            if (n % 2 == 0) {
                ans = ((3 * pow) - 2) % MOD;
            } else {
                ans = 2 * (pow - 1) % MOD;
            }
            System.out.println(ans);
            //System.out.println( n + " "+pow);
            //	long ans= ((((pow-1)*2)-n)*2)%MOD;
            //	System.out.println(ans);


        }


    }


}

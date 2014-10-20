package com.remogoku.codechef;

import java.util.Scanner;

/**
 * Created by Raj on 10/19/14.
 */
public class NewSch {
    static final long MOD = 1000000007;

    public static void main(String args[]) {

        long a[] = new long[30];
        a[0] = 3;
        a[1] = 9;
        a[2] = 81;
        a[3] = 6561;
        a[4] = 43046721;
        a[5] = 175880701;
        a[6] = 767713261;
        a[7] = 989568599;
        a[8] = 272100766;
        a[9] = 339514974;
        a[10] = 763327764;
        a[11] = 214554799;
        a[12] = 451694074;
        a[13] = 58524731;
        a[14] = 114646353;
        a[15] = 164194107;
        a[16] = 584809521;
        a[17] = 458234230;
        a[18] = 73842644;
        a[19] = 34741584;
        a[20] = 650380217;
        a[21] = 704006128;
        a[22] = 792180016;
        a[23] = 356916045;
        a[24] = 286718591;
        a[25] = 849572438;
        a[26] = 356850590;
        a[27] = 691951706;
        a[28] = 84730316;
        a[29] = 399205274;


        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();

            long ans = 1;
            String s = Long.toBinaryString(n);

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(s.length() - 1 - i) == '1') {
                    ans = (ans * a[i]) % MOD;
                }
            }

            if (n % 2 == 0)
                ans = (ans + 3) % MOD;
            else
                ans = (ans - 3) % MOD;

            System.out.println(ans);
        }

    }
}

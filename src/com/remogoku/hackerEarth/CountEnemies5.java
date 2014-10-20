package com.remogoku.hackerEarth;

import java.util.Scanner;

/**
 * Created by Raj on 10/20/14.
 */
public class CountEnemies5 {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            boolean containsX = false;
            int enemiesLeft = 0;
            int addBalanceEnemies = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '*') {
                    if (!containsX) {
                        enemiesLeft += addBalanceEnemies;
                    }
                    addBalanceEnemies = 0;
                    containsX = false;

                } else if (s.charAt(i) == 'X') {
                    containsX = true;
                } else if (s.charAt(i) == 'O') {
                    addBalanceEnemies++;
                }
            }
            if (!containsX) {
                enemiesLeft += addBalanceEnemies;
            }
            System.out.println(enemiesLeft);
        }
    }
}


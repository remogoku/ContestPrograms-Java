package com.remogoku.codechef;

import java.util.Scanner;

/**
 * Created by Raj on 10/19/14.
 */
public class DigJump {
    public static final int DEFAULT_VALUE = -1;

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int digitMin[] = new int[10];
        for (int i = 0; i < 10; i++) {
            digitMin[i] = DEFAULT_VALUE;
        }
        String str = sc.next();
        int ansArray[] = new int[str.length()];

        int k = 10;
        while (k-- > 0) {
            int value = 0;
            for (int i = 0; i < str.length(); i++) {
                int number = str.charAt(i) - 48;
                if (digitMin[number] < 0) { // first time;
                    digitMin[number] = value;
                } else {
                    if (digitMin[number] + 1 < value) {
                        value = digitMin[number] + 1;
                    } else if (digitMin[number] > value) {
                        digitMin[number] = value;
                    }
                }

                ansArray[i] = value;
                value++;
                int j = i - 1;
                int currValue = ansArray[i];
                while (j > 0 && ansArray[j] > currValue + 1) {
                    ansArray[j] = currValue + 1;
                    if (ansArray[j] < digitMin[str.charAt(j) - 48]) {
                        digitMin[str.charAt(j) - 48] = ansArray[j];
                    }
                    currValue = ansArray[j];
                    j--;
                }
            }
        }
        System.out.println(ansArray[str.length() - 1]);
    }
}

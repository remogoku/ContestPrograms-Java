package com.remogoku.hackerEarth;

import java.util.Scanner;

/**
 * Created by Raj on 10/20/14.
 */
public class OldKeypadInAForeignLand {

    public static int[] sortDesending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }


    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int freqArray[] = new int[t];
        for (int i = 0; i < freqArray.length; i++) {
            freqArray[i] = sc.nextInt();
        }

        freqArray = sortDesending(freqArray);
        int keySize = sc.nextInt();
        int[] keyArray = new int[keySize];
        int sum = 0;
        for (int i = 0; i < keySize; i++) {
            keyArray[i] = sc.nextInt();
            sum += keyArray[i];
        }

        if (sum >= t) {
            int ans = 0;
            int k = 0;
            for (int i = 0; i < freqArray.length; ) {
                k++;
                for (int j = 0; j < keyArray.length; j++) {
                    if (keyArray[j] < 1)
                        continue;
                    ans += freqArray[i] * k;
                    keyArray[j]--;
                    i++;
                    sum--;
                    if (i >= freqArray.length)
                        break;
                }
            }
            System.out.println(ans);
        } else {
            System.out.println("-1");
        }
    }
}
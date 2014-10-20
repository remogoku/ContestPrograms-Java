package com.remogoku.codechef;

import java.util.Scanner;

/**
 * Created by Raj on 10/19/14.
 */
public class Horses {
    public static void main(String a[]) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if (t < 1 || t > 10)
            System.exit(0);
        while (t-- > 0) {
            int i, n = sc.nextInt();
            if (n < 2 || n > 5000)
                System.exit(0);
            int ar[] = new int[n];

            for (int k = 0; k < n; k++) {
                ar[k] = sc.nextInt();
            }

            mergeSort_srt(ar, 0, ar.length - 1);

            int min_diff = ar[1] - ar[0];

            for (i = 1; i < ar.length - 1; i++) {
                if (ar[i + 1] - ar[i] < min_diff)
                    min_diff = ar[i + 1] - ar[i];

            }

            System.out.println(min_diff);

        }
    }

    public static void mergeSort_srt(int array[], int lo, int n) {
        int low = lo;
        int high = n;
        if (low >= high) {
            return;
        }

        int middle = (low + high) / 2;
        mergeSort_srt(array, low, middle);
        mergeSort_srt(array, middle + 1, high);
        int end_low = middle;
        int start_high = middle + 1;
        while ((lo <= end_low) && (start_high <= high)) {
            if (array[low] < array[start_high]) {
                low++;
            } else {
                int Temp = array[start_high];
                for (int k = start_high - 1; k >= low; k--) {
                    array[k + 1] = array[k];
                }
                array[low] = Temp;
                low++;
                end_low++;
                start_high++;
            }
        }
    }

}


package com.remogoku.hackerEarth;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Raj on 10/20/14.
 */
public class SwapIt {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                arrayList.add(sc.nextInt());
            }
            int steps_left = k;
            while (steps_left > 0 && arrayList != null && arrayList.size() > 0) {

                int end = steps_left;
                if (end > arrayList.size()) {
                    end = arrayList.size() - 1;
                }
                int min_index = 0;
                int min_value = arrayList.get(0);
                for (int i = 1; i <= end; i++) {
                    if (arrayList.get(i) < min_value) {
                        min_index = i;
                        min_value = arrayList.get(i);
                    }
                }
                steps_left -= min_index;
                System.out.print(arrayList.get(min_index) + " ");
                arrayList.remove(arrayList.get(min_index));
            }// end of while

            for (int i = 0; i < arrayList.size(); i++) {
                System.out.print(arrayList.get(i) + " ");
            }
            System.out.println();
        }
    }
}


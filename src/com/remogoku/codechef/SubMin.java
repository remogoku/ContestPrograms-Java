package com.remogoku.codechef;

import java.util.Scanner;

/**
 * Created by Raj on 10/19/14.
 */
public class SubMin {
    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int k = sc.nextInt();

            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == k)
                    count++;
            }

            int ans = 0;
            //while(count-->0){
            for (int j = 0; j < n; j++) {
                if (arr[j] == k) {
                    //System.out.println(k+" occured at "+ j);
                    int l = j;
                    int r = j;
                    while (l >= 1) {
                        if (k >= arr[l - 1])
                            break;
                        l--;
                    }
                    while (r < n - 1) {
                        if (arr[r + 1] < k)
                            break;
                        r++;
                    }
                    //System.out.println("range of subarray : "+l+" to "+r);
                    //System.out.println("temp ans :"+ (j-l+1)*(r-j+1));
                    ans += (j - l + 1) * (r - j + 1);
                    //break;
                }
            }
            //}
            System.out.println(ans);
        }
    }

}
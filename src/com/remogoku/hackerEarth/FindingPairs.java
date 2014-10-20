package com.remogoku.hackerEarth;

import java.util.Scanner;

/**
 * Created by Raj on 10/19/14.
 */
public class FindingPairs {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            if(s.contains("101") || s.contains("010")){
                System.out.println("Good");
            }else{
                System.out.println("Bad");
            }
        }
    }

}

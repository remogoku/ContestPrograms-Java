package com.remogoku.hackerEarth;

import java.util.Scanner;

/**
 * Created by Raj on 10/20/14.
 */
public class GameOfBots {
    public static void main(String args[] ) throws Exception {
      Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        boolean flag = true;
        while(t-->0){
            String s = sc.next(); //initialString.toString();
            String s2 = sc.next(); //finalString.toString();

            if(s.replace("#", "").equals(s2.replace("#","")))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}

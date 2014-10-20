package com.remogoku.hackerEarth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Raj on 10/20/14.
 */
public class BigPandPunishment {
    public static int noOfStudentsSitDown;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int f = sc.nextInt();
            int s = sc.nextInt();
            HashMap<Integer, Student> hmStudent = new HashMap<Integer, Student>();

            for (int i = 0; i < n; i++) {
                hmStudent.put(i + 1, new Student(i + 1));
            }

            for (int i = 0; i < f; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                hmStudent.get(b).addFriend(hmStudent.get(a));
            }
            int slaps[] = new int[s];
            noOfStudentsSitDown = 0;

            for (int i = 0; i < s; i++) {
                slaps[i] = sc.nextInt();
                Student st = hmStudent.get(slaps[i]);
                if (!st.isCommon) {
                    st.isCommon = true;
                    noOfStudentsSitDown++;
                    solveRecurs(st);
                }
            }
            System.out.println(noOfStudentsSitDown);
        }
        sc.close();
    }

    public static void solveRecurs(Student student) {
        for (Student s : student.friendsList) {
            if (!s.isCommon) {
                s.isCommon = true;
                noOfStudentsSitDown++;
                solveRecurs(s);
            }
        }
    }
}

class Student {
    public int id;
    public ArrayList<Student> friendsList;
    public boolean isCommon;

    Student(int id) {
        this.id = id;
        friendsList = new ArrayList<Student>();
        isCommon = false;
    }

    public void addFriend(Student student) {
        friendsList.add(student);
    }
}


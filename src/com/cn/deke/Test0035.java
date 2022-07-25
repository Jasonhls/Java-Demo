package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Test0035 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] s1 = s.split(" ");
        int numA = Integer.parseInt(s1[0]);
        int numB = Integer.parseInt(s1[1]);
        int r = Integer.parseInt(s1[2]);
        String[] arr1 = br.readLine().split(" ");
        String[] arr2 = br.readLine().split(" ");
        for (int i = 0; i < numA; i++) {
            for (int j = 0; j < numB; j++) {
                int a = Integer.parseInt(arr1[i]);
                int b = Integer.parseInt(arr2[j]);
                if(a <= b && b - a <= r) {
                    System.out.println(a + " " + b);
                    break;
                }
            }
        }

    }
}

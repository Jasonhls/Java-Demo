package com.cn;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author: helisen
 * @Date 2022/6/27 12:24
 * @Description:
 */
public class Test83 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String s1 = br.readLine();
            if(s1 == null || s1 == "") {
                break;
            }
            String s2 = br.readLine();
            String s3 = br.readLine();
            String s4 = br.readLine();
            String s5 = br.readLine();
            String[] arr1 = s1.split(" ");
            boolean flag = true;
            for (int i = 0; i < arr1.length; i++) {
                int a = Integer.parseInt(arr1[i]);
                if(a < 1 || a > 9) {
                    flag = false;
                    break;
                }
            }
            if(!flag) {
                System.out.println(-1);
                System.out.println(-1);
                System.out.println(-1);
                System.out.println(-1);
                System.out.println(-1);
                return;
            }else {
                System.out.println(0);
            }
            Integer m = Integer.parseInt(arr1[0]);
            Integer n = Integer.parseInt(arr1[1]);

            String[] arr2 = s2.split(" ");
            int a1 = Integer.parseInt(arr2[0]);
            int b1 = Integer.parseInt(arr2[1]);
            int a2 = Integer.parseInt(arr2[2]);
            int b2 = Integer.parseInt(arr2[3]);

            if(a1 < 0 || a1 > m - 1 || b1 < 0 || b1 > n - 1 || a2 < 0 || a2 > m - 1 || b2 < 0 || b2 > n - 1) {
                System.out.println(-1);
            }else {
                System.out.println(0);
            }

            int addM = Integer.parseInt(s3);
            if(addM > m - 1) {
                System.out.println(-1);
            }else {
                System.out.println(0);
            }

            int addN = Integer.parseInt(s4);
            if(addN > n - 1 || n == 9) {
                System.out.println(-1);
            }else {
                System.out.println(0);
            }

            String[] arr5 = s5.split(" ");
            int m5 = Integer.parseInt(arr5[0]);
            int n5 = Integer.parseInt(arr5[1]);
            if(m5 > m - 1 || n5 > n - 1) {
                System.out.println(-1);
            }else {
                System.out.println(0);
            }

        }

    }
}

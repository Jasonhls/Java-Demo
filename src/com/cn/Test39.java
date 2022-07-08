package com.cn;

/**
 * @Author: helisen
 * @Date 2022/6/1 9:47
 * @Description:
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Test39 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        String s3 = br.readLine();
        String[] split1 = s1.split("\\.");
        boolean b = true;
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < split1.length; i++) {
            int i1 = Integer.parseInt(split1[i]);
            if(i1 < 0 || i1 > 255) {
                b = false;
                break;
            }
            String s = Integer.toBinaryString(i1);
            if(s.length() < 8) {
                StringBuilder ss1 = new StringBuilder();
                ss1.append("00000000").append(s);
                String str1 = ss1.toString();
                sb1.append(str1.substring(str1.length() - 8));
            }else {
                sb1.append(s);
            }

        }
        String sss1 = sb1.toString();
        if(sss1.contains("01")) {
            b = false;
        }
        if(!b) {
            System.out.println(1);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        String[] split2 = s2.split("\\.");
        for (int i = 0; i < split2.length; i++) {
            int i1 = Integer.parseInt(split2[i]);
            if(i1 < 0 || i1 > 255) {
                b = false;
                break;
            }
            String s = Integer.toBinaryString(i1);
            if(s.length() < 8) {
                StringBuilder ss2 = new StringBuilder();
                ss2.append("00000000").append(s);
                String str2 = ss2.toString();
                sb2.append(str2.substring(str2.length() - 8));
            }else {
                sb2.append(s);
            }
        }
        if(!b) {
            System.out.println(1);
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        String[] split3 = s3.split("\\.");
        for (int i = 0; i < split3.length; i++) {
            int i1 = Integer.parseInt(split3[i]);
            if(i1 < 0 || i1 > 255) {
                b = false;
                break;
            }
            String s = Integer.toBinaryString(i1);
            if(s.length() < 8) {
                StringBuilder ss3 = new StringBuilder();
                ss3.append("00000000").append(s);
                String str2 = ss3.toString();
                sb3.append(str2.substring(str2.length() - 8));
            }else {
                sb3.append(s);
            }
        }

        if(!b) {
            System.out.println(1);
            return;
        }

        String a = sb1.toString();
        String bb = sb2.toString();
        String cc = sb3.toString();
        long m = Long.parseLong(bb, 2) & Long.parseLong(a, 2);
        long n = Long.parseLong(cc, 2) & Long.parseLong(a, 2);
        if(m == n) {
            System.out.println(0);
        }else {
            System.out.println(2);
        }
    }
}

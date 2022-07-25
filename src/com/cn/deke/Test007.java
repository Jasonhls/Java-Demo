package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test007 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] s1 = s.split(" ");
        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int startt = start >= 0 ? start : 0;
        int endd = end < s1.length ? end : s1.length;
        for (int i = 0; i < s1.length; i++) {
            if(i < startt || i >= endd) {
                sb.append(s1[i]).append(" ");
            }
        }
        for (int i = endd - 1; i >= startt; i--) {
            sb.append(s1[i]).append(" ");
        }
        System.out.println(sb);

    }






}

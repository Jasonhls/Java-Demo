package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test0054 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] s1 = s.split(" ");
        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());
        if(start == end || start > s1.length - 1 || end < 0) {
            System.out.println("EMPTY");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s1.length; i++) {
            if(i < start || i > end) {
                sb.append(s1[i]).append(" ");
            }else {
                sb.append(s1[end - i + start]).append(" ");
            }
        }
        System.out.println(sb.toString().trim());
    }
}

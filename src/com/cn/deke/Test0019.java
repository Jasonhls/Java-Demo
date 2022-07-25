package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test0019 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] chars = s.toCharArray();
        int[] arr = new int[200];
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            int m = (int)c;
            arr[m]++;
        }
        int min = chars.length;
        for (int i = 0; i < 200; i++) {
            int a = arr[i];
            if(a == 0) {
                continue;
            }
            if(min > a) {
                min = a;
            }
        }

        Set<Character> set = new HashSet<>();
        for (int i = 0; i < 200; i++) {
            int a = arr[i];
            if(a == 0) {
                continue;
            }
            if(a != min) {
                char c = (char) i;
                set.add(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if(set.contains(c)) {
                sb.append(c);
            }
        }
        if(sb.length() > 1) {
            System.out.println(sb);
        }else {
            System.out.println("empty");
        }
    }
}

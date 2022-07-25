package com.cn.deke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Test0041 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        int k = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        Set<String> a = a(3);
        System.out.println(a);
    }

    public static Set<String> a(int n) {
        if(n == 2) {
            Set<String> set = new HashSet<>();
            set.add("12");
            set.add("21");
            return set;
        }
        Set<String> ss = a(n - 1);
        Set<String> newSet = new HashSet<>();
        for (String str : ss) {
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                char[] cc = new char[chars.length + 1];
                cc[i] = '0';//跳过
                for (int j = 0; j < chars.length; j++) {
                    if(j < i) {
                        cc[j] = chars[j];
                    }else if(j > i) {
                        cc[j + 1] = chars[j];
                    }
                }
                newSet.add(cc.toString());
            }
        }
        return newSet;
    }
}
